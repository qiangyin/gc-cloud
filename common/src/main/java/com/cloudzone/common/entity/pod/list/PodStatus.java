package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

import java.util.List;
import java.util.Map;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodStatus extends PodBase {

    private static final long serialVersionUID = 8357199997114698024L;

    private String status;

    private String podPhase;

    private List<Map<String, Object>> containerStates;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPodPhase() {
        return podPhase;
    }

    public void setPodPhase(String podPhase) {
        this.podPhase = podPhase;
    }

    public List<Map<String, Object>> getContainerStates() {
        return containerStates;
    }

    public void setContainerStates(List<Map<String, Object>> containerStates) {
        this.containerStates = containerStates;
    }
}
