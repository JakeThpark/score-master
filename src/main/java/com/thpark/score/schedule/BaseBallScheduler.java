package com.thpark.score.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by thpark on 2016-04-27.
 */
@Service
public class BaseBallScheduler {

//    @Scheduled(fixedRate = 1000)
//    public void CheckLiveGameList(){
//        //ToDo : Game������ üũ�ؼ� GameID List�� ���´�.(DB Select)
//        //Make Sample Data
//        ArrayList<String> sampleGameIdList = new ArrayList<String>();
//        sampleGameIdList.add("GameID-1");
//        sampleGameIdList.add("GameID-2");
//        sampleGameIdList.add("GameID-3");
//        //Todo : ���� GameID List���� Crawler URL�� �����.
//        //Make SampleData
//        HashMap<String,String> crawlerURLMap = new HashMap<String,String>();
//        crawlerURLMap.put(sampleGameIdList.get(0),"URL-1");
//        crawlerURLMap.put(sampleGameIdList.get(1),"URL-2");
//        crawlerURLMap.put(sampleGameIdList.get(2),"URL-3");
//
//        System.out.println("GameID List Sample Data ="+sampleGameIdList);
//        System.out.println("crawlerURLMap Sample Data ="+crawlerURLMap);
//        //Todo : ���� ID�� URL�� ������ ServiceMap�� �� Ȯ���Ѵ�.
//        //Todo : �߰��Ǿ��� ũ�ѷ��� �����Ѵ�.
//    }
}
