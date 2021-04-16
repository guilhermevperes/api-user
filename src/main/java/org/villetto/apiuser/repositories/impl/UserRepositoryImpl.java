package org.villetto.apiuser.repositories.impl;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.mongodb.panache.PanacheQuery;
import io.quarkus.panache.common.Page;
import org.villetto.apiuser.entities.UserEntity;
import org.villetto.apiuser.repositories.api.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class UserRepositoryImpl implements PanacheMongoRepository<UserEntity>, UserRepository {

    public List<UserEntity> findAllUsers(Integer paged, Integer size) {
        return findAll().page(Page.of(paged, size)).list();
    };
}
