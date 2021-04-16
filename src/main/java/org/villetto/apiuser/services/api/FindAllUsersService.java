package org.villetto.apiuser.services.api;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.entities.UserEntity;

import java.util.List;


public interface FindAllUsersService {

    List<UserEntity> execute(HttpServerRequest request, Integer page, Integer size);

}
