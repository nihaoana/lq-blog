package com.qiangesoft.collect.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Collect {
    /**
     * 关注id
     */
    private String collectId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 收藏名称
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    /**
     * 参数
     */
    private String param;

    /**
     * 链接
     */
    private String url;

    /**
     * 删除标识
     */
    private Integer isDelete;

    /**
     * 收藏时间
     */
    private Date createTime;

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId == null ? null : collectId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}