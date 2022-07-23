package com.kebab.cloud_note_java;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kebab.cloud_note_java.mapper")
@EnableMPP
public class CloudNoteJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNoteJavaApplication.class, args);
    }

}
