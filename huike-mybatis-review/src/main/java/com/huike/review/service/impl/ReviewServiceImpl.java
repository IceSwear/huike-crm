package com.huike.review.service.impl;

import com.huike.review.domain.Review;
import com.huike.review.service.ReviewService;
import com.huike.review.mapper.MybatisReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * mybatis复习使用的业务层
 * 注意该业务层和我们系统的业务无关，主要是让同学们快速熟悉系统的
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private MybatisReviewMapper reviewMapper;

    @Override
    public int addone(Review review) {
        int addone = reviewMapper.addone(review);
        return addone;
    }

    @Override
    public int update(Review review) {
        int update = reviewMapper.update(review);
        return update;
    }

    @Override
    public int delete(Integer id) {
        int delete = reviewMapper.delete(id);
        return delete;
    }

    @Override
    public Review getbyid(Integer id) {
        Review getbyid = reviewMapper.getbyid(id);
        return getbyid;
    }

    @Override
    public List<Review> getbypage(Review r) {
        List<Review> list = reviewMapper.getbypage(r);
        return list;
    }

    /**=========================================================保存数据的方法=============================================*/


    /**=========================================================删除数据=============================================*/


    /**=========================================================修改数据=============================================*/


    /**=========================================================查询数据的方法=============================================*/

}
