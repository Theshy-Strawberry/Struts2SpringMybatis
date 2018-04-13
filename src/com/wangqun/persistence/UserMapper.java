package com.wangqun.persistence;

import java.util.List;
import com.core.code.util.Page;
import org.apache.ibatis.annotations.Param;
import com.wangqun.domain.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(@Param(value="id")Integer id);

    int insert(User user);

    User selectByPrimaryKey(@Param(value="id")Integer id);

    int updateByPrimaryKey(User user);

	List<User> search(Page pager);

	int tryLogin(User user);

	int deleteTest(User user);
	
}