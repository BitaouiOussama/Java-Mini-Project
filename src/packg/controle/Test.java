package packg.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Livre[] livres = {
				new Livre("Test 1", "Toto", 300.00,60),
				new Livre("Test 2", "Jhon", 150.20,100),
				new Roman("Test 3", "Wike", 245.99,200, "AAAA", 10),
				new Roman("Secret", "Toto", 300.00,30, "BBBB", 20),
				};
		
		for(Livre livre : livres) {
			livre.Affiche();
		}
		
		
		System.out.println("----------------------------------------Afficher les resultats apres le sort--------------------------------------------------------");
		Arrays.sort(livres);
		for(Livre livre : livres) {
			livre.Affiche();
		}
		
		System.out.println("----------------------------------------Afficher les resultat apres la suppression et l'ajout----------------------------------------");
		// Ajouter un nouveau livre
		List<Livre> listes = new ArrayList<Livre>(Arrays.asList(livres));
		listes.add(new Livre("Power of Sun", "Jef", 420.12, 300));
		//Convertir liste en tableau
		livres = listes.toArray(new Livre[listes.size()]);
		//Supprimer le premier livre dans le tableau
		listes.remove(listes.get(0));
		//Convertir liste en tableau
		livres = listes.toArray(new Livre[listes.size()]);
		
		for(Livre livre : livres) {
			livre.Affiche();
		}
		
		System.out.println("----------------------------------------Afficher les resultats du nouveau tableau copier----------------------------------------------");
		Livre[] newTab = livres.clone();
		for(Livre newLivre : newTab) {
			newLivre.Affiche();
		}
		System.out.println("----------------------------------------Afficher les resultats du nouveau tableau apres l'inverse-------------------------------------");
		
		List<Livre> inversListe = new ArrayList<Livre>(Arrays.asList(newTab));
		Collections.shuffle(inversListe);
		newTab = inversListe.toArray(new Livre[inversListe.size()]);
		for(Livre newLivre : newTab) {
			newLivre.Affiche();
		}
		
		
	}

}
