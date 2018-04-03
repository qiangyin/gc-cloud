package com.cloudzone.common.entity.harbor;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * tag信息显示
 *
 * @author gaoyanlei
 * @since 2018/3/21 0021
 */
@ApiModel(value = "Manifest", description = "tag信息显示")
public class Manifest {
    @JSONField(name = "schemaVersion")
    @ApiModelProperty(value = "版本", required = true, example = "5.5", dataType = "String")
    private String schemaVersion;

    @JSONField(name = "name")
    @ApiModelProperty(value = "名称", required = true, example = "cloudzone/mysql-master", dataType = "String")
    private String name;

    @JSONField(name = "tag")
    @ApiModelProperty(value = "标签", required = true, example = "5.5", dataType = "String")
    private String tag;

    @JSONField(name = "architecture")
    @ApiModelProperty(value = "处理器", required = true, example = "amd64", dataType = "String")
    private String architecture;

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
}
