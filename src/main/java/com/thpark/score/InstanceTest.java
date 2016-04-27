package com.thpark.score;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by thpark on 2016-04-26.
 */
@Component
@Scope("prototype")
public class InstanceTest {
//    private static InstanceTest uniqueInstanceTest = new InstanceTest();
//
//    public static InstanceTest getInstance(){
//        return uniqueInstanceTest;
//    }
    public int instanceCallCount;

    public InstanceTest(){
        System.out.println("InstanceTest Constructor");
        init();
    }
    public void init(){
        instanceCallCount = 0;
    }

    public int getAddCount(){
        instanceCallCount ++;
        return instanceCallCount;
    }
}
