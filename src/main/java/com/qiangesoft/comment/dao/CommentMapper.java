package com.qiangesoft.comment.dao;

import com.qiangesoft.comment.domain.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}