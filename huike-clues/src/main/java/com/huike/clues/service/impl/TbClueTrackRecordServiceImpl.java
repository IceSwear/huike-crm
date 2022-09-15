package com.huike.clues.service.impl;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.core.page.TableDataInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 线索跟进记录Service业务层处理
 * @date 2022-04-22
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {
    @Autowired
    TbClueTrackRecordMapper tbClueTrackRecordMapper;
    @Override
    public int add(TbClueTrackRecord tbClueTrackRecord) {
        return  tbClueTrackRecordMapper.add(tbClueTrackRecord);
    }

    @Override
    public List<TbClueTrackRecord> selectbypage(Long clueId) {
        return tbClueTrackRecordMapper. selectbypage( clueId);
    }
}
