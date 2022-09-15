package com.huike.business.mapper;

import java.util.List;
import com.huike.business.domain.TbBusinessTrackRecord;
import com.huike.business.domain.vo.BusinessTrackVo;
import org.apache.ibatis.annotations.Param;

/**
 * 商机跟进记录Mapper接口
 * @date 2021-04-28
 */
public interface TbBusinessTrackRecordMapper {

    List<TbBusinessTrackRecord> selectTbBusinessById(@Param("businessId") Long id);

    int insert(TbBusinessTrackRecord businessTrackVo);
}