package com.qiangesoft.article.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Article {
    /**
     * 文章id
     */
    private String artId;

    /**
     * 状态（0草稿，1审核，2公开，3私密，4回收）
     */
    private Integer status;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 所属分类
     */
    private Integer categoryId;

    /**
     * 标签
     */
    private String tags;

    /**
     * 创建用户
     */
    private String userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近修改时间
     */
    private Date modifyTime;

    /**
     * 阅读数
     */
    private Integer readNum;

    /**
     * 评论数
     */
    private Integer commentNum;

    /**
     * 收藏数
     */
    private Integer collectionNum;

    /**
     * 点赞数
     */
    private Integer goodNum;

    /**
     * 文章内容
     */
    private String content;

    public String getArtId() {
        return artId;
    }

    public void setArtId(String artId) {
        this.artId = artId == null ? null : artId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}