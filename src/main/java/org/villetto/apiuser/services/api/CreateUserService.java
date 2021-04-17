package org.villetto.apiuser.services.api;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.to.request.CreateUserTO;
import org.villetto.apiuser.to.response.ResponseTO;

public interface CreateUserService {

    ResponseTO execute(HttpServerRequest request, CreateUserTO dto) throws UserException;

}
