package com.twb.blog.service;

import java.util.List;

import com.twb.blog.domain.Tags;

public interface TagService {
	Tags getTags(Integer id);

	List<Tags> getAllTags();

	Integer deleteTags(Integer id);

	Integer updateTags(Tags tag);

	Integer insert(Tags tag);

}
