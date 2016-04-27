package com.thpark.score;

import org.springframework.stereotype.Component;

/**
 * Created by thpark on 2016-04-26.
 */
@Component
public class InstanceTest {
    public int instanceCallCount;

    public InstanceTest(){
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
