package com.cloudzone;

import com.cloudzone.common.entity.k8s.ContainerVo;
import com.cloudzone.common.entity.k8s.DeploymentVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leiyuanjie
 * @date 2018/03/22
 */

@FeignClient(value = "k8s-api-server")
@RequestMapping("/k8s")
@RestController
public interface K8sServiceAPI {

    /**
     * 创建k8s的Deployment实例
     *
     * @param deploymentVo
     */
    @RequestMapping(value = "/service/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void createDeploymentAndService(@RequestBody DeploymentVo deploymentVo);

    /**
     * 查询指定namespace和pod的日志信息
     *
     * @param nameSpace
     * @param podName
     * @return
     */
    @RequestMapping(value = "/{nameSpace}/{podName}/logs", method = RequestMethod.GET)
    String getLogWithNamespaceAndPod(@PathVariable("nameSpace") String nameSpace, @PathVariable("podName") String podName);


    /**
     * 停止pod服务
     *
     * @param serviceName
     */
    @RequestMapping(value = "/{serviceName}/stop", method = RequestMethod.GET)
    void deleteService(@PathVariable("serviceName") String serviceName);

    /**
     * 启动服务
     *
     * @param deploymentVo
     */
    @RequestMapping(value = "/start", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void startService(@RequestBody DeploymentVo deploymentVo);

    /**
     * 获取指定服务的所有pod信息
     *
     * @param serviceName
     * @return
     */
    @RequestMapping(value = "/{serviceName}/instanceList", method = RequestMethod.GET)
    List<ContainerVo> getAllContainers(@PathVariable("serviceName") String serviceName);
}
