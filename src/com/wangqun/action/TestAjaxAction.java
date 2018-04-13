package com.wangqun.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

@Controller
public class TestAjaxAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletResponse response;  
	
	
	public HttpServletResponse getResponse() {
		return response;
	}


	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}


	public void ajax() throws IOException{
		
		System.out.println("xxxx");
		
		List a = new ArrayList();
		
		a.add("nihao");
		a.add("woxi");
		a.add("meili");
		a.add("yaoyao");
		
		JSONArray json = JSONArray.fromObject(a);
		response.getWriter().print(json);
	}

}
