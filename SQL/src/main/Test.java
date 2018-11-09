package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			
		
		//Address quatre = new Address("Russie", 69, "Russie");
		Address une = new Address("888 RUE DU HUIT", 65, "Venus");
		Address deux = new Address("777 RUE DU SEPT", 65, "Pluton");
		Address trois = new Address("666 RUE DU SIX", 65, "Styx");
		Address quatre = new Address("999 RUE DU NEUF",65, "Jupiter");
		Address cinq = new Address("1010 RUE DU DIX",65, "Saturne");
		
		Person kiab = new Person ("mechant","Kiab", 99,trois); 
		kiab.setId(1);
		Person gerard = new Person ("excellent","Gerard", 99,deux);
		gerard.setId(2);
		Person natalia = new Person ("splendide","Natalia",99, une);
		natalia.setId(3);
		Person said  = new Person ("magnifique","Saïd", 99, quatre);
		said.setId(4);
		Person jc = new Person("gentil", "Jean-Charles", 99 , cinq);
		jc.setId(5);
		
		
		FileManager t = new FileManager();
		
		t.save(kiab);
		t.save(natalia);
		t.save(gerard);
		t.save(said);
		t.save(jc);
		
	}

}
