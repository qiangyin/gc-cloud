package com.cloudzone.common.entity.pod.log;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodLogReferencePoint extends PodBase {

    private static final long serialVersionUID = 2935329851726588382L;

    private String timestamp;

    private Long lineNum;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }
}
