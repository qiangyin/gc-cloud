package com.cloudzone.common.entity;

import java.util.Date;

public class BuildHistory {
    private Long id;

    private Long buildId;

    private Long buildMetaId;

    private Integer status;

    private Integer timeCosuming;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBuildId() {
        return buildId;
    }

    public void setBuildId(Long buildId) {
        this.buildId = buildId;
    }

    public Long getBuildMetaId() {
        return buildMetaId;
    }

    public void setBuildMetaId(Long buildMetaId) {
        this.buildMetaId = buildMetaId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTimeCosuming() {
        return timeCosuming;
    }

    public void setTimeCosuming(Integer timeCosuming) {
        this.timeCosuming = timeCosuming;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}