package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.IPigInfoDao;
import com.sjcl.zrsy_demo.domain.InfoPig;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import com.sjcl.zrsy_demo.service.IPigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PigInfoServiceImpl implements IPigInfoService {
    @Autowired
    IPigInfoDao pigInfoDao;

    @Override
    public List<PigInfo> getAllPigInfo() {
        return pigInfoDao.getAllPigInfo();
    }

    /**
     * 增加新猪
     * @param pigInfo
     * @return
     */
    @Override
    public boolean addPig(PigInfo pigInfo) {
        return pigInfoDao.addPig(pigInfo);
    }

    @Override
    public List<InfoPig> getPigHealthInfo(String pigid, int hour) {
        return pigInfoDao.getPigHealthInfo(pigid,hour);
    }

    /**
     * 实时采集猪的特征信息
     * @param pigSelfInfo
     *
     * @return
     */
    @Override
    public boolean addSelfInfo(PigSelfInfo pigSelfInfo) {
        return pigInfoDao.addSelfInfo(pigSelfInfo);
    }

    @Override
    public PigInfo getPigInfo(String pigid) {
        return pigInfoDao.getPigInfo(pigid);
    }
}
