package testjunit;

public class Exercice1 {

	
	private String  myString ="";
	
	public void purge () {
		this.myString = "";
	
	}
	
	public void append (String s) {
		this.myString = this.myString.concat(s);
			
		}

	
	public void decrement() {
		this.myString = this.myString.substring(0, myString.length() - 1 );
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}


	
	
}
