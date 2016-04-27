package com.thpark.score.framework.service;

import com.thpark.score.framework.worker.CrawlerWorker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by thpark on 2016-04-27.
 */
@Component
public abstract class AbstractCrawlerService implements CrawlerService{
    private HashMap<String, CrawlerWorker> crawlerServiceMap;

    public HashMap<String, CrawlerWorker> getCrawlerServiceMap() {
        return crawlerServiceMap;
    }

    public void setCrawlerServiceMap(HashMap<String, CrawlerWorker> crawlerServiceMap) {
        this.crawlerServiceMap = crawlerServiceMap;
    }

    public AbstractCrawlerService(){
        System.out.println("AbstractCrawlerService Constructor");
        HashMap<String, CrawlerWorker>  crawlerServiceMap = new HashMap<String, CrawlerWorker>();
    }

    @Override
    public void initialize() {

    }

    @Override
    public int getCrawlerWorkerCount() {
        return 0;
    }

    @Override
    public CrawlerWorker getCrawlerWorkerByGameId(String gameId){
        return null;
    }

    @Override
    public void addCrawlerWorker(String gameId, CrawlerWorker crawlerWorker){

    }

    @Override
    public void stopCrawlerWorkerByGameId(String gameId) {

    }

    @Override
    public void removeCrawlerWorkerByGameId(String gameId) {

    }

    public void initCrawler(String gameId){
        System.out.println("initCrawler GameId["+gameId+"]");
    }

    public void checkContainGameID(ArrayList<String> gameIdList){
        System.out.println("checkContainGameID gameIdList["+gameIdList+"]");
        for(String gameId : gameIdList){
            System.out.println("checkContainGameID GameId["+gameId+"]");
            System.out.println("checkContainGameID crawlerMap["+crawlerServiceMap+"]");
            if(crawlerServiceMap == null || !crawlerServiceMap.containsKey(gameId)){
                //크롤링 인스턴스 맵에 해당 키가 없으면, init 동작을 수행한다.
                initCrawler(gameId);
            }
        }
    }


}
