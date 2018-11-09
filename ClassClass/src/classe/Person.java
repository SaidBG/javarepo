package classe;

public class Person {
	
	
	public Person (){
		System.out.println("Said le contstructeur");
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Person p = new Person();
		
		//Class <?> klass = p.getClass();
		Class <?> qlass = Class.forName("classe.Person");
		

		
		Person p = (Person)qlass.newInstance();
		
		
		
	}

}
