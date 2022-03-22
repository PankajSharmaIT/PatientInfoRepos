package com.Hospital.Patient_Info.globalException;

import java.sql.SQLSyntaxErrorException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javassist.NotFoundException;

//@Controller
@ControllerAdvice
public class ExceptionHandlerController  extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = NullPointerException.class)
	public Object nullPointer(Model model) {
		model.addAttribute("errMsg", "No value is  find in the database  for the given input");
		return "errMsg";
	}

	@ExceptionHandler(value = NotFoundException.class)
	public Object notFound(Model model) {
		model.addAttribute("errMsg", "Record not found in the database, please try with valid id ");
		return "errMsg";
	}

	@ExceptionHandler(value = InternalServerError.class)
	public Object internalServer(Model model) {
		model.addAttribute("errMsg",
				"unable to proceed your request now , due to some error at server.Please try after sometime ");
		return "errMsg";
	}

	@ExceptionHandler(value = SQLSyntaxErrorException.class)
	public Object sqlQuerySyntax(Model model) {
		model.addAttribute("errMsg", "please check and correct your sql syntax, to get desired result");
		return "errMsg";
	}
	
/*	@ExceptionHandler()
	public String emptyInput(Model model) {
		model.addAttribute("errMsg", "");
		return "errMsg";
	}
	*/
	

}
