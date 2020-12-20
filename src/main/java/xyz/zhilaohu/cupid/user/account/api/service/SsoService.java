package xyz.zhilaohu.cupid.user.account.api.service;



import xyz.zhilaohu.cupid.user.account.api.dto.LoginInfoDTO;

import javax.validation.constraints.NotNull;


/**
 * 单点登录服务
 *
 * @author zhilaohu
 * @since 2020-12-18 17:55:17
 */
public interface SsoService {

    /**
     * 登录
     * @param userName 用户名
     * @param password 密码
     * @return 实例对象
     */
    LoginInfoDTO login(@NotNull String userName, @NotNull String password);

    /**
     * 登出
     * @param token 令牌
     * @return 是否成功
     */
    boolean logout(String token);

}