package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPighouseEvnDao;
import com.sjcl.zrsy_demo.domain.BigchaindbData;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PighouseEvnDao implements IPighouseEvnDao {
    @Override
    public List<EnvInfo> getPigHouseEnv(String id) {
        try {
            return BigchaindbUtil.getMetaDatas(BigchaindbUtil.getAssetId(id, PigHouse.class.getCanonicalName()), EnvInfo.class);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 实时采集猪舍的环境信息
     * @param envInfo
     * @return
     */
    @Override
    public boolean addPighouseEnvInfo(EnvInfo envInfo) {
        try{
            BigchaindbUtil.transferToSelf(new BigchaindbData(envInfo),BigchaindbUtil.getAssetId(envInfo.getId(),PigHouse.class.getCanonicalName()));
        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * 增加猪舍
     * @param pigHouse
     * @return
     */
    @Override
    public boolean addPigHouse(PigHouse pigHouse) {
        try {
            String assetId = BigchaindbUtil.createAsset(pigHouse);
            return assetId != null;
        }catch(Exception e){
            return false;
        }
    }
}
