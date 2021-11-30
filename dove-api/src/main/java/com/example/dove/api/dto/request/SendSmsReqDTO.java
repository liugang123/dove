package com.example.dove.api.dto.request;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 发送短信请求参数对象
 *
 * @author liugang
 * @create 2021/11/22
 */
@Data
public class SendSmsReqDTO implements Serializable {

    private String templateId;

    private String signName;

    private List<String> phoneNumberSet;

    private List<String> templateSmsParams;
}
