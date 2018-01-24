package com.fbee.modules.mybatis.dao;

import com.fbee.modules.mybatis.model.TsysMaxNo;
import com.fbee.modules.mybatis.model.TsysMaxNoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsysMaxNoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int countByExample(TsysMaxNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int deleteByExample(TsysMaxNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int deleteByPrimaryKey(Long sysMaxNoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int insert(TsysMaxNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int insertSelective(TsysMaxNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    List<TsysMaxNo> selectByExample(TsysMaxNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    TsysMaxNo selectByPrimaryKey(Long sysMaxNoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int updateByExampleSelective(@Param("record") TsysMaxNo record, @Param("example") TsysMaxNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int updateByExample(@Param("record") TsysMaxNo record, @Param("example") TsysMaxNoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int updateByPrimaryKeySelective(TsysMaxNo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_max_no
     *
     * @mbggenerated Fri Mar 10 15:30:19 CST 2017
     */
    int updateByPrimaryKey(TsysMaxNo record);
}