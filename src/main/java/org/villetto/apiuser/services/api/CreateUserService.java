package org.villetto.apiuser.services.api;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.entities.UserEntity;

public interface CreateUserService {

    ResponseDTO execute(HttpServerRequest request, CreateUserDTO dto);

}
