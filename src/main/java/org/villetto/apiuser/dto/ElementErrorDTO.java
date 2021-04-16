package org.villetto.apiuser.dto;

import java.io.Serializable;

public class ElementErrorDTO implements Serializable {

    private static final long serialVersionUID = -1734673904839904856L;

    private String code;
    private String message;

    public ElementErrorDTO() {
    }

    public ElementErrorDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
