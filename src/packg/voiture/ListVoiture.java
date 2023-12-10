/**
 * @author Anass Amazzar - Oussama Bitaoui
 */

package packg.voiture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Une Class Contenant la Liste des Voitures(Class Mére)
 */
public class ListVoiture {
	
	ArrayList<Voiture> listes = new ArrayList<Voiture>();
	
	/**
	 * Une fonction pour remplir une liste
	 */
	public void AlimenterListe() {
		listes.add(new Voiture(6, "Volkswagen", "T-Roc", 2017, "Bleu", 355000.00));
		listes.add(new Voiture(7, "Tesla", "Model 3", 2017, "Blanc nacré", 350000.00));
		listes.add(new Voiture(8, "Ford", "Mustang", 1964, "Rouge vif", 270000.00));
		listes.add(new Voiture(9, "BMW", "X5", 1999, "Bleu métallisé", 600000.00));
		listes.add(new Voiture(10, "Honda", "Civic", 1972, "Noir brillant", 210000.00));
	}
	
	/**
	 * Fonction AfficherListe permet de parcourir la liste et afficher
	 * les voiture ligne par ligne
	 */
	public void AfficherListe() {
		for(Voiture voiture : listes) {
			System.out.println(voiture);
		}
	}
	
	/**
	 * Fonction ParcourirListe permet de parcourir la liste et afficher
	 * les voiture ligne par ligne.
	 * la difference ici c'est que on a utiliser un iterator
	 * iterator => est une interface utilisée pour parcourir des collections 
	 * comme ArrayList et HashSet. Il permet de parcourir les éléments un par un
	 */
	public void ParcourirListe() {
		Iterator<Voiture> it = listes.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	/**
	 * Cette fonction prend on parametre une variable de type voiture puis il ajoute a la listes
	 * @param voiture
	 */
	public void insererUnElement(Voiture voiture) {
		listes.add(voiture);
	}
	
	/**
	 * Cette fonction prend on parametre une variable de type voiture et elle a comme type de retour voiture
	 * si cette element n'est pas dans la listes il va retourner une valeur null sinon il va le recuperer
	 * @param voiture
	 * @return
	 */
	public Voiture recupererUnElement(Voiture voiture) {
		if(listes.contains(voiture))
			return voiture;
		return null;
	}
	
	/**
	 * Cette fonction Java qui a un type de retour boolean permet de supprimer un élément de la liste
	 * il verifie si la voiture exicte dans la liste 
	 * si il ne trouve pas la voiture il va rien supprimer on retourne flase
	 * sinon on supprime l'element
	 * @param voiture
	 * @return
	 */
	public boolean supprimerUnElement(Voiture voiture) {
		if(!listes.contains(voiture)) return false;
		
		return listes.remove(voiture);
	}
	
	/**
	 * Cette fonction Java qui permet de rechercher un élément on retourn True 
	 * s'il exicte et false s'il n'exicte pas
	 * @param voiture
	 * @return
	 */
	public boolean rechercherUnElement(Voiture voiture) {
		if(listes.contains(voiture)) return true;
		return false;
	}
	
	/**
	 * Cette fonction Java qui permet de trier la liste
	 */
	public void trierListe() {
		Collections.sort(listes);
	}
	
	/**
	 * Codez une fonction Java qui permet de copier la liste dans un nouveau tableau.
	 */
	public void copieListeDanstableau() {
		Voiture[] tableauvoiture = new Voiture[listes.size()];
		for(int i=0;i<listes.size();i++)
			tableauvoiture[i]=listes.get(i);
	}
	
	/**
	 * Cette fonction Java qui permet de mélanger les élément de la liste
	 * La méthode shuffle() retourne des résultats différents après chaque exécution
	 */
	public void melangerLesElEment() {
		Collections.shuffle(listes);
	}
	
	/**
	 * Cette fonction Java qui permet d’inverser les éléments de la liste
	 */
	public void inverserLesElements() {
		Collections.reverse(listes);
	}
	
	/**
	 * Cette fonction Java qui permet d’extraire une partie de la liste.
	 */
	public void extraireUnePartie() {
		listes.subList(0, listes.size()/2);
	}
	
	/**
	 * Cette fonction Java qui permet de comparer deux listes.
	 */
	public boolean comparerDeuxListe(List<Voiture> ls) {
		return this.listes.equals(ls);
	}
	
	/**
	 * Cette fonction Java d'échange de deux éléments dans une liste
	 * Pour remplacer une valeur existante à une position spécifique dans ArrayList en java, 
	 * utilisez la méthode set() de la classe ArrayList.
	 */
	public void echangeDeuxElements(Voiture v1, Voiture v2) {
		listes.set(0, v1);
		listes.set(listes.size()-1, v2);
	}
	
	/**
	 * Cette fonction Java qui permet de vider la liste
	 */
	public void viderListe() {
		listes.clear();
	}
	
	/**
	 * Cette fonction Java qui permet de tester que la liste est vide ou non
	 * !listes.isEmpty() si la liste n'est pas vide (means "if the list is not empty.")
	 * @return
	 */
	public boolean checkListeVide() {
		if(!listes.isEmpty()) return false;
		return true;
	}	
}
