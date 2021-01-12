package com.learn.jee;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean isValid(String name,String pwd) {
		if(name.equals("Vipul")&&pwd.equals("admin"))
			return true;
		return false;
	}
}
