package com.banksteel.boot.autoconfigure;

import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.*;

import javax.servlet.MultipartConfigElement;

/**
 * 配置类
 */
@Configuration
@ComponentScan(basePackages = {"com.zhanlu.meta"})
public class BoneAutoConfiguraction {

    /**
     * 附件上传配置
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个附件的大小
        factory.setMaxFileSize("100MB");
        // 设置总上传数据总大小
        factory.setMaxRequestSize("4096MB");
        return factory.createMultipartConfig();
    }
}
