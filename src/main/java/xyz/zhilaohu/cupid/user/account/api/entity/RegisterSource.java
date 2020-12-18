package xyz.zhilaohu.cupid.user.account.api.entity;

import java.io.Serializable;

/**
 * (RegisterSource)实体类
 *
 * @author makejava
 * @since 2020-12-18 17:53:14
 */
public class RegisterSource implements Serializable {
    private static final long serialVersionUID = -17452797126946440L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 注册来源
     */
    private String registerSource;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

}