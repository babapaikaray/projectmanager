package com.baba.projectmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.baba.projectmanager"})
@EntityScan("com.baba.projectmanager")
@EnableJpaRepositories("com.baba.projectmanager")
public class ProjectManagerApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ProjectManagerApplication.class, args);
    }
}
