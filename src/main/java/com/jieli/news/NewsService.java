package com.jieli.news;

import com.jieli.mongo.GenericDAO;
import com.jieli.user.dao.UserDAO;
import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-3-23
 * Time: PM11:30
 * To change this template use File | Settings | File Templates.
 */

@Singleton
@Path("/news")
public class NewsService {


    private final GenericDAO<News> newsDAO= new GenericDAO<News>();

    private final UserDAO userDAO = new UserDAO();


    //private



}
