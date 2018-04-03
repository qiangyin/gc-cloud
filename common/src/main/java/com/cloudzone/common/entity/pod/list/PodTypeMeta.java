package com.cloudzone.common.entity.pod.list;

import com.cloudzone.common.entity.pod.PodBase;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class PodTypeMeta extends PodBase {

    private static final long serialVersionUID = -5106148926014944289L;

    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

}
