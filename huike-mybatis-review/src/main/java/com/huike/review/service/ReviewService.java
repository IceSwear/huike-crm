package com.huike.review.service;

import com.huike.review.domain.Review;

import java.util.List;

/**
 * mybatis复习接口层
 */
public interface ReviewService {
    int addone(Review review);
    //修改
    int update(Review review);
    int delete(Integer id);
    //getbyid
    Review getbyid(Integer id);
    //getbypage
    List<Review> getbypage(Review r);
}
