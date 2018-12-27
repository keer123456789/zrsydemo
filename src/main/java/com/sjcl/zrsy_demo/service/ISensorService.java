package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.Sensor;

public interface ISensorService {
    boolean addSensor(Sensor sensor);
    Sensor getSensor(String ERC721ID);
}
