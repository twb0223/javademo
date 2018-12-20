package com.twb.blog.dao;

import com.twb.blog.domain.User;
import com.twb.blog.domain.UserArticleDto;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectAll();

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    @Select("Select * from User where id=#{id}")
    User getUser(int id);

    @Select("Select * from User")
    List<User> getAll();


    @Select("select u.id,u.username,a.id as articleid, a.title,u.email,a.mdContent from user u left join article a on a.uid = u.id where u.id=#{id}")
    @Results({
            @Result(id=true,property="userId",column="id"),
            @Result(property="email" ,column="email"),
            @Result(property="userName" ,column="username"),
            @Result(property="article.id" ,column="articleid"),
            @Result(property="article.title",column="title"),
            @Result(property="article.mdcontent",column="mdContent"),
    })
    List<UserArticleDto> getUserArticles(Integer id);

    @Select("select * from user where username=#{username}")
	User getUserByName(String username);
}