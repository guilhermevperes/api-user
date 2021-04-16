package org.villetto.apiuser.services.validations;

import joptsimple.internal.Strings;
import org.villetto.apiuser.constants.ExceptionConstants;
import org.villetto.apiuser.dto.ElementErrorDTO;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.services.api.MessagePropertiesService;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateUserValidation implements ConstraintValidator<CreateUser, CreateUserDTO> {

    @Inject
    MessagePropertiesService messagePropertiesService;

    @Override
    public boolean isValid(CreateUserDTO dto, ConstraintValidatorContext constraintValidatorContext) {

        List<ElementErrorDTO> errors = new ArrayList<>();

        Map<String, Object> fields = new HashMap<>();

        fields.put("name", dto.getName());
        fields.put("email", dto.getEmail());

        fields.forEach((key, value) -> {
            if(Strings.isNullOrEmpty((String) value)) {
                errors.add(
                        new ElementErrorDTO(ExceptionConstants.API_ERROR_REQUIRED_FIELDS,
                                MessageFormat.format(messagePropertiesService
                                        .getMessageValue(ExceptionConstants.API_ERROR_REQUIRED_FIELDS), key)));
            }
        });

        for (ElementErrorDTO e : errors) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(e.getCode().concat("/").concat(e.getMessage())).addPropertyNode(e.getMessage())
                    .addConstraintViolation();
        }

        return errors.isEmpty();
    }
}
