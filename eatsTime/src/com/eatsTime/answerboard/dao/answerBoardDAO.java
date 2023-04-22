package com.eatsTime.answerboard.dao;

import org.apache.ibatis.session.SqlSession;
import com.eatsTime.mybatis.config.MyBatisConfig;

public class answerBoardDAO {
	public SqlSession sqlSession;

	public answerBoardDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}