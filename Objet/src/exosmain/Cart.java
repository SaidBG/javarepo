/*package exosmain;

import java.util.Arrays;

public class Cart {
	ISellableItem[] tab = new SellableItem [100];
	int nbSellableItem = 0;

	public void add (ISellableItem x ) {
		tab[nbSellableItem++] = x;

	}

	private int getIndexFromId(int id) {
		for (int i = 0; i < nbSellableItem; i++) {
			int index = i;
			return index;
		}
		return -1;
	}

	public void setItemby0Id (getIndexFromId(id); ISellableItem s) {
		
			if (tab[i].getId() == getIndexFromId(id)) {
				tab[i] = s;
				return;		
			}
		}
		return;
	}





	public void deleteById (int id) {
		boolean done = false;
		for (int i = 0; i < nbSellableItem; i++) {
			if (tab[i].getId() == id) {
				tab[i] = null;
				done = true;
				break;
			}
		}
		if (done) {
			reformate();
			nbSellableItem--;
		}
	}

	public void reformate () {
		for (int i = 0; i < nbSellableItem; i++) {
			if (index == null) {

				tab[i] = tab[i+1];
				tab[i+1] = null;

			}

		}
	}

	public  ISellableItem getItembyId (int id) {
		for (int i = 0; i < nbSellableItem; i++) {
			if (tab[i].getId() == id) {

				return tab[i];			
			}



		}
		return null;
	}













	@Override
	public String toString() {
		String s = "Panier : ";
		if (nbSellableItem > 0) {
			for (int i = 0; i < nbSellableItem; i++) {
				s = s + ((tab[i] == null) ? "null" :tab[i].toString())+ "\r\n";
			}

		}
		return s;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

















	}

}
*/