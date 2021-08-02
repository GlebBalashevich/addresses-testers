package com.balashevich.address.handler;

import java.time.Instant;
import java.util.Arrays;

import com.balashevich.address.dto.ExceptionResponseDto;
import com.balashevich.address.exception.LobException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class LobExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(LobException.class)
    public ResponseEntity<Object> handleLobException(LobException ex, WebRequest request) {
        String path = path(request);

        var status = ex.getHttpStatus();

        return new ResponseEntity<>(
                ExceptionResponseDto.builder()
                        .timestamp(Instant.now())
                        .error(status.getReasonPhrase())
                        .code(ex.getErrorCode())
                        .message(ex.getMessage())
                        .trace(Arrays.toString(ex.getStackTrace()))
                        .path(path)
                        .build(),
                status);
    }

    private String path(WebRequest request) {
        return request.getDescription(false).replace("uri=", "");
    }

}
