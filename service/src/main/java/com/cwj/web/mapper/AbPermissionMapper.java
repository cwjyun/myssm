package com.cwj.web.mapper;

import com.cwj.web.pojo.AbPermission;
import java.util.List;

public interface AbPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table abao_void..ab_permission
     *
     * @mbggenerated Fri Jul 03 16:42:05 CST 2020
     */
    int deleteByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table abao_void..ab_permission
     *
     * @mbggenerated Fri Jul 03 16:42:05 CST 2020
     */
    int insert(AbPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table abao_void..ab_permission
     *
     * @mbggenerated Fri Jul 03 16:42:05 CST 2020
     */
    AbPermission selectByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table abao_void..ab_permission
     *
     * @mbggenerated Fri Jul 03 16:42:05 CST 2020
     */
    List<AbPermission> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table abao_void..ab_permission
     *
     * @mbggenerated Fri Jul 03 16:42:05 CST 2020
     */
    int updateByPrimaryKey(AbPermission record);
}