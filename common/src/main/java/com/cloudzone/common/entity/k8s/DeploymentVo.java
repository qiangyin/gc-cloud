package com.cloudzone.common.entity.k8s;


import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * k8s创建服务时所需参数
 *
 * @author leiyuanjie
 * @date 2018/03/12
 */
@ApiModel(value = "DeploymentVo", description = "服务配置信息")
public class DeploymentVo {
    @ApiModelProperty(value = "镜像仓库名", required = true, example = "aaaa", dataType = "String")
    @JSONField(name = "imageStoreName")
    private String imageStoreName;

    @ApiModelProperty(value = "镜像名", required = true, example = "bbb", dataType = "String")
    @JSONField(name = "imageName")
    private String imageName;

    @ApiModelProperty(value = "镜像版本号", required = true, example = "v1.0.0", dataType = "String")
    @JSONField(name = "imageVersion")
    private String imageVersion;

    @ApiModelProperty(value = "服务名", required = true, example = "test", dataType = "String")
    @JSONField(name = "serviceName")
    private String serviceName;

    @ApiModelProperty(value = "项目名", example = "test", dataType = "String")
    @JSONField(name = "projectName")
    private String projectName;

    @ApiModelProperty(value = "项目ID", required = true, example = "1", dataType = "Integer")
    @JSONField(name = "projectId")
    private Integer projectId;

    @ApiModelProperty(value = "部署模式", required = true, example = "Deployment", dataType = "String")
    @JSONField(name = "deployMode")
    private String deployMode;

    @ApiModelProperty(value = "配置服务ID", required = true, example = "1", dataType = "Integer")
    @JSONField(name = "serviceConfigId")
    private Integer serviceConfigId;

    @ApiModelProperty(value = "cpu", required = true, example = "2.0", dataType = "double")
    @JSONField(name = "cpu")
    private double cpu;

    @ApiModelProperty(value = "内存", required = true, example = "8", dataType = "int")
    @JSONField(name = "memory")
    private int memory;

    @ApiModelProperty(value = "服务类型", required = true, example = "无状态化服务", dataType = "String")
    @JSONField(name = "serviceType")
    private String serviceType;

    @ApiModelProperty(value = "容器最小实例数", required = true, example = "1", dataType = "int")
    @JSONField(name = "minReplicas")
    private int minReplicas;

    @ApiModelProperty(value = "容器最大实例数", required = true, example = "5", dataType = "int")
    @JSONField(name = "maxReplicas")
    private int maxReplicas;

    @ApiModelProperty(value = "cpu阈值", required = true, example = "10", dataType = "Integer")
    @JSONField(name = "targetCPUUtilizationPercentage")
    private Integer targetCPUUtilizationPercentage;

    @JSONField(name = "port")
    private Integer port;
    @JSONField(name = "nodePort")
    private Integer nodePort;

    public DeploymentVo() {
    }

    public DeploymentVo(String imageStoreName, String imageName, String imageVersion, String serviceName,
                        String projectName, String deployMode, double cpu, int memory, String serviceType, int minReplicas,
                        int maxReplicas, Integer targetCPUUtilizationPercentage) {
        this.imageStoreName = imageStoreName;
        this.imageName = imageName;
        this.imageVersion = imageVersion;
        this.serviceName = serviceName;
        this.projectName = projectName;
        this.deployMode = deployMode;
        this.cpu = cpu;
        this.memory = memory;
        this.serviceType = serviceType;
        this.minReplicas = minReplicas;
        this.maxReplicas = maxReplicas;
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    public String getImageStoreName() {
        return imageStoreName;
    }

    public void setImageStoreName(String imageStoreName) {
        this.imageStoreName = imageStoreName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
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

    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public Integer getServiceConfigId() {
        return serviceConfigId;
    }

    public void setServiceConfigId(Integer serviceConfigId) {
        this.serviceConfigId = serviceConfigId;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(int minReplicas) {
        this.minReplicas = minReplicas;
    }

    public int getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(int maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public Integer getTargetCPUUtilizationPercentage() {
        return targetCPUUtilizationPercentage;
    }

    public void setTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getNodePort() {
        return nodePort;
    }

    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "DeploymentVo{" +
                "imageStoreName='" + imageStoreName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageVersion='" + imageVersion + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", deployMode='" + deployMode + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", serviceType=" + serviceType +
                ", minReplicas=" + minReplicas +
                ", maxReplicas=" + maxReplicas +
                ", targetCPUUtilizationPercentage=" + targetCPUUtilizationPercentage +
                ", port=" + port +
                ", nodePort=" + nodePort +
                '}';
    }
}
