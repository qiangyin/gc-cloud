package com.cloudzone.common.entity.pod.log;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodLogContent extends PodBase implements Comparable<PodLogContent> {

    private static final long serialVersionUID = 64658062706416857L;

    private long formatTime;

    private String timestamp;

    private String content;

    public long getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(long formatTime) {
        this.formatTime = formatTime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("%s %s", timestamp, content);
    }

    @Override
    public int compareTo(PodLogContent target) {
        if (target == null) {
            return -1;
        }

        long d1 = this.getFormatTime();
        long d2 = target.getFormatTime();
        if (d1 == 0 || d2 == 0) {
            return -1;
        }

        if (d1 < d2) {
            return -1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return 1;
        }
    }

}
