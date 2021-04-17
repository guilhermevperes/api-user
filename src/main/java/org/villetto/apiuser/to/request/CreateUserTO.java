package org.villetto.apiuser.to.request;

import java.io.Serializable;

public class CreateUserTO implements Serializable {

    private static final long serialVersionUID = -5310080447811222450L;

    private String name;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
