/**
 * @author Anass Amazzar - Oussama Bitaoui
 */
package packg.voiture;

/**
 * Class fille Voiture electrique
 */
public class Velectrique extends Voiture{
	// Instance variables
	// Attributs spécifiques aux voitures électriques
	private int autonomieEnkm; // fait référence à la distance maximale qu'une voiture électrique peut parcourir avec une seule charge de sa batterie
	private int tempsDechargeEnHeures;
	
	
	/**
     * Default constructor
     */
	public Velectrique(){}
	
	/**
	 * Le constructeur initialise les attributs
	 * @param brand
	 * @param model
	 * @param year
	 * @param color
	 * @param price
	 * @param autonomieEnkm
	 * @param tempsDechargeEnHeures
	 */
	public Velectrique(String brand, String model, int year, String color, double price, int autonomieEnkm, int tempsDechargeEnHeures){
		super(brand, model, year, color, price); // appele du constructeur de la class parent Voiture
		this.autonomieEnkm = autonomieEnkm;
		this.tempsDechargeEnHeures = tempsDechargeEnHeures;
	}
	
	// Getter methods
	/**
	 * Get autonomieEnkm du Voiture Electrique
	 * @return autonomieEnkm
	 */
	public int getAutonomieEnkm() {
		return this.autonomieEnkm;
	}
	/**
	 * Get tempsDechargeEnHeures du Voiture Electrique
	 * @return tempsDechargeEnHeures 
	 */
	public int getTempsDechargeEnHeures() {
		return this.tempsDechargeEnHeures;
	}
	
	// Setter methods
	/**
	 * Modifier autonomieEnkm du Voiture Electrique 
	 * @param autonomieEnkm
	 */
	public void setAutonomieEnkm(int autonomieEnkm) {
		this.autonomieEnkm = autonomieEnkm;
	}
	/**
	 * Modifier tempsDechargeEnHeures du Voiture Electrique 
	 * @param tempsDechargeEnHeures
	 */
	public void setTempsDechargeEnHeures(int tempsDechargeEnHeures) {
		this.tempsDechargeEnHeures = tempsDechargeEnHeures;
	}
	
	/**
     * Method toString returns information about car (Voiture Electrique) in string format
     */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Autonomie en km : "+ this.autonomieEnkm + "Temps de decharge en heures : " + this.tempsDechargeEnHeures;
	}
	
	/**
     * Method equals compares two Voiture Electrique Object, 
     * and returns true if the Object are equal, and false if not
     */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Velectrique voitureelectrque = (Velectrique) obj;
		return super.equals(obj);
	}
	/**
	 * Methods permettant de créer une copie exacte d’un objet
	 * crée une nouvelle instance de la classe de l’objet courant 
	 * et remplit tous ses champs avec le contenu exact des champs de l’objet courant.
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Velectrique) super.clone();
	}

		
	
}
