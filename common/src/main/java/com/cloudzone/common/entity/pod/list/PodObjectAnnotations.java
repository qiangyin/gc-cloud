package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodObjectAnnotations extends PodBase {

    private static final long serialVersionUID = -1981614781608778020L;

    /**
     * kubernetes.io/created-by
     */
    private String kubernetesIoCreatedBy;

    public String getKubernetesIoCreatedBy() {
        return kubernetesIoCreatedBy;
    }

    public void setKubernetesIoCreatedBy(String kubernetesIoCreatedBy) {
        this.kubernetesIoCreatedBy = kubernetesIoCreatedBy;
    }

}
