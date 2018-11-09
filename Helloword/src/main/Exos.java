package main;
import java.util.Scanner;

public class Exos {

	public static int getMultiplie( int x) {
		return x *3; 

	}

	public static boolean isEven (int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false ;
		}


	}

	public static int square (int a) {
		return a*a;
	}

	public static boolean isOdd (int b) {
		if (b % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isSquareOdd (int c) {

		if ( isOdd(square(c))  ) {
			return true;

		}
		else {
			return false;
		}
	}


	public static void deux (int d) {
		int f = d * 2 ;
		System.out.println(f);
		if (f < 100) {
			deux(f);
		}else {
			return;

		}
	}









	public static void main(String[] args) {










		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);




		System.out.println("Choissisez votre exos : ");
		System.out.println("1 - Tableau Entiers");
		System.out.println("2 - Tableau de chaînes ");
		System.out.println("3 - Tableau entiers en carré");
		System.out.println("4 - Test Exit");
		System.out.println("5 - Tableau 1001 à 1100");
		System.out.println("6 - Triplé une valeur ");
		System.out.println("7 - Tableau à Deux Dimensions ");
		System.out.println("8 - Tableau à Trois Dimensions");
		System.out.println("9 - Tableau addition");
		System.out.println("10 - Concaténation ");
		System.out.println("11 - Fonctions dans Fonctions");
		System.out.println("12 - Divison Infinie");
		System.out.println("13 - Trois Tableau");
		System.out.println("14 - Fonctions");
		System.out.println("15 - Des Chifffres et des Lettres");

		int choix = scan.nextInt();


		switch (choix) {




		case 1 : 
			int [] tableau = new int [10];
			System.out.println(" Inscrivez vos entiers ");
			for (int i = 0 ; i < 10 ; i++) {
				tableau[i] = scan.nextInt();



			}
			for (int i = 0;  i < 10; i++) {	
				System.out.print(tableau[i]);

			}
			break;




		case 2 : 
			String [] tab = new String [10];
			System.out.print("Inscrivez des mots : ");


			for (int i = 0 ; i < 10; i++) {
				tab[i] = scan.nextLine();

			}

			for (int i = 0; i < 10; i++) {
				System.out.print(tab[i] + " ");
			}
			break;


		case 3 : 
			int [] tabcar = new int [10];

			System.out.print("Inscrivez vos entiers a carréifier : ");

			for ( int i = 0; i < 10; i++) {
				tabcar[i]= scan.nextInt();
				tabcar[i] = tabcar[i] * tabcar [i];
				System.out.println(tabcar[i]);

				if (tabcar[i] > 50) {

					System.out.println("Trop Grand !!");
					break;
				}


			}
			break;






		case 4 : 


			System.out.println("Ecris ce que tu veux : ");
			String mot = "";


			while (!mot.equalsIgnoreCase("exit"))
			{
				mot = scan.nextLine();			



			}
			System.out.println("Tu as écris exit");
			break;







		case 5 : 
			int [] tabcent = new int [100];
			int min = 1001;


			for (int i = 0; i < 100; i++) {
				tabcent[i] = min++;
				System.out.println(tabcent[i]);

				if ( isEven(i)) {
					tabcent[i] = tabcent[i] / 5;
					System.out.println("Celui là est divisible par 5  " + tabcent[i]);
				}

				if ( !isEven(i) ) {
					tabcent[i] = tabcent[i] / 10 ;
					System.out.println("Celui là est divisible par 10  " + tabcent[i]);
				}
			}


			break;



		case 6 : 
			System.out.println("Ajoute une valeur à triplé");
			int val = scan.nextInt();
			val = getMultiplie(val);
			System.out.println(val);


			break;


		case 7 : 

			String [] [] tablo = new String [10] [10];

			for (int i = 0 ; i < 10; i++) {				
				for (int y = 0; y < 10; y++) {
					tablo[i] [y] = i + " - "+ y ; 
					System.out.println(tablo [i] [y]);
				}
			}
			break;

		case 8 : 
			String [] [] [] tabtrois = new String [10] [10] [10];

			for (int i = 0 ; i < tabtrois.length; i++) {
				for (int y = 0; y < tabtrois.length; y++) {
					for (int l = 0; l < tabtrois.length; l++) {
						tabtrois [i] [y] [l] = i + " - " +  y  + " - " + l;
						System.out.println(tabtrois [i] [y] [l]);
					}
				}
			}
			break;

		case 9 :
			int [] tab1 = new int [100];
			int x = 0;
			for (int i = 0; i < tab1.length; i++) {
				tab1[i] = i;
				if (tab1[i] > 0) {
					tab1[i] += tab1[i-1];

				}
				System.out.println(tab1[i]);

			}
			break;



		case 10 : 


			String s = "";

			for (int i = 0; i < 10; i++) {
				s = s+i;				


			}

			System.out.println(s);
			break;



		case 11 : 
			System.out.print("Ecris la valeur à tester ");
			int choice = scan.nextInt();

			if ( isSquareOdd(choice)) {
				System.out.println("Votre valeur est impair");
			} else {
				System.out.println("Votre valeur est pair");
			}
			break;

		case 12 : 
			System.out.println("Ecris une valeur a diviser");
			double valeur = scan.nextInt();
			int div = 7;
			while (valeur > 1) {
				valeur = valeur / div;

			}
			System.out.println(valeur);	




			while (true ) {
				double random = Math.random();
				System.out.println(random);
				if (random > valeur) {
					break;
				}

			}
			break;

		case 13 : 
			int mina = 1;
			int minb = 200;



			int []  tableaua = new int [100]; 
			int []  tableaub = new int [100];
			int []	tableauc = new int [100];	


			for (int i = 0 ; i < tableaua.length; i++) {
				tableaua[i] = mina++;
			}	
			for (int y = 0; y < tableaub.length; y++) { 
				tableaub[y] = minb++;
			}

			for (int l = 0; l < tableauc.length; l++) {
				tableauc[l] = tableaub[l] - tableaua[l] ;
				System.out.println(tableauc[l]);
			}
			break;



		case 14 : 


			System.out.println("Ecris un chiffre");
			int n = scan.nextInt();	

			deux(n);
			break;





		case 15 : 

			System.out.println("Inscris une valeur entre 21 et 69 ");
			int vale = scan.nextInt();

			int diz = vale/10;
			int unit = vale% 10;
			String dizaine ="";
			switch (diz) {

			case 1 :
				dizaine = "Dix - ";
				break;

			case 2 :
				dizaine = "Vingt - ";
				break;

			case 3 :
				dizaine = "Trente - ";
				break;

			case 4 :
				dizaine = "Quarante -";
				break;

			case 5 :
				dizaine = "Cinquante - ";
				break;

			case 6 : 
				dizaine = "Soixante - ";
				break;
			}

			String unite = "";
			switch (unit) {

			case 1 :
				unite = "un";
				break;

			case 2 :
				unite = "deux";
				break;

			case 3 :
				unite = "trois";
				break;

			case 4 :
				unite = "quatre";
				break;

			case 5 :
				unite = "cinq";
				break;

			case 6 : 
				unite = "six";
				break;

			case 7 :
				unite = "sept";
				break;

			case 8 :
				unite = "huit";
				break;

			case 9 :
				unite = "neuf";
				break;

			}

			System.out.println(dizaine + unite);

		}
	}







}
