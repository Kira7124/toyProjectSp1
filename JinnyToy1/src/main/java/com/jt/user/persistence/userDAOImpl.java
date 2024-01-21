package com.jt.user.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class userDAOImpl implements userDAO {

	
	private static final Logger logger = LoggerFactory.getLogger(userDAOImpl.class);
	
	
	// DB 에 접근할 객체 주입
	@Inject
	SqlSession sqlSession;
	
	private final String NAMESPACE="com.jt.mapper.UserMapper";
	
	
	
	
	
	
	
	
	
}
