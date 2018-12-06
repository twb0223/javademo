package com.twb.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twb.blog.domain.Tags;
import com.twb.blog.service.TagService;

@RestController
@RequestMapping(value = "/api/base")
public class BaseDataController {
	
	@Autowired
	private TagService tagService;
	  @RequestMapping(value = "/tags",method = RequestMethod.GET)
	    public List<Tags> getAllTags(){
	        return tagService.getAllTags();
	    }
}
