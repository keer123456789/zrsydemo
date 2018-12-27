package com.sjcl.zrsy_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sjcl.zrsy_demo.domain.Sensor;
import com.sjcl.zrsy_demo.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
@RestController
public class SensorController {
    @Autowired
    ISensorService sensorService;

    @GetMapping("/getKey")
    public String getKey(){
        return getKeyPairString("./keypair.txt");
    }

    @PostMapping("/testkey")
    public boolean testKey(@RequestBody String json){
       JSONObject jsonObject= JSON.parseObject(json);
       String key =(String)jsonObject.get("key");
       String trueKey=getKeyPairString("./keypair.txt");
       if(trueKey.equals(key)){
           return true;
       }
       else {
           return false;
       }
    }

    /**
     * 通过ERC721ID查询传感器的信息
     * @param ERC721ID
     * @return
     */
    @GetMapping("/getPigSensorByERC721/{ERC721ID}")
    public Sensor getSensorInfo(@PathVariable String ERC721ID){
        return sensorService.getSensor(ERC721ID);
    }

    /**
     * 增加传感器的信息
     * @param sensor
     * @return
     */
    @PostMapping("/addPigSensor")
    public boolean addPigSensor(@RequestBody Sensor sensor){
        return sensorService.addSensor(sensor);
    }

    /**
     *
     * @param path
     * @return
     */
    private String getKeyPairString(String path){
        try {
            FileInputStream in = new FileInputStream(path);
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            String key = new String(buffer);
            return key;
        }catch (Exception e){
            return null;
        }
    }
}
