package com.cloudzone;

import com.cloudzone.common.entity.gitlab.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * Gitlab Service API
 *
 * @author rongzhihong@gome.com.cn
 * @since 2018/3/22
 */
@FeignClient(value = "gitlab-server")
@RestController("/gitlab-server")
public interface GitLabServiceAPI {
    /**
     * gitlab login
     *
     * @param username username
     * @param password pwd
     * @return GitlabSessionVo
     * @throws IOException
     * @author rongzhihong
     * @since 2018/3/9
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    GitlabSessionVo login(@RequestParam("username") String username, @RequestParam("password") String password) throws IOException;

    /**
     * 获得用户所属分组
     *
     * @param privateToken 用户私钥
     * @return List<GitlabGroupVo>
     * @throws IOException
     * @author rongzhihong
     * @since 2018/3/9
     */
    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    List<GitlabGroupVo> getGroupsForUser(@RequestParam("privateToken") String privateToken) throws IOException;

    /**
     * 获得某个用户分组下的所有项目
     *
     * @param privateToken 用户私钥
     * @param groupId      分组ID
     * @return List<GitlabProjectVo>
     * @throws IOException
     * @author rongzhihong
     * @since 2018/3/9
     */
    @RequestMapping(value = "/groups/projects", method = RequestMethod.GET)
    List<GitlabProjectVo> getProjectsByGroupId(@RequestParam("privateToken") String privateToken, @RequestParam("groupId") int groupId) throws IOException;

    /**
     * 获得某个项目下的所有分支
     *
     * @param privateToken 用户私钥
     * @param projectId    项目Id
     * @return List<GitlabBranchVo>
     * @throws IOException
     * @author rongzhihong
     * @since 2018/3/9
     */
    @RequestMapping(value = "/projects/repository/branches", method = RequestMethod.GET)
    List<GitlabBranchVo> getBranchesByProjectId(@RequestParam("privateToken") String privateToken, @RequestParam("projectId") int projectId) throws IOException;

    /**
     * 获得某个项目下的所有Tag
     *
     * @param privateToken 用户私钥
     * @param projectId    项目Id
     * @return List<GitlabBranchVo>
     * @throws IOException
     * @author rongzhihong
     * @since 2018/3/9
     */
    @RequestMapping(value = "/projects/repository/tags", method = RequestMethod.GET)
    List<GitlabTagVo> getTagsByProjectId(@RequestParam("privateToken") String privateToken, @RequestParam("projectId") int projectId) throws IOException;
}
