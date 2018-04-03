package com.cloudzone;

import com.cloudzone.common.entity.ResponseResult;
import com.cloudzone.common.entity.jenkins.JenkinsJob;
import com.cloudzone.common.entity.jenkins.JobConfig;
import com.cloudzone.common.entity.jenkins.JobDetail;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Jenkins Service API
 *
 * @author zhoufei
 * @since 2018/3/22
 */
@FeignClient(value = "jenkins-server")
@RequestMapping("/jenkins")
@RestController
public interface JenkinsServiceApi {
    /**
     * createJenkinsJob 创建任务
     *
     * @param jobConfig 任务配置信息
     * @return JenkinsJob
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseResult<JenkinsJob> createJenkinsJob(@RequestBody @Validated JobConfig jobConfig);

    /**
     * deleteJob 删除构建任务
     *
     * @param jobName 任务名称
     * @return boolean
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    boolean deleteJob(@RequestParam("jobName") String jobName) throws Exception;

    /**
     * jobDetails 任务详情
     *
     * @param jobName 任务名称
     * @return details
     */
    @RequestMapping(value = "/job", method = RequestMethod.GET)
    ResponseResult<JobDetail> jobDetails(@RequestParam("jobName") String jobName);

    /**
     * buildJob 构建任务
     *
     * @param jobName 任务名称
     * @return Integer 构建Id
     */
    @RequestMapping(value = "/job/build", method = RequestMethod.GET)
    ResponseResult<Integer> buildJob(@RequestParam("jobName") String jobName);

    /**
     * buildInfo 任务构建信息
     *
     * @param jobName     任务名称
     * @param buildNumber 构建编号
     * @return String
     */
    @RequestMapping(value = "/job/build/info", method = RequestMethod.GET)
    String jobBuildInfo(@RequestParam("jobName") String jobName, @RequestParam("buildNumber") Integer buildNumber) throws Exception;
}
