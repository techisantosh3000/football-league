package com.santosh.advice;

import com.santosh.exception.BadRequestException;
import com.santosh.exception.RestApiError;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler{
	
	private static final Logger log = LoggerFactory.getLogger(ExceptionControllerAdvice.class);
	
	 @ExceptionHandler({BadRequestException.class})
	  public ResponseEntity<RestApiError> handleBadRequestException(Exception ex) {
		 log.error("Exception caught: ", ex);
		    return new ResponseEntity<>(new RestApiError(HttpStatus.BAD_REQUEST, ex.getMessage()),
		        HttpStatus.BAD_REQUEST);
	  }

	  @ExceptionHandler({Exception.class, HttpClientErrorException.class})
	  public ResponseEntity<RestApiError> handleException(Exception ex) {
	    log.error("Exception caught: ", ex);
	    return new ResponseEntity<>(new RestApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	  }
}
