package com.sjcl.zrsy_demo.dao;

import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;

import java.util.List;

public interface IPigInfoDao {
    boolean addPig(PigInfo pigInfo);
    boolean addSelfInfo(PigSelfInfo pigSelfInfo);
    List<PigSelfInfo> getPigInfo(String pigId);
    List<PigInfo> getAllPigInfo();
}
