/**
 * @author Anass Amazzar - Oussama Bitaoui
 */
package packg.controle;

/**
 * Class Livre
 * L'interface Comparable ajoute une prise en charge du tri des listes contenant des types non primitifs
 */
public class Livre implements Comparable<Livre> , Cloneable{
	
	//Instance variable
	private String titre;
	private String auteur;
	private double prix;
	private int nbrPage;
	
	//Static variable
	private static int nbrTotalLivre;
	
	
	public Livre() {nbrTotalLivre++;}
	
	public Livre(String titre, String auteur, double prix, int nbrPage) {
		nbrTotalLivre++;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.nbrPage = nbrPage;
	}
	
	//Getters
	public String getTitre() {
		return this.titre;
	}
	public String getAuteur() {
		return this.auteur;
	}
	public double getPrix() {
		return this.prix;
	}
	public int getNbrPage() {
		return nbrPage;
	}
	
	//Setters
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}
	
	@Override
	public int compareTo(Livre o) {
		// TODO Auto-generated method stub
		return (int) (this.prix - o.prix);
	}
	
	/**
	 * Donner une description satisfaisante des objets de cette classe
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[Titre : " +this.titre+ " Auteur : " + this.auteur
				+ " Prix : " + this.prix + " Nombre de Page : " + this.nbrPage;
	}
	
	/**
	 * Une méthode Affiche qui imprime le résultat de la méthode toString() sur la console
	 */
	public void Affiche() {
		System.out.println(this.toString());
	}
	
	/**
	 * La méthode clone est utilisée pour créer une copie de l'objet actuel.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Livre) this.clone();
	}
}
