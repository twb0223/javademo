package com.twb.blog.service;

import java.util.List;

import com.twb.blog.domain.Imgs;

public interface ImgService {
	List<Imgs> getAll(Integer pageIndex,Integer pageSize);

	List<Imgs> getImgById(Integer id);
}
