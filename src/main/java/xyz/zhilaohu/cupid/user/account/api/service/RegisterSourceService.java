package xyz.zhilaohu.cupid.user.account.api.service;

import xyz.zhilaohu.cupid.user.account.api.entity.RegisterSource;

import java.util.List;

/**
 * (RegisterSource)表服务接口
 *
 * @author makejava
 * @since 2020-12-18 17:53:14
 */
public interface RegisterSourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RegisterSource queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RegisterSource> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param registerSource 实例对象
     * @return 实例对象
     */
    RegisterSource insert(RegisterSource registerSource);

    /**
     * 修改数据
     *
     * @param registerSource 实例对象
     * @return 实例对象
     */
    RegisterSource update(RegisterSource registerSource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}