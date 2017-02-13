package com.zaikejian.lecture.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Configuration
@ComponentScan
public class CdConfig {

//	@Bean
//	public MediaPlayer cdPlayer(CompactDisc cd) {
//		return new CdPlayer(cd);
//	}
//
//	@Bean
//	@Profile("dev")
//	public CompactDisc cd1() {
//		return new CdOne();
//	}
//
//	@Bean
//	@Profile("prod")
//	public CompactDisc cd2() {
//		return new CdTwo();
//	}
}
