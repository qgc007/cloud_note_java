package com.kebab.cloud_note_java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kebab.cloud_note_java.mapper")
public class CloudNoteJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNoteJavaApplication.class, args);
    }

}
