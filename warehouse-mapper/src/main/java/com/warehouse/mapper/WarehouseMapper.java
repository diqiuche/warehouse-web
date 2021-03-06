package com.warehouse.mapper;

import com.warehouse.bean.Warehouse;
import com.warehouse.bean.WarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    long countByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insert(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insertSelective(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    List<Warehouse> selectByExample(WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    Warehouse selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKeySelective(Warehouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table warehouse
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKey(Warehouse record);
}