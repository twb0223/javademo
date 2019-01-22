package com.twb.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.twb.blog.domain.Imgs;

@Repository
public interface ImgsMapper {
	
	@Select("Select * from imgs where id=#{id}")
	List<Imgs> getImgById(Integer id);

	@Select("Select * from imgs order by id limit #{pageIndex},#{pageSize}")
	List<Imgs> getAll(Integer pageIndex,Integer pageSize);
}
