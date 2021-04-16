package org.villetto.apiuser.services.impl;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.constants.ExceptionConstants;
import org.villetto.apiuser.dto.ElementErrorDTO;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.entities.UserEntity;
import org.villetto.apiuser.services.api.CreateUserService;
import org.villetto.apiuser.services.api.MessagePropertiesService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import java.text.MessageFormat;
import java.util.Collections;

@ApplicationScoped
public class CreateUserServiceImpl implements CreateUserService {

    @Inject
    MessagePropertiesService messagePropertiesService;

    @Override
    public ResponseDTO execute(HttpServerRequest request, CreateUserDTO dto) {


        return new ResponseDTO();
    }
}
