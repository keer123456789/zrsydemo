package com.sjcl.zrsy_demo.controller;




import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.sjcl.zrsy_demo.domain.InfoPig;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;

import com.sjcl.zrsy_demo.service.IPigInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PigInfoController {
    @Autowired
    IPigInfoService pigInfoService;

    /**
     * 增加新猪
     * @param json
     * @return
     */
    @PostMapping("/addpig")
    public Map addPig(@RequestBody String json){
        JSONObject jsonObject= JSON.parseObject(json);
        JSONObject data=jsonObject.getJSONObject("data");
        PigInfo pigInfo=JSON.toJavaObject(data,PigInfo.class);
        if(pigInfoService.addPig(pigInfo)) {
            Map<String, String> res = new HashMap<>();
            res.put("message", "success");
            return res;
        }
        else{
            return null;
        }

    }

    /**
     * 增加猪的健康信息
     * @param pigSelfInfo
     * @return
     */
    @PostMapping("/addselfinfo")
    public boolean addSelfInfo(@RequestBody PigSelfInfo pigSelfInfo){
        return pigInfoService.addSelfInfo(pigSelfInfo);
    }

    /**
     * 获得猪最近24小时健康信息
     * @param pigId
     * @return
     */
    @RequestMapping(value = "/getPigHealthInfo24/{pigId}",method = RequestMethod.GET)
    public List<InfoPig> getPigHealthInfoBefore24(@PathVariable String pigId){
        return pigInfoService.getPigHealthInfo(pigId,24);
    }

    /**
     * 获得猪最近12小时健康信息
     * @param pigId
     * @return
     */
    @RequestMapping(value = "/getPigHealthInfo12/{pigId}",method = RequestMethod.GET)
    public List<InfoPig> getPigHealthInfoBefore12(@PathVariable String pigId){
        return pigInfoService.getPigHealthInfo(pigId,12);
    }

    /**
     * 获得猪最近1分钟健康信息
     * @param pigId
     * @return
     */
    @RequestMapping(value = "/getPigHealthInfo1/{pigId}",method = RequestMethod.GET)
    public List<InfoPig> getPigHealthInfoBefore1(@PathVariable String pigId){
        return pigInfoService.getPigHealthInfo(pigId,1);
    }

    @GetMapping("/initSensor")
    public String initSensor(){
        return  null;
    }

    @GetMapping("/getAllPig")
    public List<PigInfo> getAllPig(){
        return pigInfoService.getAllPigInfo();
    }

    @RequestMapping(value = "/getPigInfo/{pigId}",method = RequestMethod.GET)
    public PigInfo getPigInfo(@PathVariable String pigId){
        return pigInfoService.getPigInfo(pigId);
    }

}
