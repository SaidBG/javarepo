package interfaces;

public class Factory {

	PrototypeUn test = new PrototypeUn();
	double a = Math.random()*10;
	PrototypeDeux test1 = new PrototypeDeux();
	public ITest newInstance() {

		System.out.println(a);




		if (a < 5) {


			test.compute();
			//System.out.println(test); 
			return test;
		}





		else{


			test1.compute();

			//System.out.println(test1);
			return test1;


		}


	}

}
