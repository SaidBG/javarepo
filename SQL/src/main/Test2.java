package main;


public class Test2 {
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileManager test = new FileManager();
		Person person = new Person ();
		Person person1 = new Person ();
		Person person2 = new Person ();
		Person person3 = new Person();
		Person person4 = new Person();
		
		
		person.setId(1);
		person1.setId(2);
		person2.setId(3);
		person3.setId(4);
		person4.setId(5);
		
		test.load(person);
		test.load(person1);
		test.load(person2);
		test.load(person3);
		test.load(person4);
		
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
	}

}
