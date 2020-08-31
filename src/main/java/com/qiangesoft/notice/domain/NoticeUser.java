package com.qiangesoft.notice.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class NoticeUser {
    /**
     * 标识
     */
    private String id;

    /**
     * 公告id
     */
    private String noticeId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 是否阅读
     */
    private Integer isRead;

    /**
     * 阅读时间
     */
    private Date readTime;

    /**
     * 用户类型
     */
    private Integer userType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId == null ? null : noticeId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}