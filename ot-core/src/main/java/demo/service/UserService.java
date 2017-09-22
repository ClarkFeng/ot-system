package demo.service;

import java.util.Set;

import demo.entity.User;


public interface UserService {

	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public User getByUsername(String username);
	
	/**
	 * 通过用户名查询角色信息
	 * @param userName
	 * @return
	 */
	public Set<String> getRoles(String username);
	
	/**
	 * 通过用户名查询权限信息
	 * @param userName
	 * @return
	 */
	public Set<String> getPermissions(String username);
}
