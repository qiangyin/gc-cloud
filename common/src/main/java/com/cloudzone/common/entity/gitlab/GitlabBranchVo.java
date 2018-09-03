package com.cloudzone.common.entity.gitlab;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gitlab Branch
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabBranchVo", description = "项目分支信息")
public class GitlabBranchVo {
    @ApiModelProperty(value = "项目名称", required = true, example = "master")
    private String name;
    @ApiModelProperty(value = "分支评论信息", required = true)
    private GitlabBranchCommitVo commit;

    public GitlabBranchVo() {

    }

    public GitlabBranchVo(String name, GitlabBranchCommitVo commit) {
        this.name = name;
        this.commit = commit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitlabBranchCommitVo getCommit() {
        return commit;
    }

    public void setCommit(GitlabBranchCommitVo commit) {
        this.commit = commit;
    }
}
