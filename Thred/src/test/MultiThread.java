package test;

public class MultiThread {
	
	boolean flag = false;
	
	
	public void main () {
		MyThread mt = new MyThread(this);
	}
	
	public void afficher() {
		System.out.println("test");
		
	}

}
