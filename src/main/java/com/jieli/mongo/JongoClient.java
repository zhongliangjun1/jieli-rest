package com.jieli.mongo;

import org.jongo.Jongo;

/**
 * Created with IntelliJ IDEA.
 * User: liming_liu
 * Date: 14-3-8
 * Time: 下午8:41
 * To change this template use File | Settings | File Templates.
 */
public class JongoClient {

    public static Jongo getInstance() {
        return new Jongo(MongoFactory.getMongo().getDB("jieli"));
    }
}
