package org.villetto.apiuser.repositories.api;

import org.villetto.apiuser.entities.UserEntity;

import java.util.List;

public interface UserRepository {

    public List<UserEntity> findAllUsers(Integer page, Integer size);

}
