package com.example.dove.web.controller;

import com.example.dove.api.dto.request.SendSmsReqDTO;
import com.example.dove.api.dto.response.SendSmsRespDTO;
import com.example.dove.service.ShortMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短信服务相关接口
 *
 * @author liugang
 * @create 2021/11/22
 */
@RestController
@RequestMapping("/shortMessage")
public class ShortMessageController {

    @Autowired
    private ShortMessageService shortMessageService;

    @RequestMapping("/sendSms")
    public SendSmsRespDTO sendSms(SendSmsReqDTO request) {
        SendSmsRespDTO response = shortMessageService.sendSms(request);
        return response;
    }
}
