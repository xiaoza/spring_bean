package com.zaikejian.lecture.spring_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiaoz on 2017/2/13.
 */
public class CdApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CdConfig.class);
		CdPlayer player = context.getBean(CdPlayer.class);
		player.play();
	}
}
