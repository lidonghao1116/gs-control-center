package com.fbee.modules.mybatis.dao;

import com.fbee.modules.core.persistence.annotation.MyBatisDao;
import com.fbee.modules.mybatis.model.SystemUser;
import com.fbee.modules.mybatis.model.SystemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisDao
public interface SystemUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int countByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int deleteByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int insert(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int insertSelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    List<SystemUser> selectByExample(SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    SystemUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int updateByPrimaryKeySelective(SystemUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_user
     *
     * @mbggenerated Thu Mar 30 18:22:14 CST 2017
     */
    int updateByPrimaryKey(SystemUser record);
}