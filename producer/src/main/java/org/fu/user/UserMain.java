package org.fu.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.fu.user.mapper")
public class UserMain {

    public static void main(String[] args) {
        SpringApplication.run(UserMain.class);
    }

}
