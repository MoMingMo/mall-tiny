package com.macro.mall.tiny.malltiny.dto;

import javax.validation.constraints.NotEmpty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
public class UmsAdminLoginParam {
    @Schema(title = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @Schema(title = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}