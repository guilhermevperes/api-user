package org.villetto.apiuser.dto;

import java.io.Serializable;
import java.util.HashMap;

public class HttpResponseDTO implements Serializable {

    private static final long serialVersionUID = 4630108208991031569L;

    private HashMap<String, String> headers;
    private Object body;

    public HashMap<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
