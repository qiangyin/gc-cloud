package com.cloudzone.common.entity.k8s;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author leiyuanjie
 * @date 2018/03/20
 */
@ApiModel(value = "ServiceInfo", description = "服务信息")
public class ServiceInfo {
    @ApiModelProperty(value = "服务名", required = true, example = "test", dataType = "String")
    private String serviceName;
    @ApiModelProperty(value = "服务状态", required = true, example = "1", dataType = "int")
    private int serviceStatus;
    @ApiModelProperty(value = "部署模式", required = true, example = "deployment", dataType = "String")
    private String deployMode;
    @ApiModelProperty(value = "cpu", required = true, example = "2.0", dataType = "double")
    private double cpu;
    @ApiModelProperty(value = "内存", required = true, example = "8", dataType = "int")
    private int memory;
    @ApiModelProperty(value = "cpu阈值", required = true, example = "10.0", dataType = "double")
    private double targetCPUUtilizationPercentage;
    @ApiModelProperty(value = "创建时间", required = true, example = "2018-03-22 11:29:00", dataType = "Date")
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createTime;


    public ServiceInfo() {
    }

    public ServiceInfo(String serviceName, int serviceStatus, String deployMode,
                       double cpu, int memory, double targetCPUUtilizationPercentage, Date createTime) {
        this.serviceName = serviceName;
        this.serviceStatus = serviceStatus;
        this.deployMode = deployMode;
        this.cpu = cpu;
        this.memory = memory;
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
        this.createTime = createTime;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(int serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(double targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    public Date getCreateTime() {
        return createTime;
 }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
