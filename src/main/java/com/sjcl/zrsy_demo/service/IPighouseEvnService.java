package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPighouseEvnService {
    boolean addEvnInfo(EnvInfo envInfo);
    boolean addPigHouse(PigHouse pigHouse);
    List<EnvInfo> getPigHouseEnv(String id);
}
