package cn.varus.web;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.varus.entity.User;
import cn.varus.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@Component("loginAction")
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Autowired
	private UserService userService;
	@Autowired
	private User user;

	public String login() {
		User user = userService.getUser(1L);
		session.put("user", user);
		return SUCCESS;
	}

}
