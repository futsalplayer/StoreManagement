package com.itcast.storemanagement.serviceimpl;

import java.sql.SQLException;
import java.util.List;

import com.itcast.storemanagement.po.Power;

public interface PowerServiceImpl {
	
	/**
	 * 增加一项权限
	 * @param power
	 * @return
	 */
	public boolean powerAdd(Power power);
	
	/**
	 * 删除一项权限
	 * @param id
	 * @return
	 */
	public boolean deleteOnePower(String id);
	
	/**
	 * 修改权限方法
	 * @param power
	 * @return
	 */
	public boolean updateOnePower(Power power);
	
	/**
	 * 得到一项权限的信息，便于修改
	 * @param id
	 * @return
	 * @throws SQLException 
	 */
	public Power getOnePower(String id) throws SQLException;
	
	
	/**
	 * 获得所有权限列表
	 * @return
	 * @throws SQLException 
	 */
	public List<Power> getAllPower() throws SQLException;
	/**
	 * 模糊查询权限
	 * @param powerName
	 * @return
	 * @throws SQLException
	 */
	public List<Power> getAllPower(String powerName) throws SQLException;
	
	/**
	 * 查询所有权限分页
	 * @param pageSize
	 * @param current_page
	 * @return
	 * @throws SQLException
	 */
	public List<Power> getAllPower(int pageSize, int current_page) throws SQLException;
	
	/**
	 * 获取权限总记录数
	 * @return
	 * @throws SQLException
	 */
	public int getAllPowerCount() throws SQLException;
}
