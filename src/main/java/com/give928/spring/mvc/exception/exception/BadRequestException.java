package com.give928.spring.mvc.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "잘못된 요청 오류")
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "error.bad") // http GET 'localhost:8080/api/response-status-ex1?message=' --json
public class BadRequestException extends RuntimeException {
}
