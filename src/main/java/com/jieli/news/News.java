package com.jieli.news;

import com.jieli.mongo.Model;
import com.jieli.user.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-3-23
 * Time: PM11:05
 * To change this template use File | Settings | File Templates.
 */
public class News extends Model {


    public String type;
    public static final String associationType = "association";  // 协会资讯
    public static final String enterpriseType = "enterprise";  // 企业动态
    public static final String newsType = "news";  // 新闻


    public String title;

    public String overview;  // 资讯预览内容

    public String content; // 资讯实体内容

    public List<Image> images;

    public List<Comment> comments; // 评论

    public List<User> appreciateMembers;  // 点赞者

    public Date addTime;



    public class Image {

        public String placeholder;  // 图片在文章中占位符

        public String url;

        public String description;

    }


    public static final class Comment{

        public User user;

        public String content;

        public Date date;
    }



}
