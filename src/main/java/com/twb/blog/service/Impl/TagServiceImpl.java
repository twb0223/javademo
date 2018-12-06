package com.twb.blog.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twb.blog.dao.TagsMapper;
import com.twb.blog.domain.Tags;
import com.twb.blog.service.TagService;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private TagsMapper tagsMapper;
	@Override
	public Tags getTags(Integer id) {
		
		return tagsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Tags> getAllTags() {
		
		return tagsMapper.selectAll();
	}

	@Override
	public Integer deleteTags(Integer id) {
		return tagsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer updateTags(Tags tag) {
		return tagsMapper.updateByPrimaryKey(tag);
	}

	@Override
	public Integer insert(Tags tag) {
		return tagsMapper.insert(tag);
	}

}
