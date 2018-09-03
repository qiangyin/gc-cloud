package com.cloudzone.common.entity.gitlab;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gitlab Tag
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabTagVo", description = "项目标签信息")
public class GitlabTagVo {
    @ApiModelProperty(value = "标签名称", required = true, example = "test")
    private String name;
    @ApiModelProperty(value = "标签描述", required = true, example = "test")
    private String message;
    @ApiModelProperty(value = "标签对应的最新提交记录", required = true)
    private GitlabBranchCommitVo commit;
    @ApiModelProperty(value = "发布版本", required = true)
    private GitlabReleaseVo release;

    public GitlabTagVo() {

    }

    public GitlabTagVo(String name, String message, GitlabBranchCommitVo commit, GitlabReleaseVo release) {
        this.name = name;
        this.message = message;
        this.commit = commit;
        this.release = release;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitlabBranchCommitVo getCommit() {
        return commit;
    }

    public void setCommit(GitlabBranchCommitVo commit) {
        this.commit = commit;
    }

    public GitlabReleaseVo getRelease() {
        return release;
    }

    public void setRelease(GitlabReleaseVo release) {
        this.release = release;
    }
}
