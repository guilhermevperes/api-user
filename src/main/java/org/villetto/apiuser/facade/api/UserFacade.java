package org.villetto.apiuser.facade.api;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.entities.UserEntity;

import java.util.List;

public interface UserFacade {

    public List<UserEntity> findAllUsers(HttpServerRequest request, Integer page, Integer size);

    public ResponseDTO createUser(HttpServerRequest request, CreateUserDTO dto);

}
