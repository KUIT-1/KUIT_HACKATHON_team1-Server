package kuit.hackathon.starbucks.controller.advice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice(annotations = RestController.class)
@Slf4j
public class ExceptionController {
    @ExceptionHandler
    public ResponseEntity<ErrorResult> ex(IllegalArgumentException ex){
        log.info("23123");
                return new ResponseEntity<>(new ErrorResult("404" ,ex.getMessage()), HttpStatusCode.valueOf(404));
    }

    @Getter
    @AllArgsConstructor
    class ErrorResult {
        private String code;
        private String message;
    }
}
