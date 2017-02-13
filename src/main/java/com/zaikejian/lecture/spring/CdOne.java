package com.zaikejian.lecture.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
@Conditional(MagicExistsCondition.class)
@Qualifier("one")                               // 指定限定符为one
public class CdOne implements CompactDisc {
	public void sing() {
		System.out.println("cd 1 is singing");
	}
}
