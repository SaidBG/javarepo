package statictest;

import java.io.IOException;

public class TestMusic {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			Mp3TagManager mp = new Mp3TagManager("file/muzik.mp3");


			String titre = mp.getTitle();
			String auteur = mp.getArtist();
			String album = mp.getAlbum();
			String annee = mp.getYear();
			String comment = mp.getComment();
			int style = mp.getGenre();






			System.out.println("\r \nTitre = "+titre+" \r \nAuteur = "+auteur+" \r \nAlbum = "+album+"\r \nAnnée = "+annee+" \r \nCommentaires = "+comment+"\r \nStyle = "+style);




			mp.setTitle("Le petit lapin");
			mp.setArtist("Moi-meme");
			mp.setAlbum("Au pays des bestioles");
			mp.setYear("1964");
			mp.writeTags();
			// verifier
			mp.readTags();
			System.out.println(mp.toString());
			// remettre les valeurs d'origine
			mp.setTitle(titre);
			mp.setArtist(auteur);
			mp.setAlbum(album);
			mp.setYear(annee);
			mp.writeTags();
			// reverifier
			mp.readTags();






			System.out.println(mp.toString());

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
