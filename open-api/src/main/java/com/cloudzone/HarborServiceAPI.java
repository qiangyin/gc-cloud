package com.cloudzone;

import com.cloudzone.common.entity.harbor.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * harbor API
 *
 * @author gaoyanlei
 * @since 2018/3/21 0021
 */
@FeignClient(value = "harbor-server")
@RequestMapping("/harbor")
@RestController
public interface HarborServiceAPI {

    /**
     * 登录
     *
     * @author gaoyanlei
     * @since 2018/3/21
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    HttpHeaders login(@RequestBody LoginUserVo loginUserVo);

    /**
     * 获取项目信息
     *
     * @author gaoyanlei
     * @since 2018/3/21
     */
    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    List<Projects> projects(@RequestParam("projectName") String projectName,
                            @RequestParam("isPublic") String isPublic,
                            @RequestParam("page") int page,
                            @RequestParam("pageSize") int pageSize);

    /**
     * 获取镜像
     *
     * @author gaoyanlei
     * @since 2018/3/21
     */
    @RequestMapping(value = "/repositories", method = RequestMethod.GET)
    List<Repositories> repositories(@RequestParam("projectId") String projectId,
                                    @RequestParam("q") String q,
                                    @RequestParam("detail") String detail,
                                    @RequestParam("page") int page,
                                    @RequestParam("pageSize") int pageSize);

    /**
     * 获取镜像标签
     *
     * @author gaoyanlei
     * @params projectName 项目名称
     * @params repositorieName  镜像名称
     * @since 2018/3/21
     */
    @RequestMapping(value = "/tags/{projectName}/{repositoryName}", method = RequestMethod.GET)
    List<Tag> tags(@PathVariable("projectName") String projectName,
                   @PathVariable("repositoryName") String repositoryName);

    /**
     * 添加镜像
     *
     * @author gaoyanlei
     * @params projectVO 项目信息
     * @since 2018/3/21
     */
    @RequestMapping(value = "/projects", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    String saveProjects(@RequestBody ProjectVO projectVO);
}