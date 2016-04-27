package com.thpark.score;

import com.thpark.score.framework.service.AbstractWorker;
import org.springframework.stereotype.Component;

/**
 * Created by thpark on 2016-04-26.
 */
@Component("CrawlerWorker2")
public class CrawlerWorker2 extends AbstractWorker {
    private String crawlerUrl;

//    @Override
//    protected void processRun() {
//    }

    public CrawlerWorker2( ){
    }

    public CrawlerWorker2(String crawlerUrl ){
        this.crawlerUrl = crawlerUrl;
    }

    public void start(){
        System.out.println("this.crawlerUrl[" + this.crawlerUrl + "]");
    }

    public void stop(){
    }

//    @Override
//    public void run() {
//        System.out.println("22222");
//    }

//    @Override
//    public void run() {
//        System.out.println("CrawlerWorker22222~~~~~~~~~~~~~run");
//        super.run();
//    }
}
