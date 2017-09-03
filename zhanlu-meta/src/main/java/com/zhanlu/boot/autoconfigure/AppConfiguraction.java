package com.zhanlu.boot.autoconfigure;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.servlet.MultipartConfigElement;

/**
 * 配置类
 */
@Configuration
@ComponentScan(basePackages = {"com.zhanlu.meta"})
public class AppConfiguraction {

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
