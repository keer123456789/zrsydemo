package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.ISensorDao;
import com.sjcl.zrsy_demo.domain.PigHouseSensor;
import com.sjcl.zrsy_demo.domain.PigSensor;
import org.springframework.stereotype.Repository;

@Repository
public class SernsorDao implements ISensorDao {
    @Override
    public PigHouseSensor getPigHouseSensor(String PigHouseID) {
        try{
            return BigchaindbUtil.getAllAssets(PigHouseID, PigHouseSensor.class).get(0);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean addPigHouseSensor(PigHouseSensor pigHouseSensor) {
        try {
            String assetId= BigchaindbUtil.createAsset(pigHouseSensor);
            return assetId != null;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 增加猪传感器
     * @param pigSensor
     * @return
     */
    @Override
    public boolean addSensor(PigSensor pigSensor) {
        try {
            String assetId= BigchaindbUtil.createAsset(pigSensor);
            return assetId != null;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 通过ERC721ID获得传感器信息
     * @param ERC721ID
     * @return
     */
    @Override
    public PigSensor getSensorInfo(String ERC721ID) {
        try{
            return BigchaindbUtil.getAllAssets(ERC721ID, PigSensor.class).get(0);
        }catch (Exception e){
            return null;
        }
    }
}
