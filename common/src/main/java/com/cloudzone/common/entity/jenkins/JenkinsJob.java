package com.cloudzone.common.entity.jenkins;

/**
 * JenkinsJob Jenkins任务
 *
 * @author zhoufei
 * @date 2018/3/12
 */
public class JenkinsJob {
    private String name;
    private JobStatus status;
    private JobConfig jobConfig;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public JobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }
}
