package statictest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;




public class Mp3TagManager {

	private static final String tague = "TAG";

	File file;

	String title = "";

	String artist = "";

	String album = "";

	String year = "";

	String comment = "";
	
	String chemin;
	
	int genre = 0;

	public String PadAndLimit (String s, int length) {
		if (s.length() > length) {
			s = s.substring(0, length);
		} 

		while (s.length() < length) {
			s+= " ";

		}
		return s;

	}

	


	public  Mp3TagManager (String chemin) throws Mp3TagException,IOException {

		file = new File(chemin);		

		readTags();
	}

	public void readTags () throws Mp3TagException, IOException {

		FileInputStream fichier = null;
		
		
		
	
		try {

			long len = file.length() - Mp3Enum.TAB_LEN.getValue();

			fichier = new FileInputStream(file);

			fichier.skip(len);

			byte [] ba = new byte [128];

			fichier.read(ba);	

			int offset = 0;

			String tag = new String(ba,offset, Mp3Enum.TAG_LEN.getValue());

			if (!tag.equals(tague)  ) {
				throw new Mp3TagException();
			} 

			offset +=  Mp3Enum.TAG_LEN.getValue();

			title = new String(ba,offset, Mp3Enum.TITLE_LEN.getValue());

			offset += Mp3Enum.TITLE_LEN.getValue();

			artist = new String(ba,offset, Mp3Enum.ARTIST_LEN.getValue());

			offset += Mp3Enum.ARTIST_LEN.getValue();

			album = new String(ba,offset, Mp3Enum.ALBUM_LEN.getValue());

			offset+= Mp3Enum.ALBUM_LEN.getValue();

			year = new String(ba,offset, Mp3Enum.YEAR_LEN.getValue());

			offset += Mp3Enum.YEAR_LEN.getValue();

			comment = new String(ba,offset, Mp3Enum.COMMENT_LEN.getValue());

			offset += Mp3Enum.COMMENT_LEN.getValue();

			genre = ba [127];

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		finally {
			try {
				fichier.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void writeTags() {
		
		
		
		
		
		
		

		long taille  = file.length();
		RandomAccessFile ecriture = null;
		try {

			ecriture = new RandomAccessFile(file, "rw");

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue());

			int onset = Mp3Enum.TAG_LEN.getValue() + Mp3Enum.TITLE_LEN.getValue() ; 

			String begin = "TAG";

			ecriture.write(begin.getBytes());

			ecriture.write(PadAndLimit(title,Mp3Enum.TITLE_LEN.getValue()).getBytes());

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue()+ onset);

			ecriture.write(PadAndLimit(artist,Mp3Enum.ARTIST_LEN.getValue()).getBytes());

			onset +=  Mp3Enum.ARTIST_LEN.getValue();

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue()+onset);

			ecriture.write(PadAndLimit(album,Mp3Enum.ALBUM_LEN.getValue()).getBytes());

			onset +=  Mp3Enum.ALBUM_LEN.getValue();

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue()+onset);

			ecriture.write(PadAndLimit(year,Mp3Enum.YEAR_LEN.getValue()).getBytes());

			onset +=  Mp3Enum.YEAR_LEN.getValue();

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue()+onset );

			ecriture.write(PadAndLimit(comment,Mp3Enum.COMMENT_LEN.getValue()).getBytes());

			onset +=  Mp3Enum.COMMENT_LEN.getValue();

			ecriture.seek(taille- Mp3Enum.TAB_LEN.getValue()+onset);

			ecriture.write(genre);

			ecriture.close();


		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	public String toString() {
		return "\r \nTitre = "+title+" \r \nAuteur = "+artist+" \r \nAlbum = "+album+"\r \nAnnée = "+year+" \r \nCommentaires = "+comment+"\r \nStyle = "+genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String change) {
		this.title = change;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}

	/*public static void main (String[] args) {
	String s = new Mp3TagManager().PadAndLimit("0123456789", 12);
	System.out.println(s+"x");
}

	 */





}