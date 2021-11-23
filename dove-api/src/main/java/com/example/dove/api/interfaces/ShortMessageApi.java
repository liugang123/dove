package com.example.dove.api.interfaces;

import com.example.dove.api.dto.request.SendSmsReqDTO;
import com.example.dove.api.dto.response.SendSmsRespDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 短信平台接口
 *
 * @author liugang
 * @create 2021/11/22
 */
@FeignClient("shortMessage-service")
@RequestMapping("/shortMessage")
public interface ShortMessageApi {

    /**
     * 发送短信
     *
     * @param request
     * @return
     */
    @PostMapping("/sendSms")
    SendSmsRespDTO sendSms(SendSmsReqDTO request);
}
