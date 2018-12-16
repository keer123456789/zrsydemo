package com.sjcl.zrsy_demo.controller;


import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import com.sjcl.zrsy_demo.service.IPigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PigInfoController {
    @Autowired
    IPigInfoService pigInfoService;

    /**
     * 增加新猪
     * @param pigInfo
     * @return
     */
    @PostMapping("/addpig")
    public boolean addPig(@RequestBody PigInfo pigInfo){
        return pigInfoService.addPig(pigInfo);
    }

    /**
     * 增加猪的特征信息
     * @param pigSelfInfo
     * @return
     */
    @PostMapping("/addselfinfo")
    public boolean addSelfInfo(@RequestBody PigSelfInfo pigSelfInfo){
        return pigInfoService.addSelfInfo(pigSelfInfo);
    }

    /**
     * 获得猪的健康信息
     * @param pigSelfInfo
     * @return
     */
    @PostMapping("/getpiginfo")
    public List<PigSelfInfo> getPigInfo(@RequestBody PigSelfInfo pigSelfInfo){
        return pigInfoService.getPigInfo(pigSelfInfo.getId());
    }
}
