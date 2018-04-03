package com.cloudzone.common.entity.harbor;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Projects管理
 *
 * @author gaoyanlei
 * @since 2018/3/21 0021
 */
@ApiModel(value = "Projects", description = "Project信息显示")
public class Projects {
    @ApiModelProperty(value = "project名称", required = true, example = "cloudzone", dataType = "String")
    @JSONField(name = "name")
    private String name;

    @ApiModelProperty(value = "所属人ID", required = true, example = "1", dataType = "int")
    @JSONField(name = "owner_id")
    private int ownerId;

    @ApiModelProperty(value = "projectID", required = true, example = "int", dataType = "int")
    @JSONField(name = "project_id")
    private int projectId;

    @ApiModelProperty(value = "创建时间", required = true, example = "2017-11-01 05:22:28", dataType = "String")
    @JSONField(name = "creation_time")
    private String creationTime;


    @ApiModelProperty(value = "是否删除", required = true, example = "0", dataType = "int")
    @JSONField(name = "deleted")
    private int deleted;

    @ApiModelProperty(value = "是否公开", required = true, example = "1", dataType = "int")
    @JSONField(name = "public")
    private int isPublic;

    @ApiModelProperty(value = "修改时间", required = true, example = "2017-11-01 05:22:28", dataType = "String")
    @JSONField(name = "update_time")
    private String updateTime;

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

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(int isPublic) {
        this.isPublic = isPublic;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
