package com.myweb.domain;

import java.sql.Date;

public class ProductVO {
	private int pno;
	private String title;
	private String writer;
	private String content;
	private Date reg8;
	private Date modd8;
	private int readcount;
	private String imgfile;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReg8() {
		return reg8;
	}
	public void setReg8(Date reg8) {
		this.reg8 = reg8;
	}
	public Date getModd8() {
		return modd8;
	}
	public void setModd8(Date modd8) {
		this.modd8 = modd8;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getImgfile() {
		return imgfile;
	}
	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}
	
	
}
