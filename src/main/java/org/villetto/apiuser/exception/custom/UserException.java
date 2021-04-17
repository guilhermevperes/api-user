package org.villetto.apiuser.exception.custom;

public class UserException extends Exception {
    private String code;

    public UserException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public UserException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
