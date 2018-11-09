package test;

public class Machin {

	public void modify (int a ) {
		a = 200;
		return;
	}
	
	public void modify (String s) {
		s = "xXx";
		
	}
	
	public void modify (Truc t) {
		t.setValeur(4000);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Machin test = new Machin();
		Truc t = new Truc();
		
		
		
		
		t.setValeur(2);
		
		test.modify(t);
		System.out.println(t.getValeur());
		
		
	}

}
