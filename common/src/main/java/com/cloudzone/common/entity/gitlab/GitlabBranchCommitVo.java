package com.cloudzone.common.entity.gitlab;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Gitlab Branch Commit
 *
 * @author rongzhihong@gome.com.cn
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabBranchCommitVo", description = "Gitlab分支信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitlabBranchCommitVo {
    @ApiModelProperty(value = "分支Id", required = true, example = "b39b608d3233aad2e8b80fee53472d4627250fb2")
    private String id;
    @ApiModelProperty(value = "分支树", required = true, example = "1")
    private String tree;
    @ApiModelProperty(value = "分支信息", required = true, example = "add by limin:增加项目管理与初始服务")
    private String message;
    @ApiModelProperty(value = "提交时间", required = true, example = "2018-03-21 12:01:35")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date committedDate;
    @ApiModelProperty(value = "提交者", required = true)
    private GitlabUserVo committer;

    public GitlabBranchCommitVo() {

    }

    public GitlabBranchCommitVo(String id, String tree, String message, Date committedDate, GitlabUserVo committer) {
        this.id = id;
        this.tree = tree;
        this.message = message;
        this.committedDate = committedDate;
        this.committer = committer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(Date committedDate) {
        this.committedDate = committedDate;
    }

    public GitlabUserVo getCommitter() {
        return committer;
    }

    public void setCommitter(GitlabUserVo committer) {
        this.committer = committer;
    }
}
