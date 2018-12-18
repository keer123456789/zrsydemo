package com.sjcl.zrsy_demo.controller;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import com.sjcl.zrsy_demo.domain.PigHouse;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.service.implement.PighouseEvnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
        return pighouseEvnService.addEvnInfo(envInfo);
    }

    /**
     *
     * @param pigHouse
     * @return
     */
    @PostMapping("/addPighouse")
    public boolean addPighouse(@RequestBody PigHouse pigHouse){
        return pighouseEvnService.addPigHouse(pigHouse);
    }

    @RequestMapping(value = "/getPigHouseEnv/{pigHouseId}",method = RequestMethod.GET)
    public List<EnvInfo> getPigHouseEnv(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigHouseEnv(pigHouseId);
    }

    @RequestMapping(value = "/getPigList/{pigHouseId}",method = RequestMethod.GET)
    public List<PigInfo>getPigList(@PathVariable String pigHouseId){
        return pighouseEvnService.getPigList(pigHouseId);
    }


}
