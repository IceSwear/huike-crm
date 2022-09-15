package com.huike.clues.mapper;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.common.core.page.TableDataInfo;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 线索跟进记录Mapper接口
 * @date 2021-04-19
 */
public interface TbClueTrackRecordMapper {


    int add(TbClueTrackRecord tbClueTrackRecord);

    List<TbClueTrackRecord> selectbypage(@Param("clueId")Long clueId);
}
