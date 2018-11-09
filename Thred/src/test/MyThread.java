package test;

public class MyThread extends Thread {
	
	private MultiThread mt;
	
	public  MyThread (MultiThread mt) {
		this.mt = mt;
		
	}
	public void run() {
		mt.afficher();
	}
	

}
