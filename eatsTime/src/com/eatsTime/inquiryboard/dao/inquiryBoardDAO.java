package com.eatsTime.inquiryboard.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class inquiryBoardDAO {
	public SqlSession sqlSession;

	public inquiryBoardDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}