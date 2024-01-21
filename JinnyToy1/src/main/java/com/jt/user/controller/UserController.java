package com.jt.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	// 메인페이지 들어가기
	// http://localhost:8088/user/mainpage
	
	
	
	
	//메인페이지 호출 GET
	@RequestMapping(value="/mainpage",method=RequestMethod.GET)
	public void mainpage() {		
		logger.debug("메인페이지 GET 호출!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
