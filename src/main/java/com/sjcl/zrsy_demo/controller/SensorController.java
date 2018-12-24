package com.sjcl.zrsy_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
@RestController
public class SensorController {

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
