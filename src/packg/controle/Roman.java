/**
 * @author Anass Amazzar - Oussama Bitaoui
 */
package packg.controle;

/**
 * Class Roman hérite de la class Livre
 */
public class Roman extends Livre {
	//Instance variable
	private String maisonEdition;
	private int nbExemplaire;
	
	//Constructeur par defaut
	public Roman() {super();}
	
	//Constructeur d'initialisation
	public Roman(String titre, String auteur, double prix, int nbrPage, String maisonEdition, int nbExemplaire) {
		super(titre, auteur, prix, nbrPage);
		this.maisonEdition = maisonEdition;
		this.nbExemplaire = nbExemplaire;
	}
	
	
	/**
	 * La méthode toString donne une description satisfaisante des objets de cette classe
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Maison Edition : " + this.maisonEdition + " Nombre Exemplaire : " + this.nbExemplaire;
	}
	
	/**
	 * La méthode Affiche qui imprime le résultat de la méthode toString sur la console
	 */
	@Override
	public void Affiche() {
		// TODO Auto-generated method stub
		super.Affiche();
	}
	
	/**
	 * La méthode clone est utilisée pour créer une copie de l'objet actuel.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
