package packg.voiture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;












public class TableauVoitures {
	
	Voiture [] voiture = new Voiture[5];
	
	 public TableauVoitures() {
		 voiture[0] = new Voiture("Ferrari","Portofino",2017,"Green",100000);
		 voiture[1] = new Voiture("Bugatti","Chiron",2020,"Black",4000000);
		 voiture[2] = new Voiture("Aston Martin","Valhalla",2022,"Gray",2000000);
		 voiture[3] = new Voiture("Alfa Romeo ","Quadrifoglio",2023,"Red",500000);
		 voiture[4] = new Voiture("BMW","I8",2022,"Orange",900000);
		 
	 }
	 
	 public boolean existe(Voiture vtr) {
			for(Voiture vtr1:voiture) {
				if(vtr1.equals(vtr)) return true;
			}
			return false;
		}
	 
	 public void trier(Comparator<Voiture> cmpv) {
		 Arrays.sort(voiture,cmpv);
	 }
	 
	 
	 public void ajouter(Voiture vtr) {
			
				ArrayList<Voiture> listvoiture = new ArrayList<Voiture>(Arrays.asList(voiture));
				listvoiture.add(vtr);
				voiture = listvoiture.toArray(new Voiture[listvoiture.size()]);
	
		}
	 
	 public boolean supprimer(Voiture vtr) {
			if(!this.existe(vtr)) return false;
			
			ArrayList<Voiture> liste = new ArrayList<Voiture>(Arrays.asList(voiture));
			liste.remove(vtr);
			voiture = liste.toArray(new Voiture[liste.size()]);
			return true;
			
		}
	 
	 public int nbrelement() {
		 return voiture.length;
	 }
	 
	 
	 public void inverser() {
			ArrayList<Voiture> liste = new ArrayList<Voiture>(Arrays.asList(voiture));
			Collections.reverse(liste);
			voiture = liste.toArray(new Voiture[liste.size()]);
		}
	 
	 public void afficher() {
		 for(int i=0;i<voiture.length;i++) {
			 System.out.println(voiture[i]);
		 }
		 
	 }
	 
	 public Voiture Maxprice() {
			Arrays.sort(voiture, new CmpPrice());
			return voiture[voiture.length-1];
		}
	 
	 public boolean egalite(Voiture[] emps) {
			return Arrays.equals(emps,voiture);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String[]args) {

	    }
	 
	 
		
	

}
