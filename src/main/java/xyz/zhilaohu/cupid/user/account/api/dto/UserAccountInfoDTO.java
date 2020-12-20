package xyz.zhilaohu.cupid.user.account.api.dto;

import xyz.zhilaohu.cupid.user.account.api.entity.UserInfo;

/**
 * 用户账户信息；账户信息与个人资料。UserInfo与UserAccount的子集
 */
public class UserAccountInfoDTO {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 注册来源
     */
    private Integer registerSourceId;
    /**
     * 是否注销/删除
     */
    private Boolean delete;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别 (0-女/1-男)
     */
    private Integer gender;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phoneNumber;
    /**
     * 国家地区
     */
    private Integer countriesRegionsInfoId;
    /**
     * 头像
     */
    private String headPortraits;
    /**
     * 个性签名
     */
    private String personalDescription;
}
