package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class LectureThread extends Thread {
	MultiThread test;
	Timer monTimer = new Timer();

	
	
	
	
	public LectureThread (MultiThread test) {
		this.test = test;
	}
	public void run () {
		test.read();
		

	}


}



