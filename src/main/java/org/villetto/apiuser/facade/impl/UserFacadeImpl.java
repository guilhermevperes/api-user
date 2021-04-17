package org.villetto.apiuser.facade.impl;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.to.request.CreateUserTO;
import org.villetto.apiuser.to.response.ResponseTO;
import org.villetto.apiuser.facade.api.UserFacade;
import org.villetto.apiuser.services.api.CreateUserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UserFacadeImpl implements UserFacade {

    @Inject
    private CreateUserService createUserService;

    @Override
    public ResponseTO createUser(HttpServerRequest request, CreateUserTO dto) throws UserException {
        return createUserService.execute(request, dto);
    }
}
