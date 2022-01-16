package com.project.webutility;

import com.project.LibraryUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebUtilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebUtilityApplication.class, args);

        String appName = LibraryUtility.getAppName();
        System.out.println("Welcome to " + appName);
    }

}
