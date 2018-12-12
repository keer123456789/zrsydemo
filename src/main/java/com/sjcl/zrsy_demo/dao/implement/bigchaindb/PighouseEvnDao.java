package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPighouseEvnDao;
import com.sjcl.zrsy_demo.domain.BigchaindbData;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import org.springframework.stereotype.Repository;

@Repository
public class PighouseEvnDao implements IPighouseEvnDao {
    /**
     * 实时采集猪舍的环境信息
     * @param envInfo
     * @return
     */
    @Override
    public boolean addPighouseEnvInfo(EnvInfo envInfo) {
        try{
            BigchaindbUtil.transferToSelf(new BigchaindbData(envInfo),BigchaindbUtil.getAssetId(envInfo.getLocation(),String.class.getCanonicalName()));
        }catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * 增加猪舍
     * @param location
     * @return
     */
    @Override
    public boolean addPigHouse(String location) {
        try {
            String assetId = BigchaindbUtil.createAsset(location);
            return assetId != null;
        }catch(Exception e){
            return false;
        }
    }
}
