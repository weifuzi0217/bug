package com.bug.service.user;

import com.bug.model.user.User;

/**
* @author 作者:伟夫子   E-mail:2374577438@qq.com
* @version 创建时间：2018年3月27日 上午10:09:18
* @类说明 ：
*/
public interface IUserService {
	int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
