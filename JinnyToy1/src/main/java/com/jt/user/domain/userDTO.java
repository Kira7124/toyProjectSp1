package com.jt.user.domain;

import java.sql.Timestamp;

import lombok.Data;



@Data
public class userDTO {
		
		private String userid;
		private String userpw;
		private String username;
		private String useraddress;
		private String usernick;
		private String userimg;
		private Timestamp insertdate;
		private Timestamp updatedate;
		

	
}
