package xyz.zhilaohu.cupid.user.account.api.service;

import xyz.zhilaohu.cupid.user.account.api.dto.UserAccountDTO;
import xyz.zhilaohu.cupid.user.account.api.dto.UserAccountInfoDTO;
import xyz.zhilaohu.cupid.user.account.api.entity.UserInfo;

import java.util.List;

/**
 * 用户服务
 *
 * @author zhilaohu
 * @since 2020-12-18 17:55:17
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param userAccountDTO 用户注册信息
     * @return 新注册用户账户信息
     */
    UserAccountInfoDTO registerUser(UserAccountDTO userAccountDTO);

    /**
     * 注销用户
     *
     * @param userName 用户名
     * @param password 密码
     * @return 是否成功
     */
    boolean closeAccount(String userName,String password);

    /**
     * 密码重置
     *
     * @param userName 用户名
     * @param password 密码
     * @return 重置是否成功
     */
    boolean retPassword(String userName,String password);

    /**
     * 修改用户资料
     *
     * @param updateInfo 修改资料
     * @return 修改后的用户账户信息
     */
    UserAccountInfoDTO updateUserInfo(UserInfo updateInfo);

    /**
     * 根据条件获取用户列表
     *
     * @param condition 筛选条件
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 符合条件的用户列表
     */
    List<UserAccountInfoDTO> queryAllByLimit(UserAccountInfoDTO condition, int offset, int limit);

}