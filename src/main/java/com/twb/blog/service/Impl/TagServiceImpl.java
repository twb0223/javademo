package com.twb.blog.service.Impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.twb.blog.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.twb.blog.dao.TagsMapper;
import com.twb.blog.domain.Tags;
import com.twb.blog.service.TagService;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagsMapper tagsMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public Tags getTags(Integer id) {
        List<Tags> tagsList = (ArrayList<Tags>) redisService.get("TagsList");
        Tags tag = tagsList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (tag != null)
            return tag;
        redisService.remove("TagsList");
        return tagsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Tags> getAllTags() {
        Object tags = redisService.get("TagsList");
        if (tags != null) {
            return (ArrayList<Tags>) tags;
        } else {
            List<Tags> tagsList = tagsMapper.selectAll();
            redisService.set("TagsList", tagsList);
            return tagsList;
        }
    }


    @Override
    public Integer deleteTags(Integer id) {
        redisService.remove("TagsList");
        return tagsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateTags(Tags tag) {
        redisService.remove("TagsList");
        return tagsMapper.updateByPrimaryKey(tag);
    }

    @Override
    public Integer insert(Tags tag) {
        redisService.remove("TagsList");
        return tagsMapper.insert(tag);
    }

}
