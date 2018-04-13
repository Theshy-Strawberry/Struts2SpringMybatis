package com.wangqun.service;
import com.core.code.util.Page;
import com.wangqun.domain.User;

public interface UserService {

	User searchById(Integer id);
	
	Page search(Page pager);
	
	int insert(User user);

	int update(User user);
	
	int delete(Integer id);

	int tryLogin(User user);

	int deleteTest(User user);
	
}