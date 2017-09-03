package com.banksteel.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口类
 */
@SpringBootApplication
public class TestMain {

    public static void main(String[] args) throws Exception {
        Main.run(TestMain.class, args);
    }

}
