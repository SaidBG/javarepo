package exosmain;



public class Parent extends Person {
	int enfant = 0;
	Parent[] tabloenfant = new Parent [10];	


	public Parent(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}





	public Parent getEnfant(int i) {
		return tabloenfant[i];
	}





	public void setEnfant(int enfant) {
		this.enfant = enfant;
	}





	public void accouche () {
		if (getAge() > 17 ) {
			Parent bebe = new Parent("Gentil","Said",0);

			tabloenfant[enfant++] = bebe;
			
		}
		
	

	}
	public String toString() {
		String fils = super.toString()+ "\r\n" ;
		if (enfant > 0) {
			for (int i = 0; i < enfant; i++) {
				fils = fils + tabloenfant[i].toString()+ "\r\n";
				
			}

			





		}

		return fils;

	}













	public static void main(String[] args) {
		// TODO Auto-generated method stub

















	}

}
