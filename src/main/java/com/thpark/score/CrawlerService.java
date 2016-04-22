package com.thpark.score;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by thpark on 2016-04-21.
 */
@Service
public class CrawlerService {

    private HashMap<String, CrawlerWorker> crawlerMap;
    private String sportType;

    public HashMap<String, CrawlerWorker> getCrawlerMap() {
        return crawlerMap;
    }

    public void setCrawlerMap(HashMap<String, CrawlerWorker> crawlerMap) {
        this.crawlerMap = crawlerMap;
    }

    public CrawlerService(){
        System.out.println("CrawlerService Constructor START!!!!");
//        HashMap<String, CrawlerWorker> crawlerMap = new HashMap<String, CrawlerWorker>();
        System.out.println("crawlerMap ["+crawlerMap+"]");
        System.out.println("CrawlerService Constructor END!!!!");
    }
    public CrawlerService(String sportType){
        this.sportType = sportType;
    }

//    public void populateCrawlereMap(){
//        crawlerMap = new HashMap<String, Crawler>();
//        Crawler crawler = new Crawler("crawlerUrl");
//        crawlerMap.put("crawlerUrl",crawler);
//    }

    public void start(){
        for(CrawlerWorker crawler : crawlerMap.values()){
            crawler.start();
        }
    }
    @Async
    public void initCrawler(String gameId){
        System.out.println("initCrawler GameId["+gameId+"]");
        CrawlerWorker crawlerWorker = new CrawlerWorker(gameId);
        System.out.println("initCrawler crawlerMap["+crawlerMap+"]");
        crawlerMap.put(gameId, crawlerWorker);
        crawlerWorker.start();
        return;
    }

    public void checkContainGameID(ArrayList<String> gameIdList){
        System.out.println("checkContainGameID gameIdList["+gameIdList+"]");
//        HashMap<String, Crawler> resultMap = new HashMap<String, Crawler>();
        for(String gameId : gameIdList){
            System.out.println("checkContainGameID GameId["+gameId+"]");
            System.out.println("checkContainGameID crawlerMap["+crawlerMap+"]");
            if(crawlerMap == null || !crawlerMap.containsKey(gameId)){
                //크롤링 인스턴스 맵에 해당 키가 없으면, init 동작을 수행한다.
                initCrawler(gameId);
            }
        }
    }

}
