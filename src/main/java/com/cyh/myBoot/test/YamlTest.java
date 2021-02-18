package com.cyh.myBoot.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "testaaa")
public class YamlTest {
    private int age;
    private String name;
}
