package com.balashevich.address.configuration;

import javax.annotation.PostConstruct;

import com.lob.Lob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Value("${lob.apiKey}")
    private String apiKey;

    @PostConstruct
    public void ConfigureLob(){
        Lob.init(apiKey);
    }
}
