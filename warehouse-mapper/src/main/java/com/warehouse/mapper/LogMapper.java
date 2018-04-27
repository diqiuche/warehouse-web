package com.warehouse.mapper;

import com.warehouse.bean.Log;
import com.warehouse.bean.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    long countByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insert(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insertSelective(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    List<Log> selectByExample(LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    Log selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKeySelective(Log record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKey(Log record);
}