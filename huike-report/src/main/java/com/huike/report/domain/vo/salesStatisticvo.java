package com.huike.report.domain.vo;

import lombok.Data;

@Data
public class salesStatisticvo {
     private String  create_by;			/*用户名称*/
     private String  deptName;	/*	 部门名称*/
     private Integer  num;			/*;		转化条数*/
     private Long  radio;		/*		转化率*/
}
