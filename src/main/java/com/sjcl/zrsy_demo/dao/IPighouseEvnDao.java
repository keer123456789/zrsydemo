package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.InfoEnv;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigInfo;

import java.util.List;

public interface IPighouseEvnDao {
    boolean addPighouseEnvInfo(EnvInfo envInfo);
    boolean addPigHouse(PigHouse pigHouse);
    List<InfoEnv> getPigHouseEnv(String id,int time);
    List<PigInfo> getPigList(String id);
}
