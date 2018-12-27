package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.Sensor;

public interface ISensorDao {
    boolean addSensor(Sensor sensor);
    Sensor getSensorInfo(String ERC721ID);
}
