package com.example.dove.service.impl;

import com.example.dove.api.dto.request.SendSmsReqDTO;
import com.example.dove.api.dto.response.SendSmsRespDTO;
import com.example.dove.service.ShortMessageService;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.HttpProfile;

import com.tencentcloudapi.sms.v20210111.SmsClient;
import com.tencentcloudapi.sms.v20210111.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20210111.models.SendSmsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * 短信业务方法
 *
 * @author liugang
 * @create 2021/11/22
 */
@Service
@Slf4j
public class ShortMessageServiceImpl implements ShortMessageService {

    private static final String secretId = "AKIDmNinb8ON5XjkWCcleGbfT1JK4XjeIgnd";

    private static final String secretKey = "bvylIYYHjupTqzrSnreBRQ8ZjdHfmcCh";

    private static final String smsEndPoint = "sms.tencentcloudapi.com";

    private static final String sdkAppId = "1400604575";

    /**
     * 发送短信
     *
     * @param resuest 请求参数
     * @return
     */
    @Override
    public SendSmsRespDTO sendSms(SendSmsReqDTO resuest) {

        // 1.认证对象
        Credential credential = new Credential(secretId, secretKey);
        // http选项，可选
        HttpProfile httpProfile = new HttpProfile();
        // 默认post方法
        httpProfile.setReqMethod("POST");
        // sdk有默认的超时时间，非必要情况下不进行调整
        httpProfile.setConnTimeout(60);
        // sdk会自动指定域名，通常不需要特定指定域名，访问带有region的金融区服务必须指定域名
        httpProfile.setEndpoint(smsEndPoint);

        // 2.短信客户端请求对象
        SmsClient client = new SmsClient(credential, "ap-beijing");

        // 请求对象
        SendSmsRequest request = new SendSmsRequest();
        request.setSmsSdkAppId(sdkAppId);
        request.setSignName("签名内容");
        request.setTemplateId("100001");
        request.setPhoneNumberSet(new String[]{"15000758063"});
        request.setTemplateParamSet(new String[]{"xxxxx"});

        // 3.发起请求
        try {
            SendSmsResponse sendSmsResponse = client.SendSms(request);
            log.info("短信接口，sendSmsResponse:{}", sendSmsResponse);
        } catch (TencentCloudSDKException e) {
            e.printStackTrace();
        }

        return null;
    }
}

