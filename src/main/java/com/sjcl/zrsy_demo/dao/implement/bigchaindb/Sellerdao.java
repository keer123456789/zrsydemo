package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.dao.ISellerDao;
import com.sjcl.zrsy_demo.domain.Commodity;
import org.springframework.stereotype.Repository;

@Repository
public class Sellerdao implements ISellerDao {
    @Override
    public boolean sellerAddCommodity(Commodity commodity) {
        return false;
    }
}
