package com.gs.rpc.config;

import lombok.Data;

/**
 * RPC 框架配置
 * @program: rpc
 * @description:
 * @author: lydms
 * @create: 2024-04-02 17:12
 **/
@Data
public class RpcConfig {
    /**
     * 名称
     */
    private String name = "gs-rpc";

    /**
     * 版本号
     */
    private String version = "1.0";

    /**
     * 服务器主机ip
     */
    private String serverHost = "localhost";

    /**
     * 服务器主机端口
     */
    private String serverPort = "8080";

    /**
     * 模拟调用
     */
    private boolean mock = false;

}