package com.thpark.score;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ScoreMasterApplication implements CommandLineRunner{

//	CrawlerInitializer crawlerInitializer;
//
//	public ScoreMasterApplication(){
//		System.out.println("ScoreMasterApplication Constructor");
//		initCrawler();
//	}
//
//	private void initCrawler(){
//		System.out.println("ScoreMasterApplication initService");
//		crawlerInitializer = new CrawlerInitializer("baseball");
//		crawlerInitializer.populateCrawlereMap();
//	}

	public static void main(String[] args) {
		SpringApplication.run(ScoreMasterApplication.class, args);
	}

	@Override
	public void run(String... args){

	}
}
