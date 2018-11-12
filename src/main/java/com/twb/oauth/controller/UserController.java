package com.twb.oauth.controller;

import com.twb.oauth.domain.User;
import com.twb.oauth.domain.UserArticleDto;
import com.twb.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public User showDao(@PathVariable(value = "id") int id) {
		return userService.getUser(id);
	}

	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<User> showUsers(){
		return userService.getAllUser();
	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public List<UserArticleDto> getUserArticles() {
		return userService.getUserArticles();
	}
}
