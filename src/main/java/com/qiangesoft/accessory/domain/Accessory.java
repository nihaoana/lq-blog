package com.qiangesoft.accessory.domain;

import java.util.Date;

/**
 * @Author：linqiang
 * @Date：2020/07/11
 * @Description：
 */
public class Accessory {
    /**
     * 文件id
     */
    private String fileId;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 路径
     */
    private String path;

    /**
     * 类型
     */
    private String type;

    /**
     * 文件大小
     */
    private Double fileSize;

    /**
     * 是否免费
     */
    private Boolean isFree;

    /**
     * 上传时间
     */
    private Date createTime;

    /**
     * 删除标识
     */
    private Integer isDelete;

    /**
     * 摘要
     */
    private String summary;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}