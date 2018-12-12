package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPigInfoDao;
import com.sjcl.zrsy_demo.domain.BigchaindbData;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import org.springframework.stereotype.Repository;

@Repository
public class PigInfoDao implements IPigInfoDao {
    /**
     * 增加新猪
     * @param pigInfo
     * @return
     */
    @Override
    public boolean addPig(PigInfo pigInfo) {
        try {
            String assetId= BigchaindbUtil.createAsset(pigInfo);
            return assetId != null;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 上传猪的特征信息
     * * @param pigSelfInfo
     * @return
     */
    @Override
    public boolean addSelfInfo(PigSelfInfo pigSelfInfo) {
        try {
            BigchaindbUtil.transferToSelf(new BigchaindbData(pigSelfInfo),BigchaindbUtil.getAssetId(pigSelfInfo.getId(),PigSelfInfo.class.toString()));
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
