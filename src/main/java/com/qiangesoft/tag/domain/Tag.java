package com.qiangesoft.tag.domain;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Tag {
    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 标签名称
     */
    private String tagName;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否推荐
     */
    private Integer isRecommend;

    /**
     * 删除标识
     */
    private Integer isDelete;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}