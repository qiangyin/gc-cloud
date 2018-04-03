package com.cloudzone.common.entity.harbor;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Repositories entity
 *
 * @author gaoyanlei
 * @since 2018/3/21
 */
@ApiModel(value = "Tag", description = "tag信息显示")
public class Repositories {
    @ApiModelProperty(value = "唯一标示", required = true, example = "1", dataType = "int")
    @JSONField(name = "id")
    private int id;

    @ApiModelProperty(value = "名称", required = true, example = "cloudzone/mysql-master", dataType = "String")
    @JSONField(name = "name")
    private String name;

    @ApiModelProperty(value = "所属人ID", required = true, example = "1", dataType = "int")
    @JSONField(name = "owner_id")
    private int ownerId;

    @ApiModelProperty(value = "projectID", required = true, example = "2", dataType = "int")
    @JSONField(name = "project_id")
    private int projectId;

    @ApiModelProperty(value = "描述", required = true, example = "mysql-master", dataType = "String")
    @JSONField(name = "description")
    private String description;

    @ApiModelProperty(value = "下载次数", required = true, example = "193", dataType = "int")
    @JSONField(name = "pull_count")
    private int pullCount;

    @ApiModelProperty(value = "次数", required = true, example = "0", dataType = "int")
    @JSONField(name = "star_count")
    private int starCount;

    @ApiModelProperty(value = "标签个数", required = true, example = "3", dataType = "int")
    @JSONField(name = "tags_count")
    private int tagsCount;

    @ApiModelProperty(value = "创建时间", required = true, example = "2018-01-17 03:20:28", dataType = "String")
    @JSONField(name = "creation_time")
    private String creationTime;

    @ApiModelProperty(value = "更新时间", required = true, example = "2018-01-17 03:20:28", dataType = "String")
    @JSONField(name = "update_time")
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPullCount() {
        return pullCount;
    }

    public void setPullCount(int pullCount) {
        this.pullCount = pullCount;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public int getTagsCount() {
        return tagsCount;
    }

    public void setTagsCount(int tagsCount) {
        this.tagsCount = tagsCount;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
