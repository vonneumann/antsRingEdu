package com.antsRing.edu.entity.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录日志
 *
 * Created by von_neumann on 17/12/13.
 */
public class UserLoginLog implements Serializable{
    private static final long serialVersionUID = 6385318102586392821L;

    //日志ID
    private int logId;

    //登录时间
    private Date loginTime;

    //登录IP
    private String ip;

    //登录ID
    private int userId;

    //操作系统
    private String osName;

    //浏览器
    private String userAgent;

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
