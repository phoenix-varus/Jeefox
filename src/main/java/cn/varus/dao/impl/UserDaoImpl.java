package cn.varus.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.dao.UserDao;
import cn.varus.dbUtil.DBUtil;
import cn.varus.entity.User;

@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private DBUtil db;

	@SuppressWarnings("unchecked")
	public User getUser(Long id) {
		User user = new User();
		List<User> userList = db.getHibernateTemplate().find("from User ");
		user = userList.get(0);
		return user;
	}

}
