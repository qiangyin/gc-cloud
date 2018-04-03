package com.cloudzone.common.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author chenjunjie
 * @since 2018-03-21
 */
public class RuntimeVo {
    @ApiModelProperty(value = "构建语言", required = true, example = "JAVA")
    private String language;
    @ApiModelProperty(value = "版本号", required = true, example = "1.7")
    private List<String> config;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getConfig() {
        return config;
    }

    public void setConfig(List<String> config) {
        this.config = config;
    }


}
