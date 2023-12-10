/**
 * @author Anass Amazzar - Oussama Bitaoui
 */

package packg.voiture;

import java.util.Comparator;

public class CmpPrice implements Comparator<Voiture> {
	
	public int compare(Voiture o1, Voiture o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPrice()-o2.getPrice()); //return soit une valeur positive ou negative ou 0
	}

}
