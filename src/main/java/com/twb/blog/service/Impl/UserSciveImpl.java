package com.twb.blog.service.Impl;

import com.twb.blog.dao.UserMapper;
import com.twb.blog.domain.User;
import com.twb.blog.domain.UserArticleDto;
import com.twb.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSciveImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Override
	public User getUser(Integer id) {
		User user = (User) redisTemplate.opsForValue().get("user_" + id);
		if (user == null) {
			user = userMapper.selectByPrimaryKey(id);
			redisTemplate.opsForValue().set("user_" + id, user);
		}
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userMapper.getAll();
		return list;
	}

	@Override
	public List<UserArticleDto> getUserArticles(Integer id) {
		return userMapper.getUserArticles(id);
	}

	@Override
	public Integer deleteUser(Integer id) {
		return userMapper.deleteByPrimaryKey(id);

	}

	@Override
	public Integer updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public Integer insert(User user) {
		return userMapper.insert(user);
	}
	
}
