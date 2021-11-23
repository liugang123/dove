package com.example.dove.service.impl;

import com.example.dove.api.dto.request.SendSmsReqDTO;
import com.example.dove.api.dto.response.SendSmsRespDTO;
import com.example.dove.service.ShortMessageService;
import org.springframework.stereotype.Service;

/**
 * 短信业务方法
 *
 * @author liugang
 * @create 2021/11/22
 */
@Service
public class ShortMessageServiceImpl implements ShortMessageService {

    /**
     * 发送短信
     *
     * @param resuest 请求参数
     * @return
     */
    @Override
    public SendSmsRespDTO sendSms(SendSmsReqDTO resuest) {
        return null;
    }
}

