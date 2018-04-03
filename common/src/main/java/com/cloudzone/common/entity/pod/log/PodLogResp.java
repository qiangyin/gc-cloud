package com.cloudzone.common.entity.pod.log;

import com.cloudzone.common.entity.pod.PodBase;

import java.util.List;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodLogResp extends PodBase {

    private static final long serialVersionUID = -4183344355847695863L;

    private PodLogInfo info;

    private PodLogSelection selection;

    private List<PodLogContent> logs;

    public PodLogInfo getInfo() {
        return info;
    }

    public void setInfo(PodLogInfo info) {
        this.info = info;
    }

    public PodLogSelection getSelection() {
        return selection;
    }

    public void setSelection(PodLogSelection selection) {
        this.selection = selection;
    }

    public List<PodLogContent> getLogs() {
        return logs;
    }

    public void setLogs(List<PodLogContent> logs) {
        this.logs = logs;
    }
}
