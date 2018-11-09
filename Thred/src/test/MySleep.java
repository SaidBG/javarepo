package test;

public class MySleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThread mt = new MultiThread();
		MyThread test = new MyThread(mt);
		int y = 0;

		        for (int i = 0;
		             i < 15;
		             i++) {
		            y++;
		        	
		        	
		            Thread.sleep(4000);
		            
		           test.run();
		        

	}


}
}