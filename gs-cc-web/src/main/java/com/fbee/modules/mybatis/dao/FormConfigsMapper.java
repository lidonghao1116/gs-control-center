package com.fbee.modules.mybatis.dao;

import com.fbee.modules.core.persistence.CrudDao;
import com.fbee.modules.core.persistence.annotation.MyBatisDao;
import com.fbee.modules.mybatis.entity.FormConfigsEntity;

@MyBatisDao
public interface FormConfigsMapper extends CrudDao<FormConfigsEntity>{
}