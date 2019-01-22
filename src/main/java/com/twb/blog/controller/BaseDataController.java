package com.twb.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twb.blog.domain.Imgs;
import com.twb.blog.domain.Tags;
import com.twb.blog.service.ImgService;
import com.twb.blog.service.TagService;

@RestController
@RequestMapping(value = "/base")
public class BaseDataController {

	@Autowired
	private TagService tagService;

	@Autowired
	private ImgService imgService;

	@RequestMapping(value = "/tags", method = RequestMethod.GET)
	public List<Tags> getAllTags() {
		return tagService.getAllTags();
	}

	@RequestMapping(value = "/imgs/{pageSize}/{pageIndex}", method = RequestMethod.GET)
	public List<Imgs> getImgsByPage(@PathVariable(value = "pageSize") Integer pageSize,
			@PathVariable(value = "pageIndex") Integer pageIndex) {
		return imgService.getAll(pageIndex, pageSize);
	}

	@RequestMapping(value = "/imgs/{id}", method = RequestMethod.GET)
	public List<Imgs> getImgById(@PathVariable(value = "id") Integer id) {
		return imgService.getImgById(id);
	}
}
