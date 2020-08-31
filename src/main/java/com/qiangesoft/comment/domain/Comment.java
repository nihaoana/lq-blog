package com.qiangesoft.comment.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Comment {
    /**
     * 评论id
     */
    private String commentId;

    /**
     * 文章id
     */
    private String artId;

    /**
     * 回复id
     */
    private String replyId;

    /**
     * 评论者id
     */
    private String commentUserId;

    /**
     * 回复谁
     */
    private String replyUserId;

    /**
     * 内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer goodNum;

    /**
     * 评论时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getArtId() {
        return artId;
    }

    public void setArtId(String artId) {
        this.artId = artId == null ? null : artId.trim();
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId == null ? null : commentUserId.trim();
    }

    public String getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(String replyUserId) {
        this.replyUserId = replyUserId == null ? null : replyUserId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}