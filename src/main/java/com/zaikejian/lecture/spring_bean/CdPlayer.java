package com.zaikejian.lecture.spring_bean;

import org.springframework.stereotype.Component;

/**
 * Created by xiaoz on 2017/2/13.
 */
@Component
public class CdPlayer implements MediaPlayer {
	private CompactDisc cd;

	public CdPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.sing();
	}
}
