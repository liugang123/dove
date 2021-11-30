package com.example.dove.api.dto.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 发送短信响应对象
 *
 * @author liugang
 * @create 2021/11/22
 */
@Data
public class SendSmsRespDTO implements Serializable {

    private String requestId;
}
