package com.macro.mall.tiny.malltiny.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.macro.mall.tiny.malltiny.common.api.CommonResult;
import com.macro.mall.tiny.malltiny.service.UmsMemberService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("/sso")
@Tag(name = "PmsBrandController", description = "商品品牌管理")
public class UmsMemberController {
    @Autowired
    private UmsMemberService _memberService;

    @Operation(summary="获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return _memberService.generateAuthCode(telephone);
    }

    @Operation(summary="判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                 @RequestParam String authCode) {
        return _memberService.verifyAuthCode(telephone,authCode);
    }
}
