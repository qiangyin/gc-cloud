package com.cloudzone.common.entity.gitlab;

import com.cloudzone.common.serialize.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Gitlab User
 *
 * @author tongqiangying@gmail.com
 * @since 2018/3/11
 */
@ApiModel(value = "GitlabUserVo", description = "Gitlab用户信息")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitlabUserVo {
    @ApiModelProperty(value = "用户Id", required = true, example = "1")
    private Integer _id;
    @ApiModelProperty(value = "用户账号", required = true, example = "root")
    private String _username;
    @ApiModelProperty(value = "用户邮箱", required = true, example = "admin@example.com")
    private String _email;
    @ApiModelProperty(value = "用户名称", required = true, example = "Administrator")
    private String _name;
    @ApiModelProperty(value = "skype", required = true, example = "skype")
    private String _skype;
    @ApiModelProperty(value = "提供者", example = "test")
    private String _provider;
    @ApiModelProperty(value = "用户状态", required = true, example = "active")
    private String _state;
    @ApiModelProperty(value = "privateToken", required = true, example = "Administrator")
    private String _privateToken;
    @ApiModelProperty(value = "colorSchemeId", required = true, example = "1")
    private Integer _colorSchemeId;
    @ApiModelProperty(value = "externProviderName", example = "test1")
    private String _externProviderName;
    @ApiModelProperty(value = "websiteUrl", required = true, example = "http://10.112.101.94/cloudzone")
    private String _websiteUrl;
    @ApiModelProperty(value = "创建时间", required = true, example = "2018-03-21 12:01:35")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date _createdAt;

    public GitlabUserVo() {

    }

    public GitlabUserVo(GitlabUserVo bean) {
        this._id = bean.getId();
        this._username = bean.getUsername();
        this._email = bean.getEmail();
        this._name = bean.getName();
        this._skype = bean.getSkype();
        this._provider = bean.getProvider();
        this._state = bean.getState();
        this._privateToken = bean.getPrivateToken();
        this._websiteUrl = bean.getWebsiteUrl();
        this._colorSchemeId = bean.getColorSchemeId();
        this._externProviderName = bean.getExternProviderName();
        this._createdAt = bean.getCreatedAt();
    }

    public GitlabUserVo(Integer _id, String _username, String _email,
                        String _name, String _skype, String _provider,
                        String _state, String _privateToken, String _websiteUrl,
                        Integer _colorSchemeId, String _externProviderName, Date _createdAt) {
        this._id = _id;
        this._username = _username;
        this._email = _email;
        this._name = _name;
        this._skype = _skype;
        this._provider = _provider;
        this._state = _state;
        this._privateToken = _privateToken;
        this._websiteUrl = _websiteUrl;
        this._colorSchemeId = _colorSchemeId;
        this._externProviderName = _externProviderName;
        this._createdAt = _createdAt;
    }


    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        _id = id;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String userName) {
        _username = userName;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getCreatedAt() {
        return _createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        _createdAt = createdAt;
    }


    public String getSkype() {
        return _skype;
    }

    public void setSkype(String skype) {
        _skype = skype;
    }


    public String getProvider() {
        return _provider;
    }

    public void setProvider(String provider) {
        _provider = provider;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        _state = state;
    }

    public String getExternProviderName() {
        return _externProviderName;
    }

    public void setExternProviderName(String externProviderName) {
        _externProviderName = externProviderName;
    }

    public String getWebsiteUrl() {
        return _websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        _websiteUrl = websiteUrl;
    }


    public Integer getColorSchemeId() {
        return _colorSchemeId;
    }

    public void setColorSchemeId(Integer colorSchemeId) {
        this._colorSchemeId = colorSchemeId;
    }

    public String getPrivateToken() {
        return _privateToken;
    }

    public void setPrivateToken(String privateToken) {
        this._privateToken = privateToken;
    }

}