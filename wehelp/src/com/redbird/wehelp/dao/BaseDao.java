package com.redbird.wehelp.dao;

import com.redbird.wehelp.pojo.BasePojo;
import com.redbird.wehelp.util.PageModel;

/**
 * 所有DAO继承接口
 * @author c
 *
 */
public interface BaseDao<T> {

	/**
	 * 添加pojo对象到数据库
	 * @param pojo
	 */
	public void add(BasePojo pojo);
	
	/**
	 * 从数据中删除pojo对象
	 * @param pojo
	 */
	public void delete(String id);
	
	/**
	 * 修改pojo对象
	 * @param pojo
	 */
	public void update(BasePojo pojo);
	
	/**
	 * 通过ID查找pojo对象
	 * @param id
	 * @return
	 */
	public T find(String id);
	
	/**
	 *  分页查询
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageModel find(int pageNo, int pageSize);
}
