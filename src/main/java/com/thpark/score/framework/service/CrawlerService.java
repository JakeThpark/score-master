package com.thpark.score.framework.service;

import com.thpark.score.framework.worker.CrawlerWorker;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by thpark on 2016-04-27.
 */
@Component
public interface CrawlerService {
    void addCrawlerWorker(String gameId, CrawlerWorker crawlerWorker);
    CrawlerWorker getCrawlerWorkerByGameId(String gameId);
    int getCrawlerWorkerCount();
    void stopCrawlerWorkerByGameId(String gameId);
    void removeCrawlerWorkerByGameId(String gameId);
    void initialize();
}
