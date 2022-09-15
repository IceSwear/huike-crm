package com.huike;

import com.huike.clues.service.ITbActivityService;
import com.huike.clues.service.impl.SysDictTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动程序
 * 
 * 
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@EnableScheduling
@EnableTransactionManagement
public class HuiKeApplication implements CommandLineRunner {

    @Autowired
    private ITbActivityService activityService;

    public static void main(String[] args){
        SpringApplication.run(HuiKeApplication.class, args);
    }

    @Override
    public void run(String... args)  {

    }
}

