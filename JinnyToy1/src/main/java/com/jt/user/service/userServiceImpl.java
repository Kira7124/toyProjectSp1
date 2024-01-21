package com.jt.user.service;


import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jt.user.persistence.userDAO;

@Service
public class userServiceImpl implements userDAO {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(userServiceImpl.class);
	
	
	@Inject
	private userDAO udao;
	
	
	
	
	
	
	
}
