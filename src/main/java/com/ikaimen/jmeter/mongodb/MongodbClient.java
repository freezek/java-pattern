package com.ikaimen.jmeter.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @author Mr.Chen
 * @title:
 * @projectName com.ikaimen
 * @description: TODO
 * @date 2019/4/4  5:05 PM
 **/
public class MongodbClient {

    public MongoClient mongoClient = null;
    public MongoDatabase database = null;
    public MongoCollection<Document> collection = null;
    public FindIterable<Document> findIterable = null;
    public MongoCursor<Document> mongoCursor = null;

    public void ConnectionMongoClient(String host, int port, String databaseName) {
        try {
            mongoClient = new MongoClient(host, port);
            database = mongoClient.getDatabase(databaseName);
            System.out.println("Connection Successfully !");

        } catch (Exception e) {
            System.out.println("Mongodb Connection Exception:");
            e.printStackTrace();
        }
    }

    public MongoCursor query(String collectionName, String queryStr) {
        collection =  database.getCollection(collectionName);
        findIterable =  (FindIterable<Document>) collection.find();
        mongoCursor = findIterable.iterator();
        System.out.print("Query Successfully !");
        String str = "";
        return mongoCursor;

    }

    public void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }


}
