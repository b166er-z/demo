package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ConfigurationProperties(prefix="dog")
@Component
public class Dog {
    private String name;
    private int age;
    private List<String> hobby;
}
