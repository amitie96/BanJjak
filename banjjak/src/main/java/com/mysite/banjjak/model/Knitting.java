package com.mysite.banjjak.model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Knitting {
	

	private int knitId;
	private String knitTitle;
	private String knitContent;
	private String knitDate;
	private String knitRate;
	
	private String userId;
	
	private String filename;
	private String uuid;
	
	public void setCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();  // 현재 날짜와 시간
        this.knitDate = formatter.format(date);  // 날짜를 지정된 포맷으로 설정
    }

    public String knitDate() {
        return knitDate;
    }
	
	public int getKnitId() {
		return knitId;
	}
	public void setKnitId(int knitId) {
		this.knitId = knitId;
	}
	public String getKnitTitle() {
		return knitTitle;
	}
	public void setKnitTitle(String knitTitle) {
		this.knitTitle = knitTitle;
	}
	public String getKnitContent() {
		return knitContent;
	}
	public void setKnitContent(String knitContent) {
		this.knitContent = knitContent;
	}
	public String getKnitRate() {
		return knitRate;
	}
	public void setKnitRate(String knitRate) {
		this.knitRate = knitRate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	
}