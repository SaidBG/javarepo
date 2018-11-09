package exception;

public class SubSystem {
	


	
	

	public  void init() throws InitException {
		throw new InitException();
	}


	public  void process() throws  ProcessEcpetion {
		throw new ProcessEcpetion();
	}

	public void config() throws SubSystemConfigException {
		throw new SubSystemConfigException ();
	}
}

