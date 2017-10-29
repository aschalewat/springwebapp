package com.aschalew.springwebapp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.aschalew.model.User;

@Controller
@Api(value="This is the Home controller")
public class HomeController {

	@RequestMapping(value= "/pageone.html", method = RequestMethod.GET)	
	@ApiOperation(value="Gets page one")
	public ModelAndView givePage1(){
		ModelAndView modelAndView = new ModelAndView("page1");
		modelAndView.addObject("msg1","This is the first message");
		return modelAndView;
		
	}
	@RequestMapping(value= "/pagetwo.html", method = RequestMethod.GET)	
	@ApiOperation(value="Gets page two")
	public ModelAndView givePage2(){
		ModelAndView modelAndView = new ModelAndView("page2");
		modelAndView.addObject("msg2","This is the second message");
		return modelAndView;
		
	}
	
	
	@RequestMapping(value = "/users" , method = RequestMethod.POST )
	@ApiOperation(value ="creates a user")
	public boolean createUser(@RequestBody User user){
		return false;
	}


}
