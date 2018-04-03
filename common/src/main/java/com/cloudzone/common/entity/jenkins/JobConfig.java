package com.cloudzone.common.entity.jenkins;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * JobConfig Jenkins任务配置
 *
 * @author zhoufei
 * @date 2018/3/13
 */
public class JobConfig {
    @Pattern(regexp = "^[a-zA-Z0-9_-]{4,32}$", message = "{JobConfig.jobName.Pattern}")
    private String jobName;
    @NotEmpty(message = "{JobConfig.codeBranch.NotEmpty}")
    private String codeBranch;
    private String codeUrl;
    private String baseImage;
    private String imageUser;
    private String imageName;
    private String repositoryUrl;
    private String repositoryName;
    private String repositoryUsername;
    private String repositoryPassword;
    private String jarName;
    private String jarPath;
    private Integer exposePort;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryUsername() {
        return repositoryUsername;
    }

    public void setRepositoryUsername(String repositoryUsername) {
        this.repositoryUsername = repositoryUsername;
    }

    public String getRepositoryPassword() {
        return repositoryPassword;
    }

    public void setRepositoryPassword(String repositoryPassword) {
        this.repositoryPassword = repositoryPassword;
    }

    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    public String getJarName() {
        return jarName;
    }

    public void setJarName(String jarName) {
        this.jarName = jarName;
    }

    public Integer getExposePort() {
        return exposePort;
    }

    public void setExposePort(Integer exposePort) {
        this.exposePort = exposePort;
    }
}
