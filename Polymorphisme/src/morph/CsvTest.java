package morph;

import java.io.IOException;

public class CsvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSVFile test = new CSVFile("file/csv.txt");
		
		
		try {
			test.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
