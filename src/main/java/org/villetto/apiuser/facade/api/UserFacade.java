package org.villetto.apiuser.facade.api;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.to.request.CreateUserTO;
import org.villetto.apiuser.to.response.ResponseTO;

public interface UserFacade {
    ResponseTO createUser(HttpServerRequest request, CreateUserTO dto) throws UserException;
}
