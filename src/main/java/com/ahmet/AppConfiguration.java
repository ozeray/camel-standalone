package com.ahmet;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.PropertyInject;

@Configuration
public class AppConfiguration {

    @BindToRegistry
    public AppBean appBean(@PropertyInject("name") String name) {
        return new AppBean(name);
    }

}
