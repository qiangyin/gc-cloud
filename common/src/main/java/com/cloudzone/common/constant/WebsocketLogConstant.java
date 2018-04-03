package com.cloudzone.common.constant;

/**
 * @author tianyuliang
 * @since 2018/3/15
 */
public class WebsocketLogConstant {

    /**
     * 拉取POD列表
     */
    public static final String POD_LIST = "/api/v1/pod/default?filterBy=&itemsPerPage=50&page=1&sortBy=d,creationTimestamp";

    /**
     * POD接口调用-日志内容 <br/>
     * {0}表示namespace，{1}表示pod名称
     */
    public static final String POD_LOG_CONTENT = "/api/v1/log/{0}/{1}";

}
