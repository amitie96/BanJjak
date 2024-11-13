package com.mysite.banjjak.model;

import org.springframework.web.multipart.MultipartFile;

public class Crochet {

	private int cro_id;
	private String cro_title;
	private String cro_content;
	private String cro_date;
	private String cro_rate;
	
	private String user_id;
	
	private MultipartFile crochetImage;

	public int getCro_id() {
		return cro_id;
	}

	public void setCro_id(int cro_id) {
		this.cro_id = cro_id;
	}

	public String getCro_title() {
		return cro_title;
	}

	public void setCro_title(String cro_title) {
		this.cro_title = cro_title;
	}

	public String getCro_content() {
		return cro_content;
	}

	public void setCro_content(String cro_content) {
		this.cro_content = cro_content;
	}

	public String getCro_date() {
		return cro_date;
	}

	public void setCro_date(String cro_date) {
		this.cro_date = cro_date;
	}

	public String getCro_rate() {
		return cro_rate;
	}

	public void setCro_rate(String cro_rate) {
		this.cro_rate = cro_rate;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public MultipartFile getCrochetImage() {
		return crochetImage;
	}

	public void setCrochetImage(MultipartFile crochetImage) {
		this.crochetImage = crochetImage;
	}
	
	
}
