package com.gongbu.bootJPA.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.gongbu.bootJPA.dao.UserDAO;
import com.gongbu.bootJPA.model.User;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Repository
public class UserDAOImpl implements UserDAO{
	private MongoClient mongoClient;
	private DB db;
	private DBCollection collection;
	private BasicDBObject document;
	
	public UserDAOImpl(@Value("${spring.data.mongodb.uri}") String uri, @Value("${spring.data.mongodb.port}") int port,
			@Value("${spring.data.mongodb.username}") String name, @Value("${spring.data.mongodb.password}") String pw,
			@Value("${spring.data.mongodb.database}") String database) {
		try {
			mongoClient = new MongoClient();
			db = mongoClient.getDB(database);
	        collection = db.getCollection("user");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 연결 차단
	public void close() {
		try {
			mongoClient.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insertUser(User user) {
		document = new BasicDBObject();
		document.put("name", user.getName());
		document.put("id", user.getId());
		document.put("email", user.getEmail());
		document.put("phone", user.getPhone());
		collection.insert(document);
	}
	
	@Override
	public Boolean searchUser(String id) {
		document = new BasicDBObject();
		document.put("id", id);
		DBCursor cursor = collection.find(document);
		return cursor.count() > 0 ? false : true;
	}
	
	@Override
	public Boolean updateUser(User user, User newUser) {
		document = new BasicDBObject();
		document.put("id", user.getId());
		document.put("name", user.getName());
		document.put("Email", user.getEmail());
		document.put("Phone", user.getPhone());
		
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("id", newUser.getId());
		newDocument.put("name", newUser.getName());
		newDocument.put("Email", newUser.getEmail());
		newDocument.put("Phone", newUser.getPhone());
		
		BasicDBObject updateObject = new BasicDBObject();
		updateObject.put("$set", newDocument);
		
		collection.update(document, updateObject);
		
		//수정 대상 검색 후 데이터 변경 가능한지 파악하여 리턴
		return false;
	}
}
