package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class EcritureThread extends Thread {
	Timer monTimer = new Timer();
	MultiThread test;
	
	public EcritureThread (MultiThread test) {
		this.test = test;
		
	}
	
	
	
	public void run() {
		
	
			test.write();
			
	

	}

}







