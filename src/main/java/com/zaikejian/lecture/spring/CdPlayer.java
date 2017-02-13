package com.zaikejian.lecture.spring;

/**
 * Created by xiaoz on 2017/2/13.
 */
public class CdPlayer implements MediaPlayer {
	private CompactDisc cd;

	public CdPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.sing();
	}
}
