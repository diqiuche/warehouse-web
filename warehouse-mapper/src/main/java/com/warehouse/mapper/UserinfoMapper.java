package com.warehouse.mapper;

import com.warehouse.bean.Userinfo;
import com.warehouse.bean.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    Userinfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Wed Apr 25 17:07:20 CST 2018
     */
    int updateByPrimaryKey(Userinfo record);
    
    /**
     * 根据用命名更新密码
     * @param record
     * @return
     */
    int updatePasswordByUsername(Userinfo record);
}