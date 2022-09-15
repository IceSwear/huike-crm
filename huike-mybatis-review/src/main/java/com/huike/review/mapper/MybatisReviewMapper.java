package com.huike.review.mapper;

import com.huike.review.domain.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mybatis复习的Mapper层
 */
public interface MybatisReviewMapper {


    /**======================================================新增======================================================**/
   int addone(Review review);
    /**======================================================删除======================================================**/
 //修改
    int update(Review review);
    /**======================================================修改======================================================**/
int delete(Integer id);
    /**======================================================简单查询===================================================**/
//getbyid
    Review getbyid(Integer id);
    //getbypage
    List<Review> getbypage(Review r);
}
