package com.antsRing.edu.entity.comment;

import java.io.Serializable;

/**
 * Created by von_neumann on 17/12/13.
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = 1028597633026103519L;

    //评论ID
    private int commentId;

    //用户ID
    private int userId;

    //父级评论ID
    private int pCommentId;

    
}
