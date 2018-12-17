package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPigInfoDao;
import com.sjcl.zrsy_demo.domain.BigchaindbData;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

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
            BigchaindbUtil.transferToSelf(new BigchaindbData(pigSelfInfo),BigchaindbUtil.getAssetId(pigSelfInfo.getId(),PigInfo.class.getCanonicalName()));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param pigId
     * @return
     */
    @Override
    public List<PigSelfInfo> getPigInfo(String pigId) {
        try {
            return BigchaindbUtil.getMetaDatas(BigchaindbUtil.getAssetId(pigId, PigInfo.class.getCanonicalName()), PigSelfInfo.class);
        }catch (Exception e){
            return null;
        }
    }



}
