package com.qiangesoft.syslog.dao;

import com.qiangesoft.syslog.domain.SysLog;
import org.springframework.stereotype.Repository;

@Repository
public interface SysLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}