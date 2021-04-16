package org.villetto.apiuser.controllers;


import io.vertx.core.http.HttpServerRequest;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.villetto.apiuser.entities.UserEntity;
import org.villetto.apiuser.facade.api.UserFacade;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
public class FindAllUsersController {

    @Inject
    private UserFacade facade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response handle(@Context  HttpServerRequest request, @QueryParam("page") Integer page,  @QueryParam("size") @NotEmpty String size) {
//        List<UserEntity> response = facade.findAllUsers(request, page, size);
        return Response.ok().build();
    }

}
