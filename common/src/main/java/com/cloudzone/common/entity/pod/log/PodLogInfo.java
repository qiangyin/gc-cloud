package com.cloudzone.common.entity.pod.log;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodLogInfo extends PodBase {

    private static final long serialVersionUID = -5093500248611963222L;

    private String podName;

    private String containerName;

    private String fromDate;

    private String toDate;

    private Boolean truncated;

    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }
}
