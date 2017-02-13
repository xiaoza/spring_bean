package com.zaikejian.lecture.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
public class CdPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.sing();
	}
}
