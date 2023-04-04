package com.dailynovel.web.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user/")
@Controller
public class UserController {

	@RequestMapping("login")
	public String login() {
		return "/user/login";
	}

	@RequestMapping("signup")
	public String signUp() {
		return "/user/signup";
	}
}
