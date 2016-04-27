package com.thpark.score;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by thpark on 2016-04-27.
 */
@Component
@Scope("prototype")
public class InstanceNewClass {

    @Autowired
    InstanceTest instanceTest;

    public InstanceNewClass(){
        System.out.println("InstanceNewClass Constructor");
    }

    public void init(){
        instanceTest.init();
    }
    public int getAddCount(){
        return instanceTest.getAddCount();
    }
}
