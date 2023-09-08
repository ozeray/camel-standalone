package com.ahmet;

import org.apache.camel.builder.RouteBuilder;

public class AppRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:demo?period=1000")
                .routeId("demoTimer")
//                .process(e -> e.getMessage().setBody(new Date()))
//                .log("${header.firedTime} -> ${body}");
                .bean("appBean", "sayMyName")
                .log("${body}");
    }
}
