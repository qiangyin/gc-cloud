package com.cloudzone.common.entity;

import com.cloudzone.common.entity.jenkins.BuildConfigVO;

import java.util.Date;

public class BuildMeta {
    private Long id;

    private Long projectId;

    private Long buildConfigId;

    private Integer status;

    private String codeUrl;

    private String branch;

    private String imgRepository;

    private String catePath;

    private String runName;

    private String imgVer;

    private Integer exposePort;

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

    public Long getBuildConfigId() {
        return buildConfigId;
    }

    public void setBuildConfigId(Long buildConfigId) {
        this.buildConfigId = buildConfigId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl == null ? null : codeUrl.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getImgRepository() {
        return imgRepository;
    }

    public void setImgRepository(String imgRepository) {
        this.imgRepository = imgRepository == null ? null : imgRepository.trim();
    }

    public String getCatePath() {
        return catePath;
    }

    public void setCatePath(String catePath) {
        this.catePath = catePath == null ? null : catePath.trim();
    }

    public String getRunName() {
        return runName;
    }

    public void setRunName(String runName) {
        this.runName = runName == null ? null : runName.trim();
    }

    public String getImgVer() {
        return imgVer;
    }

    public void setImgVer(String imgVer) {
        this.imgVer = imgVer == null ? null : imgVer.trim();
    }

    public Integer getExposePort() {
        return exposePort;
    }

    public void setExposePort(Integer exposePort) {
        this.exposePort = exposePort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BuildConfigVO toBuildConfigVO(String projectName, String repositoryType, String buildLanguage, String languageVersion, String fromImage) {
        BuildConfigVO buildConfigVO = new BuildConfigVO();

        buildConfigVO.setProjectId(this.projectId);
        buildConfigVO.setProjectName(projectName);
        buildConfigVO.setRepositoryType(repositoryType);
        buildConfigVO.setCodeRepository(this.codeUrl);
        buildConfigVO.setCodeBranch(this.branch);
        buildConfigVO.setBuildDirectory(this.catePath);
        buildConfigVO.setBuildName(this.runName);
        buildConfigVO.setBuildLanguage(buildLanguage);
        buildConfigVO.setLanguageVersion(languageVersion);
        buildConfigVO.setImageRepository(imgRepository);
        buildConfigVO.setImageName(this.imgVer);
        buildConfigVO.setExposePort(this.exposePort);
        buildConfigVO.setFromImage(fromImage);

        return buildConfigVO;
    }
}