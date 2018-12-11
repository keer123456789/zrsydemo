package com.sjcl.zrsy_demo.controller;

import com.sjcl.zrsy_demo.domain.EnvInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PigController {
    @PostMapping("/addpig")
    public boolean addPig(@RequestBody EnvInfo envInfo){
        return false;
    }
}
