package com.sjcl.zrsy_demo.service.implement;

import com.sjcl.zrsy_demo.dao.ISensorDao;
import com.sjcl.zrsy_demo.domain.Sensor;
import com.sjcl.zrsy_demo.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorServiceImpl implements ISensorService {

    @Autowired
    ISensorDao sensorDao;

    @Override
    public boolean addSensor(Sensor sensor) {
        return sensorDao.addSensor(sensor);
    }

    @Override
    public Sensor getSensor(String ERC721ID) {
        return sensorDao.getSensorInfo(ERC721ID);
    }
}
