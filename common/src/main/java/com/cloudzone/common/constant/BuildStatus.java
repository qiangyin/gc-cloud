package com.cloudzone.common.constant;

/**
 * BuildStatus 构建状态
 *
 * @author zhoufei
 * @date 2018/3/21
 */
public enum BuildStatus {
    /**
     * RUNNABLE 可运行状态，项目没有执行过构建操作的状态
     */
    RUNNABLE(0, "runnable"),
    /**
     * RUNNING 运行状态，构建任务正在执行中
     */
    RUNNING(1, "running"),
    /**
     * SUCCESS 成功状态，构建任务成功
     */
    SUCCESS(2, "success"),
    /**
     * FAILED 失败状态，构建任务失败
     */
    FAILED(3, "failed"),
    /**
     * TERMINATION 终止状态，终止构建任务
     */
    TERMINATION(4, "termination");
    private int code;
    private String description;

    BuildStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static int getCodeByDescription(String description) {
        for (BuildStatus status : BuildStatus.values()) {
            if (status.description.equalsIgnoreCase(description)) {
                return status.code;
            }
        }

        return -1;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
