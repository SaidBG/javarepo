package test;

import java.util.Timer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyThread test = new MyThread();

		test.run();

		System.out.println("d,eih");
		 */

		Timer timer = new Timer();
		
		
		
		
		MyTimer monTimer = new MyTimer();


		 timer.schedule(monTimer,1000, 1000);






	}

}
