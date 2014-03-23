package com.jieli.news;

import com.jieli.activity.Activity;
import com.jieli.mongo.GenericDAO;
import com.jieli.user.dao.UserDAO;
import com.jieli.util.IdentifyUtils;
import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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


    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findNews(@CookieParam("u")String userId, @QueryParam("type") String type, @QueryParam("page") int page, @QueryParam("pagesize") int pagesize){

        if (!IdentifyUtils.isValidate(userId)) {
            return Response.status(403).build();
        }





        return null;
    }



}
