package com.bug.service.user.impl;

import com.bug.dao.user.UserMapper;
import com.bug.model.user.User;
import com.bug.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 作者:伟夫子   E-mail:2374577438@qq.com
* @version 创建时间：2018年3月27日 上午10:11:11
* @类说明 ：
*/
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userDao;

	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		
		return userDao.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(String userId) {
		
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
