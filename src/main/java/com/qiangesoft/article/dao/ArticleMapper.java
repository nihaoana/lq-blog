package com.qiangesoft.article.dao;

import com.qiangesoft.article.domain.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper {
    int deleteByPrimaryKey(String artId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String artId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}