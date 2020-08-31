package com.qiangesoft.category.dao;

import com.qiangesoft.category.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}