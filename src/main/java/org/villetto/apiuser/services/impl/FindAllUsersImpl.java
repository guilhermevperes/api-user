package org.villetto.apiuser.services.impl;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.entities.UserEntity;
import org.villetto.apiuser.repositories.api.UserRepository;
import org.villetto.apiuser.services.api.FindAllUsersService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class FindAllUsersImpl implements FindAllUsersService {

    @Inject
    private UserRepository userRepository;

    @Override
    public List<UserEntity> execute(HttpServerRequest request, Integer page, Integer size) {
        return userRepository.findAllUsers(page, size);
    }
}
