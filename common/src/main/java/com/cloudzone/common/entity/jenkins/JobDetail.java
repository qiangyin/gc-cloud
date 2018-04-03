package com.cloudzone.common.entity.jenkins;

import com.alibaba.fastjson.JSONObject;

/**
 * JobDetail 任务详情
 *
 * @author zhoufei
 * @date 2018/3/15
 */
public class JobDetail {
    private String description;
    private String displayName;
    private boolean buildable;
    private JobBuild firstBuild;
    private JobBuild lastBuild;
    private JobBuild lastCompletedBuild;
    private JobBuild lastFailedBuild;
    private JobBuild lastStableBuild;
    private JobBuild lastSuccessfulBuild;
    private JobBuild lastUnstableBuild;
    private JobBuild lastUnsuccessfulBuild;
    private int nextBuildNumber;
    private boolean inQueue;

    public JobDetail() {

    }

    public JobDetail(JSONObject jsonObject) {
        this.description = jsonObject.getString("description");
        this.displayName = jsonObject.getString("displayName");
        this.buildable = jsonObject.getBoolean("buildable") == null ? false : jsonObject.getBoolean("buildable");
        this.firstBuild = new JobBuild(jsonObject.getJSONObject("firstBuild"));
        this.lastBuild = new JobBuild(jsonObject.getJSONObject("lastBuild"));
        this.lastCompletedBuild = new JobBuild(jsonObject.getJSONObject("lastCompletedBuild"));
        this.lastFailedBuild = new JobBuild(jsonObject.getJSONObject("lastFailedBuild"));
        this.lastStableBuild = new JobBuild(jsonObject.getJSONObject("lastStableBuild"));
        this.lastSuccessfulBuild = new JobBuild(jsonObject.getJSONObject("lastSuccessfulBuild"));
        this.lastUnstableBuild = new JobBuild(jsonObject.getJSONObject("lastUnstableBuild"));
        this.lastUnsuccessfulBuild = new JobBuild(jsonObject.getJSONObject("lastUnsuccessfulBuild"));
        this.nextBuildNumber = jsonObject.getInteger("nextBuildNumber") == null ? 0 : jsonObject.getInteger("nextBuildNumber");
        this.inQueue = jsonObject.getBoolean("inQueue") == null ? false : jsonObject.getBoolean("inQueue");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public JobBuild getFirstBuild() {
        return firstBuild;
    }

    public void setFirstBuild(JobBuild firstBuild) {
        this.firstBuild = firstBuild;
    }

    public JobBuild getLastBuild() {
        return lastBuild;
    }

    public void setLastBuild(JobBuild lastBuild) {
        this.lastBuild = lastBuild;
    }

    public JobBuild getLastCompletedBuild() {
        return lastCompletedBuild;
    }

    public void setLastCompletedBuild(JobBuild lastCompletedBuild) {
        this.lastCompletedBuild = lastCompletedBuild;
    }

    public JobBuild getLastFailedBuild() {
        return lastFailedBuild;
    }

    public void setLastFailedBuild(JobBuild lastFailedBuild) {
        this.lastFailedBuild = lastFailedBuild;
    }

    public JobBuild getLastStableBuild() {
        return lastStableBuild;
    }

    public void setLastStableBuild(JobBuild lastStableBuild) {
        this.lastStableBuild = lastStableBuild;
    }

    public JobBuild getLastSuccessfulBuild() {
        return lastSuccessfulBuild;
    }

    public void setLastSuccessfulBuild(JobBuild lastSuccessfulBuild) {
        this.lastSuccessfulBuild = lastSuccessfulBuild;
    }

    public JobBuild getLastUnstableBuild() {
        return lastUnstableBuild;
    }

    public void setLastUnstableBuild(JobBuild lastUnstableBuild) {
        this.lastUnstableBuild = lastUnstableBuild;
    }

    public JobBuild getLastUnsuccessfulBuild() {
        return lastUnsuccessfulBuild;
    }

    public void setLastUnsuccessfulBuild(JobBuild lastUnsuccessfulBuild) {
        this.lastUnsuccessfulBuild = lastUnsuccessfulBuild;
    }

    public int getNextBuildNumber() {
        return nextBuildNumber;
    }

    public void setNextBuildNumber(int nextBuildNumber) {
        this.nextBuildNumber = nextBuildNumber;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }
}
