package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;

public interface IPighouseEvnDao {
    boolean addPighouseEnvInfo(EnvInfo envInfo);
    boolean addPigHouse(String location);
}
