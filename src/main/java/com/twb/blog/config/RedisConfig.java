package com.twb.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	@Bean("redisTemplate")
	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
		
		RedisTemplate<String, Object> template=new RedisTemplate<>();
		
		Jackson2JsonRedisSerializer<Object> j=new Jackson2JsonRedisSerializer<>(Object.class);
		template.setValueSerializer(j);
		template.setHashValueSerializer(j);
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new StringRedisSerializer());
		
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}
}
