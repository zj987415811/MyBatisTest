package com.fkit.controller;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.fkit.factory.FKSqlSessionFactory;

import domain.User;

public class MyBatisTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		User user=new User("admin","ÄÐ",26);
		session.insert("com.fkit.controller.UserMapper.save",user);
		session.commit();
		session.close();
	}

}
