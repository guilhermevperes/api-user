package org.villetto.apiuser.controllers;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.exception.custom.UserException;
import org.villetto.apiuser.facade.api.UserFacade;
import org.villetto.apiuser.to.request.CreateUserTO;
import org.villetto.apiuser.to.response.ResponseTO;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class CreateUserController {

    @Inject
    private UserFacade facade;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle(@Context HttpServerRequest request, CreateUserTO dto) throws UserException {
        ResponseTO responseTO = facade.createUser(request, dto);
        return Response.ok(responseTO).build();
    }

}
