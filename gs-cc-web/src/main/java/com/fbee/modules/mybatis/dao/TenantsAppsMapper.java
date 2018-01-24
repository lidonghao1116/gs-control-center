package com.fbee.modules.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.fbee.modules.core.persistence.CrudDao;
import com.fbee.modules.core.persistence.annotation.MyBatisDao;
import com.fbee.modules.mybatis.entity.TenantsAppsEntity;
import com.fbee.modules.mybatis.model.TenantsApps;
import com.fbee.modules.mybatis.model.TenantsAppsExample;

import org.apache.ibatis.annotations.Param;

@MyBatisDao
public interface TenantsAppsMapper extends CrudDao<TenantsAppsEntity>{
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int countByExample(TenantsAppsExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int deleteByExample(TenantsAppsExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int deleteByPrimaryKey(Integer tenantId);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int insert(TenantsApps record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int insertSelective(TenantsApps record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	List<TenantsApps> selectByExample(TenantsAppsExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	TenantsApps selectByPrimaryKey(Integer tenantId);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int updateByExampleSelective(@Param("record") TenantsApps record, @Param("example") TenantsAppsExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int updateByExample(@Param("record") TenantsApps record, @Param("example") TenantsAppsExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int updateByPrimaryKeySelective(TenantsApps record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_apps
	 * @mbggenerated  Wed May 10 14:32:02 CST 2017
	 */
	int updateByPrimaryKey(TenantsApps record);


	/**
	 * 查询门店状为可用
	 * @return
	 */
	List<TenantsApps> selectCancleTenants();
	
	
	/**
	 * 门店管理查询-账户信息
	 * @param orderNo
	 * @return
	 */
	Map<String,Object> selectTentansById(Integer tentansId);
	
	
	/**
	 * 门店管理查询-基本信息
	 * @param orderNo
	 * @return
	 */
	Map<String,Object> selectMeMberById(Integer tentansId);
	/**
	 * 已入驻门店查
	 * @param map
	 * @return
	 */
	Integer getTenantsAppInfoCount(Map<Object, Object> map);
	
	/**
	 * 已入驻门店列
	 * @param map
	 * @return
	 */
	List<Map>  getTenantsAppInfoList(Map<Object, Object> map);
	
	
	/**
	 * 二级域名查询是否重复
	 * @param domain
	 * @return
	 */
	List<TenantsApps>  selectByDomain(String domain);

	/**
	 * 门店详情
	 * @param tenantId
	 * @return
	 */
	List<Map<String, Object>> selectTenantsInfoById(Integer tenantId);

	
}