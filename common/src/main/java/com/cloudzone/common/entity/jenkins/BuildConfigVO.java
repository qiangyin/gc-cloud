package com.cloudzone.common.entity.jenkins;

import com.cloudzone.common.entity.BuildConfig;
import com.cloudzone.common.entity.BuildMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * BuildConfigVO 构建配置
 *
 * @author zhoufei
 * @since 2018/3/20
 */
@ApiModel(value = "BuildConfigVO", description = "项目配置信息")
public class BuildConfigVO {
    @ApiModelProperty(value = "项目Id", required = true, example = "1009", dataType = "Long")
    private Long projectId;
    @ApiModelProperty(value = "项目名称", required = true, example = "gc-cloud", dataType = "String")
    private String projectName;
    @ApiModelProperty(value = "代码仓库类型", required = true, example = "git", dataType = "String")
    private String repositoryType;
    @ApiModelProperty(value = "代码仓库", required = true, example = "http://10.112.101.94/cloudzone/gc-cloud.git", dataType = "String")
    private String codeRepository;
    @ApiModelProperty(value = "代码分支", required = true, example = "master", dataType = "String")
    private String codeBranch;
    @ApiModelProperty(value = "构建目录", required = true, example = "/src", dataType = "String")
    private String buildDirectory;
    @ApiModelProperty(value = "构建名称", required = true, example = "gc-cloud", dataType = "String")
    private String buildName;
    @ApiModelProperty(value = "构建语言", required = true, example = "java", dataType = "String")
    private String buildLanguage;
    @ApiModelProperty(value = "构建版本", required = true, example = "1.8", dataType = "String")
    private String languageVersion;
    @ApiModelProperty(value = "镜像仓库", required = true, example = "http://10.112.101.90/cloudzone", dataType = "String")
    private String imageRepository;
    @ApiModelProperty(value = "镜像名称", required = true, example = "gc-cloud:1.0", dataType = "String")
    private String imageName;
    @ApiModelProperty(value = "应用端口", required = true, example = "80", dataType = "Integer")
    private Integer exposePort;
    @ApiModelProperty(value = "基础镜像", required = true, example = "http://10.112.101.90/cloudzone/JDK:17", dataType = "String")
    private String fromImage;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getRepositoryType() {
        return repositoryType;
    }

    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    public String getCodeRepository() {
        return codeRepository;
    }

    public void setCodeRepository(String codeRepository) {
        this.codeRepository = codeRepository;
    }

    public String getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
    }

    public String getBuildDirectory() {
        return buildDirectory;
    }

    public void setBuildDirectory(String buildDirectory) {
        this.buildDirectory = buildDirectory;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildLanguage() {
        return buildLanguage;
    }

    public void setBuildLanguage(String buildLanguage) {
        this.buildLanguage = buildLanguage;
    }

    public String getLanguageVersion() {
        return languageVersion;
    }

    public void setLanguageVersion(String languageVersion) {
        this.languageVersion = languageVersion;
    }

    public String getImageRepository() {
        return imageRepository;
    }

    public void setImageRepository(String imageRepository) {
        this.imageRepository = imageRepository;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getExposePort() {
        return exposePort;
    }

    public void setExposePort(Integer exposePort) {
        this.exposePort = exposePort;
    }

    public String getFromImage() {
        return fromImage;
    }

    public void setFromImage(String fromImage) {
        this.fromImage = fromImage;
    }

    public JobConfig toJobConfig(String baseImage, String username, String repositoryUsername, String repositoryPassword) {
        JobConfig config = new JobConfig();

        config.setJobName(this.projectName);
        config.setCodeBranch(this.codeBranch);
        config.setCodeUrl(this.codeRepository);
        config.setBaseImage(baseImage);
        config.setImageUser(username);
        config.setImageName(this.imageName);
        config.setRepositoryUrl(this.imageRepository);
        config.setRepositoryUsername(repositoryUsername);
        config.setRepositoryPassword(repositoryPassword);
        config.setJarName(this.buildName);
        config.setJarPath(this.buildDirectory);
        config.setExposePort(this.exposePort);

        return config;
    }

    public BuildProjectVO toBuildProject(Integer status) {
        BuildProjectVO buildProject = new BuildProjectVO();

        buildProject.setProjectId(this.projectId);
        buildProject.setProjectName(this.projectName);
        buildProject.setProjectStatus(status);
        buildProject.setCodeBranch(this.codeBranch);
        buildProject.setCodeRepository(this.codeRepository);
        buildProject.setImageRepository(this.imageRepository);

        return buildProject;
    }

    public BuildMeta toBuildMeta(Long buildConfigId, Integer status) {
        BuildMeta buildMeta = new BuildMeta();

        buildMeta.setProjectId(this.projectId);
        buildMeta.setBuildConfigId(buildConfigId);
        buildMeta.setStatus(status);
        buildMeta.setCodeUrl(this.codeRepository);
        buildMeta.setBranch(this.codeBranch);
        buildMeta.setImgRepository(this.imageRepository);
        buildMeta.setCatePath(this.buildDirectory);
        buildMeta.setRunName(this.buildName);
        buildMeta.setImgVer(this.imageName);
        buildMeta.setExposePort(this.exposePort);
        buildMeta.setCreateTime(new Date());

        return buildMeta;
    }
}
