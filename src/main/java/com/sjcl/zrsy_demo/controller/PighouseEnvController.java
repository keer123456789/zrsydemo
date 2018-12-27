package com.sjcl.zrsy_demo.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.InfoEnv;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.service.implement.PighouseEvnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class PighouseEnvController {
    @Autowired
    PighouseEvnServiceImpl pighouseEvnService;

    /**
     * 增加猪舍的环境信息
     * @param envInfo
     * @return
     */
    @PostMapping("/envInfo")
    public boolean envInfo(@RequestBody EnvInfo envInfo){
        if(envInfo.getCO2()!=null&&envInfo.getDatetime()!=null&&envInfo.getTemperature()!=null){
            return pighouseEvnService.addEvnInfo(envInfo);
        }
        else
            return false;
    }

    @GetMapping("/getPigHouseInfoByERC721/{ERC721ID}")
    public PigHouse getPigHouseInfoByERC(@PathVariable String ERC721ID){
        return pighouseEvnService.getPigHouseInfoByERC721(ERC721ID);
    }

    /**
     *增加猪舍
     * @param json
     * @return
     */
    @PostMapping("/addPighouse")
    public Map addPighouse(@RequestBody String  json){
        JSONObject jsonObject= JSON.parseObject(json);
        JSONObject data=jsonObject.getJSONObject("data");
        PigHouse pigHouse=JSON.toJavaObject(data,PigHouse.class);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        pigHouse.setTime(df.format(new Date()));
        if(pighouseEvnService.addPigHouse(pigHouse)) {
            Map<String, String> res = new HashMap<>();
            res.put("message", "success");
            return res;
        }
        else{
            return null;
        }
    }

//    @RequestMapping(value = "/getPigHouseEnv24/{pigHouseId}",method = RequestMethod.GET)
    public List<InfoEnv> getPigHouseEnv24(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigHouseEnv(pigHouseId,24);
    }

    @RequestMapping(value = "/getPigList/{pigHouseId}",method = RequestMethod.GET)
    public List<PigInfo>getPigList(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigList(pigHouseId);
    }

//    @RequestMapping(value = "/getPigHouseEnv12/{pigHouseId}",method = RequestMethod.GET)
    public List<InfoEnv> getPigHouseEnv12(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigHouseEnv(pigHouseId,12);
    }
    @RequestMapping(value = "/getPigHouseEnv/{pigHouseId}",method = RequestMethod.GET)
    public List<InfoEnv> getPigHouseEnv(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigHouseEnv(pigHouseId,5);
    }

    /**
     * 获得猪舍列表信息
     * @return
     */
    @GetMapping("/pigHouseList")
    public List<PigHouse> getPigHouselist(){
        return pighouseEvnService.getPigHouselist();
    }
    @GetMapping("/pigHouseIdList")
    public List<String> getPigHouseIdlist(){
        return pighouseEvnService.getPigHouseIdList();
    }

}
