package com.kiran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOT_JS_INFO")
public class JobSeekerInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jsId;
	@Column(length = 15)
	private String jsName;
	@Column(length = 15)
	private String jsAddrs;
	@Column(length = 200)
	private  String resumePath;
	@Column(length = 200)
	private  String photoPath;
	
	
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
	public String getResumePath() {
		return resumePath;
	}
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	
}
