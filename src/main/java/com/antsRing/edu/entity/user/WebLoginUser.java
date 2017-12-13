package com.antsRing.edu.entity.user;

import java.io.Serializable;

/**
 * 外部登录用户信息
 *
 * Created by von_neumann on 17/12/13.
 */
public class WebLoginUser implements Serializable{
    private static final long serialVersionUID = -3811192248487827467L;

    //ID
    private Long id;

    //用户ID
    private Long cusId;

    //邮件
    private String email;

    //手机号
    private String mobile;

    //用户名
    private String nickname;

    //真实姓名
    private String realname;

    //性别
    private int gender;

    //头像地址
    private String avatar;

    //用户简介
    private String userInfo;


    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
}
