	package morph;
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class CSVFile {
		private String path;
		private String separator = "-";
		boolean titre;
	
		private BufferedReader fichier = null;
	
		File csv = new File(path);
	
	
	
	


		public  CSVFile(String path) {
			this.path = path;
		}
	
	
		public void load() throws IOException  {
	
	
	try {
			fichier  = new BufferedReader(new FileReader(path));
	
			String test = "";
			String result = "";
			while ( test != null) {
	
	
				test = fichier.readLine();
	
	
				if (test != null) {
					result = result + test + "\n ";
				}
	
			}
	
			System.out.println(result);
		}
		catch (IOException e) {
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
	}
	
	
	
	
	
	
	
	
	
