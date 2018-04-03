package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

import java.util.List;
import java.util.Map;

/**
 * pod列表响应VO
 *
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodList extends PodBase {

    private static final long serialVersionUID = -6578858614632295177L;

    private PodObjectMeta objectMeta;

    private PodTypeMeta typeMeta;

    private PodStatus podStatus;

    private Integer restartCount;

    private Object metrics;

    private List<Map<String, Object>> warnings;

    private String nodeName;

    private List<Map<String, Object>> errors;

    public PodObjectMeta getObjectMeta() {
        return objectMeta;
    }

    public void setObjectMeta(PodObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
    }

    public PodTypeMeta getTypeMeta() {
        return typeMeta;
    }

    public void setTypeMeta(PodTypeMeta typeMeta) {
        this.typeMeta = typeMeta;
    }

    public PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    public Object getMetrics() {
        return metrics;
    }

    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public List<Map<String, Object>> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Map<String, Object>> warnings) {
        this.warnings = warnings;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<Map<String, Object>> getErrors() {
        return errors;
    }

    public void setErrors(List<Map<String, Object>> errors) {
        this.errors = errors;
    }
}
