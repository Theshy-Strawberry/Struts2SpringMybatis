package com.wangqun.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	
	private Integer id;//pre
	  
	private String name;//姓名
	  
	private Integer age;//年龄
	  
	private Date joinTime;//入职时间
	  
	private String bikou;//备注
	  
	public Integer getId() {
		 return id;
	}
	
	public void setId(Integer id) {
		 this.id = id;
	}
	
	public String getName() {
		 return name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public Integer getAge() {
		 return age;
	}
	
	public void setAge(Integer age) {
		 this.age = age;
	}
	
	public Date getJoinTime() {
		 return joinTime;
	}
	
	public void setJoinTime(Date joinTime) {
		 this.joinTime = joinTime;
	}
	
	public String getBikou() {
		 return bikou;
	}
	
	public void setBikou(String bikou) {
		 this.bikou = bikou;
	}
	
}