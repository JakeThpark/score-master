package com.thpark.score.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.*;

import java.util.concurrent.Future;

/**
 * Created by thpark on 2016-04-25.
 */
@Component("AbstractWorker")
public abstract class AbstractWorker implements Worker {

    protected String crawlerUrl;

    protected abstract void processRun();

    public AbstractWorker(){
        crawlerUrl = "AbstractWorker DEFAULT";
    }
    public String getCrawlerUrl() {
        return crawlerUrl;
    }

    public void setCrawlerUrl(String crawlerUrl) {
        this.crawlerUrl = crawlerUrl;
    }
//    @Override
//    public void initialize() {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }

//    @Override
//    public boolean isRunning() {
//        return false;
//    }
//
//    @Override
//    public boolean isStopped() {
//        return false;
//    }
//    @Async
//    public void start(){
//        run();
//    }

//    @Override
//    public void run() {
//        System.out.println("CALL AbstractWorker run");
//        try {
//            processRun();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (Throwable t) {
//            t.printStackTrace();
//        } finally {
//        }
//    }

//    protected void processRun(){
//        while(true){
//            System.out.println(Thread.currentThread().getName()+"-processRun Sleeping now...");
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
