package com.huike.web.controller.report;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huike.common.core.domain.AjaxResult;
import com.huike.report.service.IReportService;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IReportService reportService;

    /**
     * 线索转换龙虎榜
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/salesStatistic")
    public AjaxResult salesStatistic(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.salesStatistic(beginCreateTime,endCreateTime));

    }
    /**
     * 商机转换龙虎榜
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/businessChangeStatistics")
    public AjaxResult businessChangeStatistics(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.businessChangeStatistics(beginCreateTime,endCreateTime));

    }
    /**
     * 首页--基础数据统计
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getBaseInfo")
    public AjaxResult getBaseInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getBaseInfo(beginCreateTime,endCreateTime));

    }
    @GetMapping("/getTodayInfo")
    public AjaxResult getTodayInfo(){
        return AjaxResult.success(reportService.getTodayInfo());
    }
    @GetMapping("/getTodoInfo")
    public AjaxResult getIndexVo(@RequestParam("beginCreateTime") String beginCreateTime,
                                   @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getIndexVo(beginCreateTime,endCreateTime));
    }

    }