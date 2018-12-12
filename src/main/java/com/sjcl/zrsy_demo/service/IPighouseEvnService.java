package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;
import org.springframework.stereotype.Service;


public interface IPighouseEvnService {
    boolean addEvnInfo(EnvInfo envInfo);
    boolean addPigHouse(String location);
}
