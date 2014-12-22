package cn.varus.web;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("loginAction")
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login() {

		return SUCCESS;
	}
}
