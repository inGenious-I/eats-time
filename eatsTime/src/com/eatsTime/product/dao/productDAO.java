package com.eatsTime.product.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class productDAO {
	public SqlSession sqlSession;

	public productDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}