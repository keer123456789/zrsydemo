package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPighouseEvnDao;
import com.sjcl.zrsy_demo.domain.EnvInfo;
import org.springframework.stereotype.Repository;

@Repository
public class PighouseEvnDao implements IPighouseEvnDao {
    @Override
    public boolean addPighouseEnvInfo(EnvInfo envInfo) {
        return false;
    }
}
