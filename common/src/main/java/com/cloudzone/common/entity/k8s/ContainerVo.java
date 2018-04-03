package com.cloudzone.common.entity.k8s;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * @author leiyuanjie
 * @date 2018/03/20
 */
@ApiModel(value = "ContainerVo", description = "容器实例信息")
public class ContainerVo {
    @ApiModelProperty(value = "实例版本", required = true, example = "test1.0.0", dataType = "String")
    private String instanceVersion;
    @ApiModelProperty(value = "实例ID", required = true, example = "dga12121331", dataType = "String")
    private String instanceId;
    @ApiModelProperty(value = "主机IP", required = true, example = "192.168.1.12", dataType = "String")
    private String hostIp;
    @ApiModelProperty(value = "容器IP", required = true, example = "192.168.1.12", dataType = "String")
    private String containerIp;
    @ApiModelProperty(value = "开始时间", required = true, example = "2018-03-22 11:29:00", dataType = "Date")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    public ContainerVo() {
    }

    public ContainerVo(String instanceVersion, String instanceId, String hostIp, String containerIp, Date startTime) {
        this.instanceVersion = instanceVersion;
        this.instanceId = instanceId;
        this.hostIp = hostIp;
        this.containerIp = containerIp;
        this.startTime = startTime;
    }

    public String getInstanceVersion() {
        return instanceVersion;
    }

    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getContainerIp() {
        return containerIp;
    }

    public void setContainerIp(String containerIp) {
        this.containerIp = containerIp;
    }

    public Date getStartTime() { return startTime;  }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
