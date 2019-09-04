package cn.ouyangnengda.spikesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ouyangnengda.spikesystem.dao")
public class  SpikesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpikesystemApplication.class, args);
    }

}
