package com.antsRing.edu.entity.article;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章资讯
 *
 * Created by von_neumann on 17/12/13.
 */
public class Article implements Serializable{


    private static final long serialVersionUID = -6090632997600973976L;

    //文章ID
    private int articleId;

    //文章标题
    private String title;

    //文章摘要
    private String summary;

    //文章关键字
    private String keyWord;

    //文章来源
    private String source;

    //文章作者
    private String author;

    //创建时间
    private Date createTime;

    //发布时间
    private Date publishTime;

    //文章类型
    private int type;

    //文章点击量
    private int clickNum;

    //文章点赞量
    private int praiseCount;

    //排序值
    private int commentNum;



}
