package main;

import java.util.ArrayList;
import java.util.List;

public class MultiThread {

	private boolean stopMain = false;

	public MultiThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	int i = 0;
	String s = "";
	List <String> liste = new ArrayList<>();
		
	public List<String> getListe() {
		return liste;
	}

	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	public void alphaMain() {
		EcritureThread et = new EcritureThread(this);
		LectureThread lt = new LectureThread(this);
		et.start();
		lt.start();
		
	}
	public void write () {	
		byte b = 'A' - 1;
		
		String s = null;

		while (b !='Z') {
			b++;
			byte [] bs = {b,b,b};
				
			s = new String(bs);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			liste.add(s);
			System.out.println(s);
		}
	}
	public void read () {
		for(String s:liste) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			}
			i++;
		s = liste.get(i);
		System.out.println(s);  
		}


	}
}
	

	



































