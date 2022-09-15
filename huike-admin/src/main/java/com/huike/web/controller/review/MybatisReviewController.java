package com.huike.web.controller.review;


import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.TableDataInfo;
import com.huike.review.domain.Review;
import com.huike.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 该Controller主要是为了复习三层架构以及Mybatis使用的，该部分接口已经放开权限，可以直接访问
 * 同学们在此处编写接口通过浏览器访问看是否能完成最简单的增删改查
 */
@RestController
@RequestMapping("/review")
public class MybatisReviewController extends BaseController {

    @Autowired
    private ReviewService reviewService;
    /**=========================================================新增数据============================================*/
    @GetMapping("/saveData/{name}/{age}/{sex}")
    public AjaxResult addone(@PathVariable  String name,
                             @PathVariable Integer age,
                             @PathVariable String sex){
        Review review = new Review();
        review.setName(name);
        review.setAge(age);
        review.setSex(sex);
        reviewService.addone(review);
     return AjaxResult.success();
    }
    /**=========================================================删除数据=============================================*/
    @PostMapping("/saveData/{name}/{age}/{sex}")
    public AjaxResult addone2(@PathVariable  String name, @PathVariable Integer age, @PathVariable String sex){
        Review review = new Review();
        review.setName(name);
        review.setAge(age);
        review.setSex(sex);
        reviewService.addone(review);
        return AjaxResult.success();
    }
    /**=========================================================修改数据=============================================*/
   @PostMapping("/update")
    public AjaxResult update(@RequestBody Review review){
       reviewService.update(review);
       return AjaxResult.success();
   }
   @DeleteMapping("/remove/{id}")
    public AjaxResult delete(@PathVariable Integer id){
       reviewService.delete(id);
       return AjaxResult.success();
   }
    /**=========================================================查询数据=============================================*/
    @GetMapping("/getById")
    public AjaxResult getById(@RequestParam  Integer id){
        Review getbyid = reviewService.getbyid(id);
        return AjaxResult.success(getbyid);
    }
    @GetMapping("/getDataByPage")
    public TableDataInfo getDataByPage(@RequestBody Review r){
      /*  int s=0;
        s=(pageNum-1)*pageSize;
        List<Review> list = reviewService.getbypage(s, pageSize);
        int total = list.size();
        HashMap<String, Object> map = new HashMap<>();
        map.put("list",list);
        map.put("total",total);
        return AjaxResult.success(map);*/
     startPage();
        List<Review> list = reviewService.getbypage(r);
        return getDataTable(list);
    }
}