package com.cloudzone.common.entity.pod.log;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodLogSelection extends PodBase {

    private static final long serialVersionUID = 4126700590735195378L;

    private long offsetFrom;

    private long offsetTo;

    private String logFilePosition;

    private PodLogReferencePoint selection;

    public PodLogReferencePoint getSelection() {
        return selection;
    }

    public void setSelection(PodLogReferencePoint selection) {
        this.selection = selection;
    }

    public long getOffsetFrom() {
        return offsetFrom;
    }

    public void setOffsetFrom(long offsetFrom) {
        this.offsetFrom = offsetFrom;
    }

    public long getOffsetTo() {
        return offsetTo;
    }

    public void setOffsetTo(long offsetTo) {
        this.offsetTo = offsetTo;
    }

    public String getLogFilePosition() {
        return logFilePosition;
    }

    public void setLogFilePosition(String logFilePosition) {
        this.logFilePosition = logFilePosition;
    }
}
