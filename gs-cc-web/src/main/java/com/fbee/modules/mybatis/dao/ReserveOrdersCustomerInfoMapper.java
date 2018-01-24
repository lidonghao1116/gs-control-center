package com.fbee.modules.mybatis.dao;

import java.util.Map;

import com.fbee.modules.core.persistence.CrudDao;
import com.fbee.modules.core.persistence.annotation.MyBatisDao;
import com.fbee.modules.mybatis.entity.ReserveOrdersCustomerInfoEntity;

@MyBatisDao
public interface ReserveOrdersCustomerInfoMapper extends CrudDao<ReserveOrdersCustomerInfoEntity>{
	
	//查询预约订单详情-客户信息
	Map<String,Object> selectMemberByOrderNo(String orderNo);
	
	//查询预约订单详情-服务信息
	Map<String,String> selectServiceByOrderNo(String orderNo);
	
	//预约订单详情-完成处理
	int updateReserveByOrderNo(ReserveOrdersCustomerInfoEntity reserveOrdersCustomerInfoEntity);
}