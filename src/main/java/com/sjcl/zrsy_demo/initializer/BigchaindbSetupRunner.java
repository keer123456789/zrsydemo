package com.sjcl.zrsy_demo.initializer;

import com.bigchaindb.builders.BigchainDbConfigBuilder;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import java.security.Security;


public class BigchaindbSetupRunner implements CommandLineRunner {
    @Value("${blockchaindb.base-url}")
    private String baseUrl;

    @Override
    public void run(String... args) throws Exception {
        Security.addProvider(new EdDSASecurityProvider());

        BigchainDbConfigBuilder
                .baseUrl(baseUrl)
                .setup();
    }
}
