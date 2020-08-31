package com.qiangesoft.follow.dao;

import com.qiangesoft.follow.domain.Follow;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowMapper {
    int deleteByPrimaryKey(Integer followId);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(Integer followId);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}