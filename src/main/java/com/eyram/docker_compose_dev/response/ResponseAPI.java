package com.eyram.docker_compose_dev.response;

import lombok.Data;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Data
public class ResponseAPI {
    private String message;
    private Object body;
}
