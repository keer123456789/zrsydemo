package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.ISensorDao;
import com.sjcl.zrsy_demo.domain.PigHouseSensor;
import com.sjcl.zrsy_demo.domain.PigSensor;
import com.sjcl.zrsy_demo.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorServiceImpl implements ISensorService {

    @Autowired
    ISensorDao sensorDao;

    @Override
    public boolean addSensor(PigSensor pigSensor) {
        return sensorDao.addSensor(pigSensor);
    }

    @Override
    public PigHouseSensor getPigHouseSensor(String pighosueID) {
        return  sensorDao.getPigHouseSensor(pighosueID);
    }

    @Override
    public boolean addPigHouseSensor(PigHouseSensor pigHouseSensor) {
        return sensorDao.addPigHouseSensor(pigHouseSensor);
    }

    @Override
    public PigSensor getSensor(String ERC721ID) {
        return sensorDao.getSensorInfo(ERC721ID);
    }
}
