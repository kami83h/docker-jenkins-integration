package com.kami83h.dockerjenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/")
public class DockerJenkinsDemoApplication {

    @GetMapping
    public String getMessage() {
        return "Getting inside the Controller";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsDemoApplication.class, args);
    }

}
