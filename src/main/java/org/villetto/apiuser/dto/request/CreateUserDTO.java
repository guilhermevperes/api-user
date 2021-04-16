package org.villetto.apiuser.dto.request;

import org.villetto.apiuser.services.validations.CreateUser;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@CreateUser
public class CreateUserDTO implements Serializable {

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
