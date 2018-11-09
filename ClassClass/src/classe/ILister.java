package classe;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface ILister {
	public List<String> list() throws MalformedURLException, IOException, Exception ;
	public void display() ;
}
