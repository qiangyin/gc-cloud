package com.cloudzone.common.entity.project;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author yintongqiang
 * @params 项目配置VO
 * @since 2018/3/21
 */
@ApiModel(value = "ProjectVO", description = "项目配置信息")
public class ProjectVO {
    private Long id;
    @ApiModelProperty(value = "项目名称", required = true, example = "gc-cloud")
    private String name;
    @ApiModelProperty(value = "创建用户", required = true, example = "cloudzone")
    private String userName;
    @ApiModelProperty(value = "项目描述", required = true, example = "容器云平台")
    private String des;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}