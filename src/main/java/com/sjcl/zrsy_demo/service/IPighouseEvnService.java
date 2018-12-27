package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.InfoEnv;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IPighouseEvnService {
    boolean addEvnInfo(EnvInfo envInfo);
    boolean addPigHouse(PigHouse pigHouse);
    List<InfoEnv> getPigHouseEnv(String id,int time);
    List<PigInfo> getPigList(String id);
    List<PigHouse>getPigHouselist();
    List<String>getPigHouseIdList();
    PigHouse getPigHouseInfoByERC721(String ERC721ID);
}
