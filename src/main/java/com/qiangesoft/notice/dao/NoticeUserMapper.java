package com.qiangesoft.notice.dao;

import com.qiangesoft.notice.domain.NoticeUser;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(NoticeUser record);

    int insertSelective(NoticeUser record);

    NoticeUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NoticeUser record);

    int updateByPrimaryKey(NoticeUser record);
}