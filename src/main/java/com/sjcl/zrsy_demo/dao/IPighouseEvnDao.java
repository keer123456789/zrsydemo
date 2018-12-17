package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;

import java.util.List;

public interface IPighouseEvnDao {
    boolean addPighouseEnvInfo(EnvInfo envInfo);
    boolean addPigHouse(PigHouse pigHouse);
    List<EnvInfo> getPigHouseEnv(String id);
}
