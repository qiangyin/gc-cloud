package com.cloudzone.common.entity;

import java.util.Date;

public class Service {
    private Long id;

    private Long projectId;

    private Long serviceConfigId;

    private String name;

    private Integer status;

    private Long maxInstance;

    private Long minInstance;

    private String imgUrl;

    private String imgVer;

    private String depKind;

    private String externalIp;

    private Integer externalPort;

    private String insideDomain;

    private Integer insidePort;

    private String svcType;

    private Integer targetCpuUtilization;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getServiceConfigId() {
        return serviceConfigId;
    }

    public void setServiceConfigId(Long serviceConfigId) {
        this.serviceConfigId = serviceConfigId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMaxInstance() {
        return maxInstance;
    }

    public void setMaxInstance(Long maxInstance) {
        this.maxInstance = maxInstance;
    }

    public Long getMinInstance() {
        return minInstance;
    }

    public void setMinInstance(Long minInstance) {
        this.minInstance = minInstance;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getImgVer() {
        return imgVer;
    }

    public void setImgVer(String imgVer) {
        this.imgVer = imgVer == null ? null : imgVer.trim();
    }

    public String getDepKind() {
        return depKind;
    }

    public void setDepKind(String depKind) {
        this.depKind = depKind == null ? null : depKind.trim();
    }

    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp == null ? null : externalIp.trim();
    }

    public Integer getExternalPort() {
        return externalPort;
    }

    public void setExternalPort(Integer externalPort) {
        this.externalPort = externalPort;
    }

    public String getInsideDomain() {
        return insideDomain;
    }

    public void setInsideDomain(String insideDomain) {
        this.insideDomain = insideDomain == null ? null : insideDomain.trim();
    }

    public Integer getInsidePort() {
        return insidePort;
    }

    public void setInsidePort(Integer insidePort) {
        this.insidePort = insidePort;
    }

    public String getSvcType() {
        return svcType;
    }

    public void setSvcType(String svcType) {
        this.svcType = svcType == null ? null : svcType.trim();
    }

    public Integer getTargetCpuUtilization() {
        return targetCpuUtilization;
    }

    public void setTargetCpuUtilization(Integer targetCpuUtilization) {
        this.targetCpuUtilization = targetCpuUtilization;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}