package com.sjcl.zrsy_demo.bigchaindb;

import com.bigchaindb.util.KeyPairUtils;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyPair;

public class KeyPairHolder {
    /**
     * 通过./keypair.txt获得密钥对
     * @return
     */
    public static KeyPair getKeyPair(){
        try {
            FileInputStream in = new FileInputStream("./keypair.txt");
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            String key = new String(buffer);
            return KeyPairUtils.decodeKeyPair(key);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 将密钥对存贮在./keypair.txt文件中
     * @param keyPair
     */
    public static void setKeyPair(KeyPair keyPair){
        try{
        FileOutputStream fos = new FileOutputStream("./keypair.txt");
        fos.write(KeyPairUtils.encodePrivateKeyBase64(keyPair).getBytes());
        fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 获得发送交易使用的公钥
     * @return
     */
    public static EdDSAPublicKey getPublic(){
        return (EdDSAPublicKey)getKeyPair().getPublic();
    }

    /**
     * 获得发送交易使用的私钥
     * @return
     */
    public static EdDSAPrivateKey getPrivate(){
        return (EdDSAPrivateKey) getKeyPair().getPrivate();
    }

}
