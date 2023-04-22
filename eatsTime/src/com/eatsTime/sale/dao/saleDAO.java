package com.eatsTime.sale.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class saleDAO {
	public SqlSession sqlSession;

	public saleDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}