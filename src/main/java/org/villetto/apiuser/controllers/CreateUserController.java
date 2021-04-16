package org.villetto.apiuser.controllers;

import io.vertx.core.http.HttpServerRequest;
import org.villetto.apiuser.dto.request.CreateUserDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.facade.api.UserFacade;

import javax.inject.Inject;
import javax.validation.Valid;
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
    public Response handle(@Context HttpServerRequest request, @Valid CreateUserDTO dto) {
        ResponseDTO responseDTO = facade.createUser(request, dto);
        return Response.ok(responseDTO).build();
    }

}
