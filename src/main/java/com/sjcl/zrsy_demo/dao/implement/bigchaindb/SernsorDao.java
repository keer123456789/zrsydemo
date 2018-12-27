package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.ISensorDao;
import com.sjcl.zrsy_demo.domain.Sensor;
import org.springframework.stereotype.Repository;

@Repository
public class SernsorDao implements ISensorDao {
    /**
     * 增加传感器
     * @param sensor
     * @return
     */
    @Override
    public boolean addSensor(Sensor sensor) {
        try {
            String assetId= BigchaindbUtil.createAsset(sensor);
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
    public Sensor getSensorInfo(String ERC721ID) {
        try{
            return BigchaindbUtil.getAllAssets(ERC721ID,Sensor.class).get(0);
        }catch (Exception e){
            return null;
        }
    }
}
