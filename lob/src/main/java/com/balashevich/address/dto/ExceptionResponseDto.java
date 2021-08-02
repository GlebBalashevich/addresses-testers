package com.balashevich.address.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponseDto {

    private Instant timestamp;

    private String error;

    private String code;

    private String message;

    private String trace;

    private String path;
}
