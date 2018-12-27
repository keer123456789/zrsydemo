package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.PigHouseSensor;
import com.sjcl.zrsy_demo.domain.PigSensor;

public interface ISensorDao {
    boolean addSensor(PigSensor pigSensor);
    PigSensor getSensorInfo(String ERC721ID);
    boolean addPigHouseSensor(PigHouseSensor pigHouseSensor);
    PigHouseSensor getPigHouseSensor(String PigHouseID);
}
