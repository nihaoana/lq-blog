package com.qiangesoft.follow.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Follow {
    /**
     * 关注id
     */
    private Integer followId;

    /**
     * 关注的人
     */
    private String fromUser;

    /**
     * 被关注的人
     */
    private String toUser;

    /**
     * 关注时间
     */
    private Date createTime;

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser == null ? null : fromUser.trim();
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser == null ? null : toUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}