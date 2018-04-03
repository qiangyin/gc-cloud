package com.cloudzone.common.entity.harbor;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BuildProjectVO entity
 *
 * @author gaoyanlei
 * @since 2018/3/21 0021
 */
@ApiModel(value = "ProjectVO", description = "Project信息显示")
public class ProjectVO {
    @ApiModelProperty(value = "project名称", required = true, example = "1", dataType = "String")
    @JSONField(name = "project_name")
    private String projectName;

    @ApiModelProperty(value = "是否公开", required = true, example = "1", dataType = "int")
    @JSONField(name = "public")
    private int ispublic;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getIspublic() {
        return ispublic;
    }

    public void setIspublic(int ispublic) {
        this.ispublic = ispublic;
    }
}
