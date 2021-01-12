package com.learn.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.jee.UserValidationService;

@Controller
public class LoginController {
	
	@Autowired
	private UserValidationService UserValidationService;
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name,
									 @RequestParam String pwd ,ModelMap modelMap) {
		if(UserValidationService.isValid(name, pwd)) {
			modelMap.put("name", name);
			return "Welcome";
		}else {
			modelMap.put("errormsg", "Invalid Credentials");
			return "login";
		}
	
	}
	
}