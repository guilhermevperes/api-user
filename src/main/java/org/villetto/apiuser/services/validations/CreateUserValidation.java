package org.villetto.apiuser.services.validations;

import joptsimple.internal.Strings;
import org.villetto.apiuser.constants.ExceptionConstants;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.services.api.MessagePropertiesService;
import org.villetto.apiuser.to.request.CreateUserTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CreateUserValidation {

    @Inject
    MessagePropertiesService messagePropertiesService;

    public void isValid(CreateUserTO to) throws UserException {
        Map<String, Object> fields = new HashMap<>();

        fields.put("name", to.getName());
        fields.put("email", to.getEmail());

        for(Map.Entry<String, Object> entry : fields.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if(Strings.isNullOrEmpty((String) value)) {
                UserException e = new UserException(ExceptionConstants.API_ERROR_REQUIRED_FIELDS,
                        MessageFormat.format(messagePropertiesService
                                .getMessageValue(ExceptionConstants.API_ERROR_REQUIRED_FIELDS), key));
                throw e;
            }
        }
    }
}
