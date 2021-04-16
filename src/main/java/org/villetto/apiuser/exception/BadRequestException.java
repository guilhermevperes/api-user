package org.villetto.apiuser.exception;

import org.villetto.apiuser.dto.ElementErrorDTO;
import org.villetto.apiuser.dto.response.ResponseDTO;

import java.io.Serializable;
import java.util.List;

public class BadRequestException extends Exception  implements Serializable {

    private static final long serialVersionUID = 7534365473033359739L;

    private ResponseDTO responseDTO;

   public BadRequestException(ResponseDTO responseDTO) {
       this.responseDTO = responseDTO;
   }

    public ResponseDTO getResponseDTO() {
        return responseDTO;
    }
}
