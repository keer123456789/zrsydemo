package com.sjcl.zrsy_demo.controller;

import com.sjcl.zrsy_demo.domain.Commodity;
import com.sjcl.zrsy_demo.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class SellerController {
    @Autowired
    ISellerService sellerService;
    @PostMapping("/add")
    public boolean add(@RequestBody Commodity commodity){
        return sellerService.sellerAddCommodity(commodity);
    }
}
