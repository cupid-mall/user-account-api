package xyz.zhilaohu.cupid.user.account.api.entity;

import java.io.Serializable;
import java.util.Date;

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

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
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