package com.sjcl.zrsy_demo.bigchaindb;

import com.bigchaindb.util.KeyPairUtils;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyPair;

public class KeyPairHolder {
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
    public static void setKeyPair(KeyPair keyPair){
        try{
        FileOutputStream fos = new FileOutputStream("./keypair.txt");
        fos.write(KeyPairUtils.encodePrivateKeyBase64(keyPair).getBytes());
        fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static EdDSAPublicKey getPublic(){
        return (EdDSAPublicKey)getKeyPair().getPublic();
    }

    public static EdDSAPrivateKey getPrivate(){
        return (EdDSAPrivateKey) getKeyPair().getPrivate();
    }

}
