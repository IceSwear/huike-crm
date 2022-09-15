package com.huike.clues.service;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.common.core.page.TableDataInfo;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 线索跟进记录Service接口
 * 
 * @author WGL
 * @date 2022-04-19
 */
@Transactional
public interface ITbClueTrackRecordService {


    int add(TbClueTrackRecord tbClueTrackRecord);

    List<TbClueTrackRecord> selectbypage(Long clueId);
}
