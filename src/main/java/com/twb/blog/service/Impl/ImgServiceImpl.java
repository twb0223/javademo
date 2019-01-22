package com.twb.blog.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twb.blog.dao.ImgsMapper;
import com.twb.blog.domain.Imgs;
import com.twb.blog.service.ImgService;

@Service
public class ImgServiceImpl implements ImgService {

	@Autowired
	private ImgsMapper imgsMapper;

	@Override
	public List<Imgs> getAll(Integer pageIndex,Integer pageSize) {

		return imgsMapper.getAll(pageIndex,pageSize);
	}

	@Override
	public List<Imgs> getImgById(Integer id) {
		// TODO Auto-generated method stub
		return imgsMapper.getImgById(id);
	}

}
