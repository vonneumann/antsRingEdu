package com.antsRing.edu.entity.mobile;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户短信消息
 *
 * Created by von_neumann on 17/12/13.
 */
public class UserMoblileMsg implements Serializable{
    private static final long serialVersionUID = -5566553384807412329L;

    //ID
    private int id;

    //用户ID
    private Long userId;

    //手机号
    private String mobile;

    //内容
    private String content;

    //创建时间
    private Date createTime;

    //操作人
    private String loginName;

    //开始时间
    private String startDate;

    //结束时间
    private String endDate;

    //定时发送时间
    private Date sendTime;

    //发送状态
    private Integer status;

    //发送方式
    private Integer type;


}
