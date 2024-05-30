package com.fastcampus.sns.exception;

import com.fastcampus.sns.controller.response.Response;
import com.fastcampus.sns.controller.response.UserJoinResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(SnsApplicationException.class)
    public ResponseEntity<?> errorHandler(SnsApplicationException e) {
        return ResponseEntity.status(e.getErrorCode().getStatus())
                .body(Response.error(e.getErrorCode().name()));
    }
}
