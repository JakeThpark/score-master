package com.thpark.score.schedule;

import com.thpark.score.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Future;

/**
 * Created by thpark on 2016-04-21.
 */
@Service
@EnableAsync
public class SportsSchedule {
//    @Autowired
//    CrawlerWorker crawlerWorker;

//    @Autowired
//    test2AB test2ABtt;
//    @Autowired
//    GameChecker gameChecker;

//    @Autowired
//    CrawlerService crawlerService;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static int time = 0;
    //1초 단위의 체커가 도는 서비스
//    @Scheduled(fixedRate = 1000)
//    public void checkSportScheduler(){
//        if(crawlerService.getCrawlerMap()==null){
//            crawlerService.setCrawlerMap(new HashMap<String,CrawlerWorker>());
//        }
//        System.out.println("checkSportScheduler Start.......");
//        System.out.println("checkSportScheduler crawlerService.getCrawlerMap()["+crawlerService.getCrawlerMap()+"]");
//        ArrayList<String> checkGameList = gameChecker.checkGame();
//        System.out.println("checkSportScheduler checkGameList["+checkGameList+"]");
//        crawlerService.checkContainGameID(checkGameList);
//    }

//    @Scheduled(fixedRate = 5000)
//    public void testWorkerInit(){
//        time++;
//        test2inter.start();
//        crawlerWorker.run();
//        ttt.start();
//        Future<String> result = ttt.start();
//        if(!(result.isDone())){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Waiting for Long Process...");
//        }
//        System.out.println("Done !!");
//    }

    @Autowired
    InstanceTest instanceTest;

    @Scheduled(fixedRate = 1000)
    public void instanceTest(){
//        System.out.println("Scheculer1="+String.valueOf(instanceTest.getAddCount()));
    }

//    @Scheduled(fixedRate = 1000)
//    public void crawlerWorkerInit(){
//        time++;
//        initCrawler(String.valueOf(time));
//
////        System.out.println("initCrawler GameId["+String.valueOf(time)+"]");
////        CrawlerWorker crawlerWorker = new CrawlerWorker(String.valueOf(time));
////        crawlerWorker.start();
////        try {
////            crawlerWorker.run();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//    }

    public void initCrawler(String gameId){
        System.out.println("initCrawler GameId["+gameId+"]");
        CrawlerWorker crawlerWorker = new CrawlerWorker(gameId);
        crawlerWorker.start();
        try {
            crawlerWorker.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        crawlerWorker.run();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return new AsyncResult<String>("");
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
