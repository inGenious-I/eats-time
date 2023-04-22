package com.eatsTime.purchase.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class purchaseDAO {
	public SqlSession sqlSession;

	public purchaseDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}