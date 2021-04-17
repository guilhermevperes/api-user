package org.villetto.apiuser.exception.handler;


import io.vertx.core.json.JsonObject;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.to.response.ResponseTO;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UserExceptionHandler implements ExceptionMapper<UserException> {


    @Override
    public Response toResponse(UserException e) {
        JsonObject error = new JsonObject();
        error.put("code", e.getCode());
        error.put("message", e.getMessage());

        ResponseTO responseTO = new ResponseTO();
        responseTO.setJson(error.toString());
        return Response.status(Response.Status.BAD_REQUEST).entity(responseTO).build();
    }
}
