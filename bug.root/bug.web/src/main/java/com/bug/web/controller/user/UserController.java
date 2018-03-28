package com.bug.web.controller.user;

import com.bug.common.sysetem.ReObject;
import com.bug.model.user.User;
import com.bug.service.user.IUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author 作者:伟夫子   E-mail:2374577438@qq.com
* @version 创建时间：2018年3月27日 上午10:11:11
* @类说明 ：
*/
@Controller
@RequestMapping("/u")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(ModelMap map){
		User user = new User();
        user.setUserId("1");
        user.setUserName("test1");
        user.setPassword("123456");
        
        try {
        	userService.insert(user);
		} catch (Exception e) {
			log.error("登陆失败{}",e);
			return "error";
		}
        return "login";
	}
	@RequestMapping(value="/query",method=RequestMethod.GET)
	public @ResponseBody ReObject queryById(@RequestParam("userId") String userId){
		
		User user = userService.selectByPrimaryKey(userId);
		
		return ReObject.returnData("查询成功", "111111", user);
	}
}
