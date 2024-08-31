package org.example.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
public class ChickenBun {
    public ChickenBun(){
        System.out.println("like Chicken bun");
    }
}
