package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigHouseSensor;
import com.sjcl.zrsy_demo.domain.PigSensor;

public interface ISensorService {
    boolean addSensor(PigSensor pigSensor);
    PigSensor getSensor(String ERC721ID);
    boolean addPigHouseSensor(PigHouseSensor pigHouseSensor);
    PigHouseSensor getPigHouseSensor(String pighosueID);
}
