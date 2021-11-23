package com.example.dove.service;

import com.example.dove.api.dto.request.SendSmsReqDTO;
import com.example.dove.api.dto.response.SendSmsRespDTO;

/**
 * 短信服务业务接口
 *
 * @author liugang
 * @create 2021/11/22
 */
public interface ShortMessageService {

    /**
     * 发送短信
     *
     * @param resuest 请求参数
     * @return
     */
    SendSmsRespDTO sendSms(SendSmsReqDTO resuest);
}
