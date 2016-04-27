package com.thpark.score.framework.worker;

import com.thpark.score.CrawlerService;

/**
 * Created by thpark on 2016-04-27.
 */
public class AbstractCrawlerWorker implements CrawlerWorker {
    private String gameId;
    private String crawlerUrl;

    @Override
    public void initialize(String _gameId, String _crawlerUrl) {
        this.gameId = _gameId;
        this.crawlerUrl = _crawlerUrl;
    }

    @Override
    public void start() {
        while(true) {
            try {
                System.out.println("Running....gameId["+gameId+"],crawlerUrl["+crawlerUrl+"]");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {

    }
}
