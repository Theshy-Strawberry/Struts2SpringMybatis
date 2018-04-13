package com.wangqun.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.core.code.util.Page;
import com.wangqun.domain.User;
import com.wangqun.persistence.UserMapper;
import com.wangqun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	public User searchById(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Transactional
	public int insert(User user) {
		return userMapper.insert(user);
	}
	
	@Transactional
	public int update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	
	@Transactional
	public int delete(Integer id){
		return userMapper.deleteByPrimaryKey(id);
	}
	@Transactional
	public 	int tryLogin(User user){
		return userMapper.tryLogin(user);
	}
	@Transactional
	public 	int deleteTest(User user){
		return userMapper.deleteTest(user);
	}
	public Page search(Page pager) {
		if(pager == null){
		  pager = new Page();
		}
		List<User> items = userMapper.search(pager);
		pager.setDatas(items);	  
		return pager;
	}

}