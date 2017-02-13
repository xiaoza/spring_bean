package com.zaikejian.lecture.spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
@Profile("prod")
public class CdTwo implements CompactDisc {
	public void sing() {
		System.out.println("cd 2 is singing");
	}
}
