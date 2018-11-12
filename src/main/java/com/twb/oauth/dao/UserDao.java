package com.twb.oauth.dao;

import com.twb.oauth.domain.User;
import com.twb.oauth.domain.UserArticleDto;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {

    @Select("Select * from User where id=#{id}")
    User get(int id);

    @Select("Select * from User")
    List<User> getAll();


    @Select("select u.id,u.username,a.id as articleid, a.title,u.email,a.mdContent from user u left join article a on a.uid = u.id")
    @Results({
            @Result(id=true,property="userId",column="id"),
            @Result(property="email" ,column="email"),
            @Result(property="userName" ,column="username"),
            @Result(property="article.id" ,column="articleid"),
            @Result(property="article.title",column="title"),
            @Result(property="article.mdcontent",column="mdContent"),
    })
    List<UserArticleDto> getUserArticles();

}
