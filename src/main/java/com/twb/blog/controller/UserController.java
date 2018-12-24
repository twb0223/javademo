package com.twb.blog.controller;

import com.twb.blog.domain.User;
import com.twb.blog.domain.UserArticleDto;
import com.twb.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public User showUserById(@PathVariable(value = "id") Integer id) {
		return userService.getUser(id);
	}

	@RequestMapping(value = "/",method= RequestMethod.GET)
	public List<User> showAllUsers(){
		return userService.getAllUser();
	}
	
	@RequestMapping(value = "/{id}/article", method = RequestMethod.GET)
	public List<UserArticleDto> getUserArticles(@PathVariable(value="id") Integer id) {
		return userService.getUserArticles(id);
	}
	@RequestMapping(value="/",method=RequestMethod.PUT)
	public int updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public int createUser(@RequestBody User user) {
		return userService.insert(user);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public int deleteUser(@PathVariable(value="id") Integer id) {
		return userService.deleteUser(id);
	}    
   

}
