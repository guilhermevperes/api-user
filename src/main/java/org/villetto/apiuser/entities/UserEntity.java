package org.villetto.apiuser.entities;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

public class UserEntity extends PanacheMongoEntity {

    private ObjectId _id;
    private String name;
    private String email;



}
