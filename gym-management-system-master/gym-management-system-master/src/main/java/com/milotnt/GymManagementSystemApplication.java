package com.milotnt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.milotnt.mapper")
public class GymManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GymManagementSystemApplication.class, args);
    }

}
