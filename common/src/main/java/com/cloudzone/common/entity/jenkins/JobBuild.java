package com.cloudzone.common.entity.jenkins;

import com.alibaba.fastjson.JSONObject;

/**
 * JobBuild 任务构建信息
 *
 * @author zhoufei
 * @date 2018/3/15
 */
public class JobBuild {
    private int id;
    private int number;
    private int queueId;
    private String url;
    private boolean building;
    private String description;
    private String displayName;
    private int duration;
    private int estimatedDuration;
    private String fullDisplayName;
    private boolean keepLog;
    private String result;
    private long timestamp;

    public JobBuild() {

    }

    public JobBuild(JSONObject jsonObject) {
        if (jsonObject != null) {
            this.number = jsonObject.getInteger("number") == null ? 0 : jsonObject.getInteger("number");
            this.queueId = jsonObject.getInteger("queueId") == null ? 0 : jsonObject.getInteger("queueId");
            this.url = jsonObject.getString("url");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBuilding() {
        return building;
    }

    public void setBuilding(boolean building) {
        this.building = building;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getFullDisplayName() {
        return fullDisplayName;
    }

    public void setFullDisplayName(String fullDisplayName) {
        this.fullDisplayName = fullDisplayName;
    }

    public boolean isKeepLog() {
        return keepLog;
    }

    public void setKeepLog(boolean keepLog) {
        this.keepLog = keepLog;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
