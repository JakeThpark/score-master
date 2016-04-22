package com.thpark.score;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thpark on 2016-04-21.
 */

@Service
public class GameChecker {
    private int instanceCnt;

    public int getInstanceCnt() {
        return instanceCnt;
    }

    public void setInstanceCnt(int instanceCnt) {
        this.instanceCnt = instanceCnt;
    }

    public GameChecker(){
        instanceCnt = 0;
    }
    public ArrayList<String> checkGame(){
        ArrayList<String> gameList = new ArrayList<String>();
        gameList.add("111");
        gameList.add("222");
        gameList.add("333");
        System.out.println("checkGame Result["+gameList+"]");
        return gameList;
    }
}
