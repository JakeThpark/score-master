package com.thpark.score.schedule;

import com.thpark.score.CrawlerService;
import com.thpark.score.CrawlerWorker;
import com.thpark.score.GameChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by thpark on 2016-04-21.
 */
@Component
public class SportsSchedule {

    @Autowired
    GameChecker gameChecker;

    @Autowired
    CrawlerService crawlerService;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //1초 단위의 체커가 도는 서비스
    @Scheduled(fixedRate = 1000)
    public void checkSportScheduler(){
        if(crawlerService.getCrawlerMap()==null){
            crawlerService.setCrawlerMap(new HashMap<String,CrawlerWorker>());
        }
        System.out.println("checkSportScheduler Start.......");
        System.out.println("checkSportScheduler crawlerService.getCrawlerMap()["+crawlerService.getCrawlerMap()+"]");
        ArrayList<String> checkGameList = gameChecker.checkGame();
        System.out.println("checkSportScheduler checkGameList["+checkGameList+"]");
        crawlerService.checkContainGameID(checkGameList);
    }

    //1초 단위의 체커가 도는 서비스
//    @Scheduled(fixedRate = 1000)
//    public void checkSportScheduler() throws InterruptedException {
//        System.out.println("[SportsSchedule GameCheck Instance["+gameChecker+"][i="+String.valueOf(gameChecker.getInstanceCnt())+"]");
//        System.out.println("[dateFormat="+dateFormat.format(new Date())+"]checkSportScheduler.......");
//        gameChecker.setInstanceCnt(gameChecker.getInstanceCnt()+1);
//        //(new Crawler(String.valueOf(gameChecker.getInstanceCnt()))).start();
//        //Thread.sleep(1000);
//        if ( gameChecker.checkGame() != null ){
//            //크롤링해야 하는 GameID가 존재할 경우
//            gameChecker.setInstanceCnt(gameChecker.getInstanceCnt()+1);
//            (new Crawler(String.valueOf(gameChecker.getInstanceCnt()))).start();
//        }else{
//            //크롤링해야 하는 GameID가 존재하지 않을 경우(아무런 동작을 안한다??)
//        }
//    }

    //1초 단위의 체커가 도는 서비스
//    @Scheduled(fixedRate = 1000)
//    public void checkSportScheduler2() throws InterruptedException {
//        System.out.println("[Schedule2 GameCheck Instance["+gameChecker+"][i="+String.valueOf(gameChecker.getInstanceCnt())+"]");
//        System.out.println("[dateFormat="+dateFormat.format(new Date())+"]checkSportScheduler.......");
//        gameChecker.setInstanceCnt(gameChecker.getInstanceCnt()+1);
//
//
//        System.out.println("[Schedule2 GameCheck Instance["+gameChecker2+"][i="+String.valueOf(gameChecker2.getInstanceCnt())+"]");
//        System.out.println("[dateFormat="+dateFormat.format(new Date())+"]checkSportScheduler.......");
//        gameChecker2.setInstanceCnt(gameChecker2.getInstanceCnt()+1);
//        //(new Crawler(String.valueOf(gameChecker2.getInstanceCnt()))).start();
//    }


}
