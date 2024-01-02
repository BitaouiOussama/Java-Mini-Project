package packg.controle;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ville implements Comparable<Ville>,Cloneable {
	
	public static boolean equl(int[]a,int[]b) {
		if(a.length!=b.length)
			return false;
	
		if(Arrays.equals(a,b)==false) 
			return false;
	
		return true;
	}
	
	private String nom;
	private int superficie,nbHabitant;
	
	public Ville(String nom,int sup) {
		this.nom = nom;
		this.superficie = sup;
	}
	public Ville(String nom,int sup,int nbrh) {
		this.nom = nom;
		this.superficie = sup;
		this.nbHabitant = nbrh;
	}
	
	
	
	protected Object clone() throws CloneNotSupportedException {
		return (Ville) this.clone();
	}
	
	
	

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" nom= " + nom + ", superficie= " + superficie + ", nbHabitant= " + nbHabitant + " ";
	}
	
	@Override
	public int compareTo(Ville o) {
	
		return this.nom.compareTo(o.nom);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ville[] tab = new Ville[4];
		tab[0]=new Ville("Casablanca",384,3000000);
		tab[1]=new Ville("Rabat",250,2000000);
		tab[2]=new Capitale("Paris",600,7000000,"France");
		tab[3]=new Capitale("Rome",560,8000000,"Italie");
		
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		
		Arrays.sort(tab);
		
		for(Ville v : tab) {
			System.out.println(v);
		}
		
		List<Ville> listv = new ArrayList<Ville>(Arrays.asList(tab));
		listv.add(new Ville("Moscow",800,20000000));
		listv.remove(0);
		tab = listv.toArray(new Ville[listv.size()]);
		
		Ville [] tab2= tab.clone();
		
		List<Ville> listv2 = new ArrayList<Ville>(Arrays.asList(tab));
		Collections.reverse(listv2);
		
		tab = listv2.toArray(new Ville[listv2.size()]);
		
		
	
		
	
	}

}


class Capitale extends Ville {
	
	public Capitale(String nom, int sup,String pays) {
		super(nom, sup);
		this.pays=pays;
	}
	public Capitale(String nom, int sup,int nbrh,String pays) {
		super(nom, sup,nbrh);
		this.pays=pays;
	}
	
	
	

	private String pays;




	@Override
	public String toString() {
		return super.toString()+ "pays= " + pays + " ";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return (Capitale) super.clone();
	}
}


