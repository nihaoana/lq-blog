package com.qiangesoft.accessory.dao;

import com.qiangesoft.accessory.domain.Accessory;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(Accessory record);

    int insertSelective(Accessory record);

    Accessory selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(Accessory record);

    int updateByPrimaryKey(Accessory record);
}