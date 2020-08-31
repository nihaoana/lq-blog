package com.qiangesoft.collect.dao;

import com.qiangesoft.collect.domain.Collect;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectMapper {
    int deleteByPrimaryKey(String collectId);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(String collectId);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}