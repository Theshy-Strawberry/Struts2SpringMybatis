package com.wangqun.action;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import com.core.code.action.BaseAction;
import com.core.code.util.Page;
import com.wangqun.domain.User;
import com.wangqun.service.UserService;

@SuppressWarnings("serial")
@Controller
public class UserAction extends BaseAction {

	private User user;
	
	private Page pager;
	
	private int result;
	
	private String backurl;
	
	@Resource
	private UserService userService;
	// 一个action 多个处理  通配符匹配
	public String login(){
		result = userService.deleteTest(user);
		if(result >0){
			return "list";	
		}else{
			return "login";
		}
	}
	public String index(){
		pager = userService.search(pager);
		return "index";
	}
	
	public String add(){
		result = userService.insert(user);
		backurl = "user/add.jsp";
		return "result-jsp";
	}
	
	public String delete(){
		result = userService.delete(user.getId());
		return "result-json";
	}
	
	public String intoUpdate(){
		user = userService.searchById(user.getId());
		return "intoUpdate";
	}
	
	public String update(){
		result = userService.update(user);
		backurl = "front/user_intoUpdate.action?user.id="+user.getId();
		return "result-jsp";
	}
	
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user = user;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Page getPager() {
		return pager;
	}
	public void setPager(Page pager) {
		this.pager = pager;
	}
	public String getBackurl() {
		return backurl;
	}
	public void setBackurl(String backurl) {
		this.backurl = backurl;
	}
}