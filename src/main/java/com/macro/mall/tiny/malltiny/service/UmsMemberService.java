package com.macro.mall.tiny.malltiny.service;

import com.macro.mall.tiny.malltiny.common.api.CommonResult;

import io.swagger.v3.oas.annotations.servers.Server;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */

 public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
