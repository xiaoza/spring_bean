package com.zaikejian.lecture.spring;

import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
public class CdOne implements CompactDisc {
	public void sing() {
		System.out.println("cd 1 is singing");
	}
}
