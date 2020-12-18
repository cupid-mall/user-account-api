package xyz.zhilaohu.cupid.user.account.api.entity;


import java.io.Serializable;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2020-12-18 17:55:16
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 733884618536627274L;
    /**
     * 主键id
     */
    private Integer id;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCountriesRegionsInfoId() {
        return countriesRegionsInfoId;
    }

    public void setCountriesRegionsInfoId(Integer countriesRegionsInfoId) {
        this.countriesRegionsInfoId = countriesRegionsInfoId;
    }

    public String getHeadPortraits() {
        return headPortraits;
    }

    public void setHeadPortraits(String headPortraits) {
        this.headPortraits = headPortraits;
    }

    public String getPersonalDescription() {
        return personalDescription;
    }

    public void setPersonalDescription(String personalDescription) {
        this.personalDescription = personalDescription;
    }

}