package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodObjectMeta extends PodBase {

    private static final long serialVersionUID = -6193576253030422551L;

    private String name;

    private String namespace;

    private String creationTimestamp;

    private PodObjectLabel labels;

    private PodObjectAnnotations annotations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public PodObjectLabel getLabels() {
        return labels;
    }

    public void setLabels(PodObjectLabel labels) {
        this.labels = labels;
    }

    public PodObjectAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(PodObjectAnnotations annotations) {
        this.annotations = annotations;
    }
}
