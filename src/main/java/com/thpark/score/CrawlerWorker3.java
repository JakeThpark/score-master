package com.thpark.score;

import com.thpark.score.framework.service.AbstractWorker;
import com.thpark.score.framework.service.Worker;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by thpark on 2016-04-21.
 */
@Service("CrawlerWorker")
//public class CrawlerWorker {
public class CrawlerWorker3 implements Worker{ //extends AbstractWorker {
    public String crawlerUrl;

    public CrawlerWorker3( ){
        crawlerUrl = "DEFAULT";
    }

    public CrawlerWorker3(String crawlerUrl ){
        this.crawlerUrl = crawlerUrl;
    }

    public void start(){
        System.out.println("this.crawlerUrl[" + crawlerUrl + "]");
    }

    public void stop(){
    }

    public void registerCrawlerUrl(String crawlerUrl) {
        this.crawlerUrl = crawlerUrl;
    }
    @Override
    public void run() {
        System.out.println("CrawlerWorker~~~~~~~~~~~~~run");
        System.out.println("this.crawlerUrl[" + crawlerUrl + "]");
//        super.run();
    }

//    public void run() {
//        try {
//            testAsync();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (Throwable t) {
//            t.printStackTrace();
//        } finally {
//        }
//        return new AsyncResult<String>("");
//    }
//    public void testAsync(){
//        try {
//            while (true){
//                System.out.println(Thread.currentThread().getName()+"-processRun Sleeping now...");
//                Thread.currentThread().sleep(10000);
//            }
////
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (Throwable t) {
//            t.printStackTrace();
//        } finally {
//        }
//    }
}
