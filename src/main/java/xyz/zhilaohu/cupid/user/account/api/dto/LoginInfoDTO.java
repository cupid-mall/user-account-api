package xyz.zhilaohu.cupid.user.account.api.dto;

public class LoginInfoDTO extends UserAccountInfoDTO {
    /**
     * token令牌
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
