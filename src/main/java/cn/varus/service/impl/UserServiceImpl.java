package cn.varus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.entity.User;
import cn.varus.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User getUser(Long id) {
		return userDao.getUser(id);
	}

}
