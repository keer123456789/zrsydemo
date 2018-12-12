package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.IPigInfoDao;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import com.sjcl.zrsy_demo.service.IPigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PigInfoServiceImpl implements IPigInfoService {
    @Autowired
    IPigInfoDao pigInfoDao;

    /**
     * 增加新猪
     * @param pigInfo
     * @return
     */
    @Override
    public boolean addPig(PigInfo pigInfo) {
        return pigInfoDao.addPig(pigInfo);
    }

    /**
     * 实时采集猪的特征信息
     * @param pigSelfInfo
     * @return
     */
    @Override
    public boolean addSelfInfo(PigSelfInfo pigSelfInfo) {
        return pigInfoDao.addSelfInfo(pigSelfInfo);
    }
}
