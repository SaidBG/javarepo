package morph;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCfg {
	private String charset;
	private String windowcolor;
	private String defaultfont;
	private String chemin;
	private int lapin	;
	FileInputStream fichier = null;
		
	
	public TestCfg (String chemin) {
		this.chemin = chemin;
	}
	public void loadCfg() throws IOException {
		
		File test = new File(chemin);
		
		Properties p = new Properties();
			fichier = new FileInputStream(test);
			p.load(fichier);			
		windowcolor = p.getProperty("WindowsColor");
		charset = p.getProperty("charset");
		defaultfont = p.getProperty("defaultfont");
		lapin = Integer.parseInt(p.getProperty("lapin"));
	}
	public String getCharset() {
		return charset;
	}
	public String getWindowcolor() {
		return windowcolor;
	}
	public String getDefaultfont() {
		return defaultfont;
	}
	
	
	public int getLapin() {
		return lapin;
	}
	@Override
	public String toString() {
		return "TestCfg [charset=" + charset + ", windowcolor=" + windowcolor + ", defaultfont=" + defaultfont + "]" + lapin;
	}
}