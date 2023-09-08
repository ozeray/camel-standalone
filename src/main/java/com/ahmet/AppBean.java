package com.ahmet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppBean {

    private String name;

    public String sayMyName() {
        return "Hello, " + name;
    }
}
