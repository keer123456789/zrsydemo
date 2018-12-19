package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.InfoPig;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IPigInfoDao {
    boolean addPig(PigInfo pigInfo);
    boolean addSelfInfo(PigSelfInfo pigSelfInfo);
    List<InfoPig> getPigHealthInfo(String pigId, int time);
    List<PigInfo> getAllPigInfo();
    PigInfo getPigInfo(String pigId);
}
