package xyz.zhilaohu.cupid.user.account.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (UserAccount)实体类
 *
 * @author paperTiger
 * @since 2020-12-18 17:13:19
 */
public class UserAccount implements Serializable {
    private static final long serialVersionUID = 603700367450414257L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户信息
     */
    private Integer userInfoId;
    /**
     * 注册来源
     */
    private Integer registerSourceId;
    /**
     * 是否注销/删除
     */
    private boolean delete;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改时间
     */
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getRegisterSourceId() {
        return registerSourceId;
    }

    public void setRegisterSourceId(Integer registerSourceId) {
        this.registerSourceId = registerSourceId;
    }

    public boolean getDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}