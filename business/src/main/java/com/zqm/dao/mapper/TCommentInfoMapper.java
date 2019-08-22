package com.zqm.dao.mapper;

import com.zqm.dao.entity.TCommentInfo;
import com.zqm.dao.entity.TCommentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TCommentInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    long countByExample(TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int deleteByExample(TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int insert(TCommentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int insertSelective(TCommentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    List<TCommentInfo> selectByExampleWithBLOBsWithRowbounds(TCommentInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    List<TCommentInfo> selectByExampleWithBLOBs(TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    List<TCommentInfo> selectByExampleWithRowbounds(TCommentInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    List<TCommentInfo> selectByExample(TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    TCommentInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") TCommentInfo record, @Param("example") TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") TCommentInfo record, @Param("example") TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByExample(@Param("record") TCommentInfo record, @Param("example") TCommentInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByPrimaryKeySelective(TCommentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(TCommentInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comment_info
     *
     * @mbg.generated Tue Aug 06 09:02:32 CST 2019
     */
    int updateByPrimaryKey(TCommentInfo record);
}