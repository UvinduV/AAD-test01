package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPestry {
    public FishPestry(){
        System.out.println("like fish fish pestry");
    }
}
