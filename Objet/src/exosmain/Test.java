package exosmain;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Scanner sc = new Scanner(System.in);


		System.out.println("Ecris le nom de ton Parent");
		String name = sc.nextLine();
		System.out.println("Ecris le prenom de ton Parent");
		String prename = sc.nextLine();
		System.out.println("Ecris l'age de ton Parent");

		int age = sc.nextInt();



		Parent said = new Parent(name,prename, age);
		if (age < 17 ) {
			System.out.println("Nous allons faire grandir votre parent afin qu'il puisse accoucher");	
			while (age <= 17) {

				said.Grandir();


			}
			said.accouche();
			said.accouche();
			said.accouche();
			said.accouche();
			//System.out.println(said);
		
		
		
		
		
	}
	

		String test = said.toString();

		System.out.println(test);
	
	
	
	
	
	
	
	
	}
	
	
	
	
	




	/*for (int i=0;; i++) {
				Parent numberone = said.getEnfant(i);
				if (numberone == null) {
					break;
				}

				while (numberone.getAge() <= 18 ) {

					numberone.Grandir();			
				}


				numberone.accouche();
				numberone.accouche();
			}*/
	







	//String test = said.toString();

	///System.out.println(test);






}


