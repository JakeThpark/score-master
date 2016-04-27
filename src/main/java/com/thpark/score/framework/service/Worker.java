package com.thpark.score.framework.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.*;

import java.util.concurrent.Future;

/**
 * Created by thpark on 2016-04-25.
 */
@Component
public interface Worker{

    /**
     * @return true if the worker is up and running.
     */
//    public boolean isRunning();

    /**
     * @return true if the worker is stopped and not running.
     */
//    public boolean isStopped();

    /**
     *
     */
//    public void initialize();

    /**
     * Request graceful stop to the worker. This method is blocking method.
     */
//    public void stop();

    /**
     * @return
     */
//    @Async
    public  void run();

}
