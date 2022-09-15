package com.huike.business.service.impl;


import com.huike.business.domain.TbBusinessTrackRecord;
import com.huike.business.domain.vo.BusinessTrackVo;
import com.huike.business.mapper.TbBusinessTrackRecordMapper;
import com.huike.business.service.ITbBusinessTrackRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商机跟进记录Service业务层处理
 * 
 * @author wgl
 * @date 2021-04-28
 */
@Service
public class TbBusinessTrackRecordServiceImpl implements ITbBusinessTrackRecordService {
    @Autowired
    TbBusinessTrackRecordMapper tbBusinessTrackRecordMapper;
    @Override
    public List<TbBusinessTrackRecord> selectTbBusinessById(Long id) {
        return tbBusinessTrackRecordMapper. selectTbBusinessById(id);
    }

    @Override
    public int insert(TbBusinessTrackRecord businessTrackVo) {
        return tbBusinessTrackRecordMapper.insert(businessTrackVo);
    }
}
