package org.example;

import org.example.config.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx =new AnnotationConfigApplicationContext();
        ctx.register(config.class);
        ctx.refresh();
    }
}