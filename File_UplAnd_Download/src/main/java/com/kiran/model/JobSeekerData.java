package com.kiran.model;

import org.springframework.web.multipart.MultipartFile;

public class JobSeekerData {
	private Integer jsId;
	private String jsName;
	private String jsAddrs;
	private  MultipartFile resume;  //Input stream to hold content of uploded file
	private  MultipartFile photo;
	
	
	public Integer getJsId() {
		return jsId;
	}
	public void setJsId(Integer jsId) {
		this.jsId = jsId;
	}
	public String getJsName() {
		return jsName;
	}
	public void setJsName(String jsName) {
		this.jsName = jsName;
	}
	public String getJsAddrs() {
		return jsAddrs;
	}
	public void setJsAddrs(String jsAddrs) {
		this.jsAddrs = jsAddrs;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	public MultipartFile getPhoto() {
		return photo;
	}
	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "JobSeekerData [jsId=" + jsId + ", jsName=" + jsName + ", jsAddrs=" + jsAddrs + ", resume=" + resume
				+ ", photo=" + photo + "]";
	}
	
	
}
