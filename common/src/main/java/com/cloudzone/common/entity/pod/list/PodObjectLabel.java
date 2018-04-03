package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodObjectLabel extends PodBase {

    private static final long serialVersionUID = -8219613229059493695L;

    private String app;

    /**
     * pod-template-hash
     */
    private String podTemplateHash;

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPodTemplateHash() {
        return podTemplateHash;
    }

    public void setPodTemplateHash(String podTemplateHash) {
        this.podTemplateHash = podTemplateHash;
    }
}
