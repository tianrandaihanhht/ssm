package com.stx.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MyException.class)
    public ModelAndView handlerMyException(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(e.getMessage());
        modelAndView.addObject("mess",e.getMessage());
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }

}
