package testjunit;

public class MyMath {

	public double abs(double d) {
		return Math.abs(d);
	}
	
	public int sqrt(int a) {
		try {
			if (a < 0 ) {
				throw new Exception();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			 
		 
	}

	public int min(int a,int b) {
		return Math.min(a, b);
	}
	
	
	public double random(double a) {
		return Math.random();
	}
}
