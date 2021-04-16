package org.villetto.apiuser.exception.handler;


import io.vertx.core.json.JsonObject;
import org.villetto.apiuser.dto.ElementErrorDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;
import org.villetto.apiuser.exception.BadRequestException;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.*;

@Provider
public class BadRequestExceptionHandler implements ExceptionMapper<ConstraintViolationException> {


    @Override
    public Response toResponse(ConstraintViolationException e) {
        List<ElementErrorDTO> errors = new ArrayList<>();
        e.getConstraintViolations().stream().forEach(err -> {
            ElementErrorDTO errorDTO = new ElementErrorDTO();
            errorDTO.setCode(err.getMessage().split("/")[0]);
            errorDTO.setMessage(err.getMessage().split("/")[1]);
            errors.add(errorDTO);
            System.out.println(err.getMessage());
        });
        JsonObject responseJson = new JsonObject();
        responseJson.put("errors", errors);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(false);
        responseDTO.setJson(responseJson.toString());
        return Response.status(Response.Status.BAD_REQUEST).entity(responseJson).build();
    }

    private ResponseDTO extractResponseError(BadRequestException e) {
        ResponseDTO out;
        if (e.getResponseDTO() != null) {
            out = e.getResponseDTO();
        } else {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
            ElementErrorDTO elementErrorTO = new ElementErrorDTO();
            elementErrorTO.setCode(e.getMessage());
            elementErrorTO.setMessage(resourceBundle.getString(e.getMessage()));
            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setStatus(false);
            responseDTO.setJson(Arrays.asList(elementErrorTO).toString());
            out = responseDTO;
        }
        return out;
    }

}
