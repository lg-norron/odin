package com.southwind.odin.dal.mybatis.mapper;

import com.southwind.odin.dal.mybatis.model.Newspulllog;
import com.southwind.odin.dal.mybatis.model.NewspulllogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewspulllogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int countByExample(NewspulllogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int deleteByExample(NewspulllogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int insert(Newspulllog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int insertSelective(Newspulllog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    List<Newspulllog> selectByExample(NewspulllogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    Newspulllog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int updateByExampleSelective(@Param("record") Newspulllog record, @Param("example") NewspulllogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int updateByExample(@Param("record") Newspulllog record, @Param("example") NewspulllogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int updateByPrimaryKeySelective(Newspulllog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newspulllog
     *
     * @mbggenerated Wed Jul 30 17:39:34 GMT+08:00 2014
     */
    int updateByPrimaryKey(Newspulllog record);
}