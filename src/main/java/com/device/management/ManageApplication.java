package com.device.management;

import com.device.management.dataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@Import({
        DynamicDataSourceRegister.class
})
@MapperScan("com.device.management.mapper")
@EnableScheduling
public class ManageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }
}
