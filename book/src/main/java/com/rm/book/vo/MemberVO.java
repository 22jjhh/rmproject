package com.rm.book.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	private String memId;
	private String memPw;
	private String memName;
	private Date memBir;
	private String memTel;
	private String memEmail;
	private String memAdd1;
	private String memAdd2;
	private String memPost;
	private Date memRegdate;
}
