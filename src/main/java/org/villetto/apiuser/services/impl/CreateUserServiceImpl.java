package org.villetto.apiuser.services.impl;

import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.json.JsonObject;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.services.validations.CreateUserValidation;
import org.villetto.apiuser.to.request.CreateUserTO;
import org.villetto.apiuser.to.response.ResponseTO;
import org.villetto.apiuser.services.api.CreateUserService;
import org.villetto.apiuser.services.api.MessagePropertiesService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreateUserServiceImpl implements CreateUserService {

    @Inject
    MessagePropertiesService messagePropertiesService;

    @Inject
    CreateUserValidation createUserValidation;

    @Override
    public ResponseTO execute(HttpServerRequest request, CreateUserTO to) throws UserException {
        createUserValidation.isValid(to);

        ResponseTO response = new ResponseTO();
        JsonObject json = JsonObject.mapFrom(to);
        response.setJson(json.toString());
        response.setStatus(true);
        return response;
    }
}
