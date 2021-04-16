package org.villetto.apiuser.dto.response;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

    private static final long serialVersionUID = 4630108208991031569L;

    private Boolean status;
    private String json;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
