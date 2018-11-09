package main;
import  java.util.Scanner;

public class Caractere {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);



		System.out.println("Ecris une phrase");			


		String phrase = scan.nextLine();
		

		System.out.println("Ecris les rang en chiffre du caractere à supprimé");

		int suppr = scan.nextInt();
		
		
		System.out.println(phrase.substring(0, suppr) + "" + phrase.substring(suppr+1,phrase.length()));

	}











}
