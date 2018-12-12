package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.implement.bigchaindb.PighouseEvnDao;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.service.IPighouseEvnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PighouseEvnServiceImpl implements IPighouseEvnService {
    @Autowired
    PighouseEvnDao pighouseEvnDao;

    /**
     * 实时采集猪舍环境信息
     * @param envInfo
     * @return
     */
    @Override
    public boolean addEvnInfo(EnvInfo envInfo) {
        return pighouseEvnDao.addPighouseEnvInfo(envInfo);
    }

    @Override
    public boolean addPigHouse(String location) {
        return pighouseEvnDao.addPigHouse(location);
    }
}
