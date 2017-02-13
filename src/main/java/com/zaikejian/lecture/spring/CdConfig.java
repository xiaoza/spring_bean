package com.zaikejian.lecture.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Configuration
public class CdConfig {

	@Bean
	public MediaPlayer cdPlayer(CompactDisc cd) {
		return new CdPlayer(cd);
	}

	@Bean
	public CompactDisc cd() {
		return new CdOne();
	}
}
