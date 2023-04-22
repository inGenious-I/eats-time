package com.eatsTime.main.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class mainDAO {
	public SqlSession sqlSession;

	public mainDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}