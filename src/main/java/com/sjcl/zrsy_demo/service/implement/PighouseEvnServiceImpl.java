package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.implement.bigchaindb.PighouseEvnDao;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.InfoEnv;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.service.IPighouseEvnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PighouseEvnServiceImpl implements IPighouseEvnService {
    @Autowired
    PighouseEvnDao pighouseEvnDao;

    @Override
    public List<PigInfo> getPigList(String id) {
        return pighouseEvnDao.getPigList(id);
    }

    @Override
    public List<InfoEnv> getPigHouseEnv(String id, int time) {
        return pighouseEvnDao.getPigHouseEnv(id,time);
    }

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
    public boolean addPigHouse(PigHouse pigHouse) {
        return pighouseEvnDao.addPigHouse(pigHouse);
    }
}
