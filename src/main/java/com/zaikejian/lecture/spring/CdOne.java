package com.zaikejian.lecture.spring;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
@Conditional(MagicExistsCondition.class)
public class CdOne implements CompactDisc {
	public void sing() {
		System.out.println("cd 1 is singing");
	}
}
