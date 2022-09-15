package com.huike.report.mapper;

import java.util.List;
import java.util.Map;

import com.huike.report.domain.vo.VulnerabilityMapVo;
import com.huike.report.domain.vo.salesStatisticvo;
import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 * @author Administrator
 *
 */
public interface ReportMapper {
	/**=========================================基本数据========================================*/
	/**
	 * 获取线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getCluesNum(@Param("startTime") String beginCreateTime,
						@Param("endTime") String endCreateTime,
						@Param("username") String username);
	Integer getCluesNum2(@Param("username") String username);

	/**
	 * 获取商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getBusinessNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);
	Integer getBusinessNum2(@Param("username") String username);

	/**
	 * 获取合同数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getContractNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);

	/**
	 * 获取合同金额
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Double getSalesAmount(@Param("startTime") String beginCreateTime,
						  @Param("endTime") String endCreateTime,
						  @Param("username") String username);

	Integer getContractNum2(@Param("username") String username);

	Double getSalesAmount2(@Param("username") String username);

    Integer getTofollowedCluesNum(@Param("startTime") String beginCreateTime,
								  @Param("endTime") String endCreateTime,
								  @Param("username") String username);

	Integer getTofollowedBusinessNum(@Param("startTime") String beginCreateTime,
									 @Param("endTime") String endCreateTime,
									 @Param("username") String username);

	Integer getToallocatedBusinessNum(@Param("startTime") String beginCreateTime,
									  @Param("endTime") String endCreateTime,
									  @Param("username") String username);

	Integer getToallocatedCluesNum(@Param("startTime") String beginCreateTime,
								   @Param("endTime") String endCreateTime,
								   @Param("username") String username);

    VulnerabilityMapVo getVulnerabilityMap(@Param("startTime") String beginCreateTime,
										   @Param("endTime") String endCreateTime);

	List<salesStatisticvo> salesStatistic(@Param("startTime") String beginCreateTime,
										  @Param("endTime") String endCreateTime);

	List<Map<String, Object>> businessChangeStatistics(@Param("startTime") String beginCreateTime,
													   @Param("endTime") String endCreateTime);

	/**=========================================今日简报========================================*/



	/**=========================================待办========================================*/

}
