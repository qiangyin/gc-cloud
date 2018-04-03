package com.cloudzone.common.entity.harbor;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * tag entity
 *
 * @author gaoyanlei
 * @since 2018/3/21
 */
@ApiModel(value = "Tag", description = "tag信息显示")
public class Tag {
    @ApiModelProperty(value = "标签", required = true, example = "5.5", dataType = "String")
    private String tag;

    @ApiModelProperty(value = "展示信息", required = true)
    private Manifest manifest;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Manifest getManifest() {
        return manifest;
    }

    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }
}
