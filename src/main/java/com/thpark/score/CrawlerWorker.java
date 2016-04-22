package com.thpark.score;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by thpark on 2016-04-21.
 */
@Component
//public class CrawlerWorker {

public class CrawlerWorker extends Thread{
    private String crawlerUrl;

    public CrawlerWorker( ){
    }

    public CrawlerWorker(String crawlerUrl ){
        this.crawlerUrl = crawlerUrl;
    }

//    public void initialize(){
//
//    }
    @Override
    public void run(){
        try {
            int i = 0;
            while(true) {
                System.out.println("this.crawlerUrl[" + this.crawlerUrl + "]");
                Thread.sleep(5000);
                i++;
                if(i==5){
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

//    @Async
//    public void start(){
//        try {
//            int i = 0;
////            while(true) {
//                System.out.println("this.crawlerUrl[" + this.crawlerUrl + "]");
//                Thread.sleep(10000);
//            return;
////                i++;
////                if(i==5){
////                    break;
////                }
////            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void stop(){
//
//    }

}
