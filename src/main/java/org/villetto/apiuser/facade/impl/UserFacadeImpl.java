package org.villetto.apiuser.facade.impl;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.entities.UserEntity;
import org.villetto.apiuser.facade.api.UserFacade;
import org.villetto.apiuser.services.api.CreateUserService;
import org.villetto.apiuser.services.api.FindAllUsersService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserFacadeImpl implements UserFacade {

    @Inject
    private FindAllUsersService findAllUsersService;

    @Inject
    private CreateUserService createUserService;

    @Override
    public List<UserEntity> findAllUsers(HttpServerRequest request, Integer page, Integer size) {
        return findAllUsersService.execute(request, page, size);
    }

    @Override
    public ResponseDTO createUser(HttpServerRequest request, CreateUserDTO dto) {
        return createUserService.execute(request, dto);
    }
}
