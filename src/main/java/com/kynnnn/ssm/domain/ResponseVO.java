package com.kynnnn.ssm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhudiwei
 * @description
 * @date 2019/10/31 11:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO implements Serializable {
    private String code;
    private Object response;
    private String result;
}