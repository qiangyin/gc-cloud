package com.cloudzone.common.entity.k8s;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author leiyuanjie
 * @date 2018/03/20
 */
@ApiModel(value = "ServiceListVo", description = "服务列表信息")
public class ServiceListVo {
    @ApiModelProperty(value = "服务名", required = true, example = "test", dataType = "String")
    private String serviceName;
    @ApiModelProperty(value = "项目名", required = true, example = "test", dataType = "String")
    private String projectName;
    @ApiModelProperty(value = "服务状态", required = true, example = "1", dataType = "int")
    private int serviceStatus;
    @ApiModelProperty(value = "服务镜像", required = true, example = "aaa", dataType = "String")
    private String serviceImage;
    @ApiModelProperty(value = "内部地址", required = true, example = "192.168.1.12", dataType = "String")
    private String insideAddress;
    @ApiModelProperty(value = "外部地址", required = true, example = "192.168.1.12", dataType = "String")
    private String outsideAddress;
    @ApiModelProperty(value = "服务版本", required = true, example = "V1.0.0", dataType = "String")
    private String serviceVersion;
    @ApiModelProperty(value = "cpu", required = true, example = "2.0", dataType = "double")
    private double cpu;
    @ApiModelProperty(value = "内存", required = true, example = "8", dataType = "int")
    private int memory;

    public ServiceListVo() {

    }

    public ServiceListVo(String serviceName, String projectName, int serviceStatus, String serviceImage,
                         String insideAddress, String outsideAddress, String serviceVersion, double cpu, int memory) {
        this.serviceName = serviceName;
        this.projectName = projectName;
        this.serviceStatus = serviceStatus;
        this.serviceImage = serviceImage;
        this.insideAddress = insideAddress;
        this.outsideAddress = outsideAddress;
        this.serviceVersion = serviceVersion;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(int serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage;
    }

    public String getInsideAddress() {
        return insideAddress;
    }

    public void setInsideAddress(String insideAddress) {
        this.insideAddress = insideAddress;
    }

    public String getOutsideAddress() {
        return outsideAddress;
    }

    public void setOutsideAddress(String outsideAddress) {
        this.outsideAddress = outsideAddress;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
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
}
