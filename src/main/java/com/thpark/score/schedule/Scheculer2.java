package com.thpark.score.schedule;

//import com.thpark.score.CrawlerWorker;
import com.thpark.score.CrawlerWorker2;
import com.thpark.score.InstanceNewClass;
import com.thpark.score.InstanceTest;
import com.thpark.score.framework.service.AbstractWorker;
import com.thpark.score.framework.service.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.management.StringValueExp;

/**
 * Created by thpark on 2016-04-26.
 */
@Service
//@EnableAsync
public class Scheculer2 {

//    @Autowired
//    InstanceTest instanceTest;

//    @Autowired
//    CrawlerWorker aCrawlerWorker;

//    @Autowired
//    @Qualifier("CrawlerWorker")
//    Worker aCrawlerWorker;

//    @Autowired
//    @Qualifier("CrawlerWorker")
//    AbstractWorker iCrawlerWorker ;
//
//    @Autowired
//    @Qualifier("CrawlerWorker2")
//    Worker iCrawlerWorker2;

//    @Autowired
//    CrawlerWorker crawlerWorker;

//    @Autowired
//    InstanceNewClass instanceNewClass;

    @Scheduled(fixedRate = 5000)
    public void instanceTest(){
        InstanceNewClass instanceNewClass = new InstanceNewClass();
        System.out.println("instanceNewClass instance1["+instanceNewClass+"]");
        instanceNewClass.init();
        System.out.println("instanceNewClass instance2["+instanceNewClass+"]");
        System.out.println("Scheculer2="+String.valueOf(instanceNewClass.getAddCount()));

//        System.out.println("Scheculer2="+String.valueOf(instanceTest.getAddCount()));
//        iCrawlerWorker
//        iCrawlerWorker.
//        crawlerWorker.run();
//        crawlerWorker.registerCrawlerUrl("fdasfdsa");

//        aCrawlerWorker.run();
//        AbstractWorker w = new CrawlerWorker();
//        System.out.println("AbstractWorker CrawlerWorker=" + w.getCrawlerUrl());
//        ((CrawlerWorker)w).registerCrawlerUrl("fsadas");
//        System.out.println("AbstractWorker CrawlerWorker=" + w.getCrawlerUrl());
//        w = new CrawlerWorker2();
//        w.getCrawlerUrl();
//        ()

//        CrawlerWorker cw = new CrawlerWorker();
//        cw.registerCrawlerUrl("afds");
//        crawlerWorker.run();
    }
}
