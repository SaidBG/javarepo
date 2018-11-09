package statictest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;




public class Mp3TagUI {
	public Mp3TagUI () {
	}
	private void beep() {
		java.awt.Toolkit.getDefaultToolkit().beep();
	}




	public void display(String chemin) {

		try {
			Mp3TagManager mp = new Mp3TagManager(chemin);

			mp.readTags();



			String titre = mp.getTitle();
			String auteur = mp.getArtist();
			String album = mp.getAlbum();
			String annee = mp.getYear();
			String comment = mp.getComment();
			int style = mp.getGenre();


			System.out.println("	TAG DE  ~~ " + titre.trim() + " ~~ "+
					" \n________________________________________________________________"+


					 "\r \n| Titre = "+titre.trim()+"|"+
					 " \r \n| Auteur = "+auteur.trim()+"|"+
					 " \r \n| Album = "+album.trim()+"|"+
					 "\r \n| Année = "+annee.trim()+"|"+
					 "\r \n| Commentaires = "+comment.trim()+"|"+
					 "\r \n| Style = "+style+"|");}

		catch (Mp3TagException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public void manage(String chemin) {
		try {

			Mp3TagManager mpp = new Mp3TagManager(chemin);

			Scanner sc = new Scanner(System.in);
			
			Mp3TagStyle [] tab = Mp3TagStyle.values();

			while(true) {

				mpp.readTags();

				String titre = mpp.getTitle();
				String auteur = mpp.getArtist();
				String album = mpp.getAlbum();
				String annee = mpp.getYear();
				String comment = mpp.getComment();
				int style = mpp.getGenre();

				System.out.println("1 - Changer le Titre   " + titre);
				System.out.println("2 - Changer l'Auteur   "+ auteur);
				System.out.println("3 - Changer l'Album   "+ album);
				System.out.println("4 - Changer l'Année  "+ annee);
				System.out.println("5 - Changer le Commentaire  "+ comment );
				System.out.println("6 - Changer le Style  " + tab [style]);
				System.out.println("X - SORTIR");
				String choix = sc.nextLine();


				if (choix.equalsIgnoreCase("x")) {
					System.out.println("Le programme est fermer");
					return;
				}
				String category;
				switch(choix) {

				case "1" : 				
					category = "[Titre]";
					break;

				case "2":				
					category = "[Auteur]";
					break;
				case "3":				
					category = "[Album]";
					break;
				case "4":				
					category = "[Annee]";
					break;
				case "5":				
					category = "[Commentaire]";
					break;
				case "6" :				
					category = "[Genre]";
					break;
				default :
					beep();
					continue;

				}
				


				System.out.println("Entrer la nouvelle valeur pour " + category  + " ou taper X ");
				String change = sc.nextLine();

				if (change.equalsIgnoreCase("x")) {
					continue;
				}

				switch (choix) {


				case "1" :	
					
					
					
					mpp.setTitle(change);
					System.out.println("Vous avez Changer le Titre par "+ change);
					break;


				case "2" : 
					
					
					mpp.setArtist(change);
					System.out.println("Vous avez Changer l'Auteur par "+ change);					
					break;

				case "3" : 
					
					
					mpp.setAlbum(change);
					System.out.println("Vous avez Changer l'Album par "+ change);					
					break;


				case "4" : 
					
					
					mpp.setYear(change);
					System.out.println("Vous avez Changer l'Année par "+ change);					

					break;
				case "5" :
					mpp.setComment(change);

					System.out.println("Vous avez  de Changer le Commentaire par "+ change);					
					break;



				case "6" : 
					try {


						mpp.setGenre(Integer.parseInt(change));

						System.out.println("Vous avez choisis de Changer le Genre par "+ change);
						
					}catch (Exception oe) {
						beep();
						continue;
					}
					break;
				default: 
					break;
				


				case "x"  :
				case "X":

					System.out.println("Vous avez choisis de Sortir, au revoir");
					return;





				}

				if (!change.equalsIgnoreCase("x")) {
					mpp.writeTags();
				}

			}
		}






		catch (Mp3TagException e) {
			e.printStackTrace();

		} catch (IOException oe) {
			oe.printStackTrace();
		}		
		finally {

		}







	}

}









