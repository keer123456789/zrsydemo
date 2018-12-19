package com.sjcl.zrsy_demo.dao.implement.bigchaindb;

import com.bigchaindb.api.AssetsApi;
import com.sjcl.zrsy_demo.bigchaindb.BigchaindbUtil;
import com.sjcl.zrsy_demo.dao.IPigInfoDao;
import com.sjcl.zrsy_demo.domain.BigchaindbData;
import com.sjcl.zrsy_demo.domain.InfoPig;
import com.sjcl.zrsy_demo.domain.PigInfo;
import com.sjcl.zrsy_demo.domain.PigSelfInfo;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
     * 获得全部猪的信息
     * @return
     */
    @Override
    public List<PigInfo> getAllPigInfo() {
        try{
            return BigchaindbUtil.getAllAssets(PigInfo.class.getCanonicalName(),PigInfo.class);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 获得健康信息
     * @param pigId
     * @return
     */
    @Override
    public List<InfoPig> getPigHealthInfo(String pigId, int hour) {
        try {
            List<PigSelfInfo> pigSelfInfos= BigchaindbUtil.getMetaDatas(BigchaindbUtil.getAssetId(pigId, PigInfo.class.getCanonicalName()), PigSelfInfo.class);
            List<InfoPig> list =new ArrayList<>();
            for(PigSelfInfo pigSelfInfo:pigSelfInfos){
                if(getCurrentTime(hour,pigSelfInfo.getDatetime())){
                    InfoPig infoPig=new InfoPig();
                    infoPig.setTemperature(pigSelfInfo.getTemperature());
                    infoPig.setDatetime(pigSelfInfo.getDatetime());
                    list.add(infoPig);
                }
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PigInfo getPigInfo(String pigId) {
        try {
            return (PigInfo) BigchaindbUtil.getAllAssets(pigId,PigInfo.class).get(0);
        }catch (Exception e){
            return null;
        }
    }

    /**
     *
     * @return
     */
    public static boolean getCurrentTime(int hour,String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        Calendar beforeTime = Calendar.getInstance();
        if(hour==24) {
            beforeTime.add(Calendar.DATE, -1);// 24小时之前的时间
        }
        else if(hour==12){
            beforeTime.add(Calendar.HOUR, -12);// 12小时之前的时间
        }
        else{
            beforeTime.add(Calendar.MINUTE, -1);// 1分钟之前的时间
        }
        Date beforeD = beforeTime.getTime();
        System.out.println(beforeD);
        Date date1=sdf.parse(date);
        if(beforeD.after(date1)){
            return true;
        }
        else{
            return false;
        }
    }


}
