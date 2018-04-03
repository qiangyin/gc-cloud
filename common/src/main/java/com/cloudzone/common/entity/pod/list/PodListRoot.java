package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

import java.util.List;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodListRoot extends PodBase {
    private static final long serialVersionUID = -5938014212845571102L;

    private Object listMeta;

    private List<Object> cumulativeMetrics;

    private List<PodList> pods;

    private List<Object> errors;

    public Object getListMeta() {
        return listMeta;
    }

    public void setListMeta(Object listMeta) {
        this.listMeta = listMeta;
    }

    public List<Object> getCumulativeMetrics() {
        return cumulativeMetrics;
    }

    public void setCumulativeMetrics(List<Object> cumulativeMetrics) {
        this.cumulativeMetrics = cumulativeMetrics;
    }

    public List<PodList> getPods() {
        return pods;
    }

    public void setPods(List<PodList> pods) {
        this.pods = pods;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }
}
