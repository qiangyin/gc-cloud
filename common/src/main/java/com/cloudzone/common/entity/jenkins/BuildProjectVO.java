package com.cloudzone.common.entity.jenkins;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BuildProjectVO 构建项目
 *
 * @author zhoufei
 * @since 2018/3/20
 */
@ApiModel(value = "BuildProjectVO", description = "构建项目信息")
public class BuildProjectVO {
    @ApiModelProperty(value = "项目Id", required = true, example = "1009", dataType = "Long")
    private Long projectId;
    @ApiModelProperty(value = "项目名称", required = true, example = "gc-cloud", dataType = "String")
    private String projectName;
    @ApiModelProperty(value = "项目状态", required = true, example = "1", dataType = "Integer")
    private Integer projectStatus;
    @ApiModelProperty(value = "代码地址", required = true, example = "http://10.112.101.94/cloudzone/gc-cloud.git", dataType = "String")
    private String codeRepository;
    @ApiModelProperty(value = "代码分支", required = true, example = "master", dataType = "String")
    private String codeBranch;
    @ApiModelProperty(value = "镜像仓库", required = true, example = "http://10.112.101.90/cloudzone", dataType = "String")
    private String imageRepository;

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

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
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

    public String getImageRepository() {
        return imageRepository;
    }

    public void setImageRepository(String imageRepository) {
        this.imageRepository = imageRepository;
    }
}
