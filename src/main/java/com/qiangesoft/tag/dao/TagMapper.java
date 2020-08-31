package com.qiangesoft.tag.dao;

import com.qiangesoft.tag.domain.Tag;
import org.springframework.stereotype.Repository;

@Repository
public interface TagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}