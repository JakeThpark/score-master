package com.thpark.score.framework.worker;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by thpark on 2016-04-27.
 */
@Component
public interface CrawlerWorker extends Runnable {

    void initialize(String _gameId, String _crawlerUrl);

    @Async
    void start();
}
