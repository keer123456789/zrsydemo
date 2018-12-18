package com.sjcl.zrsy_demo.service;

import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;

import java.util.List;

public interface IPigInfoService {
    boolean addPig(PigInfo pigInfo);
    boolean addSelfInfo(PigSelfInfo pigSelfInfo);
    List<PigSelfInfo> getPigHealthInfo(String pigid);
    List<PigInfo>getAllPigInfo();
    PigInfo getPigInfo(String pigid);
}
