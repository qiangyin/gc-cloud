package com.cloudzone.common.entity.pod.stomp;

import java.io.Serializable;

/**
 * @author tongqiangying@gmail.com
 * @since 2018/3/19
 */
public class StompPullLog implements Serializable {
    private static final long serialVersionUID = 5045208208546760358L;

    private String namespace;

    private String podName;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }
}
