/**
 * @author Anass Amazzar - Oussama Bitaoui
 */
package packg.voiture;

/**
 * Class Voiture
 * L'interface Comparable ajoute une prise en charge du tri des listes contenant des types non primitifs, 
 * c.-à-d. des listes de types définis par l'utilisateur.
 */
public class Voiture implements Comparable<Voiture>,Cloneable{

	// Instance variables
	
	/**
	 * Id of the car
	 */
	private int id;
	/**
	 * Brand of the car
	 */
    private String brand;
    
    /**
     * Model of the car
     */
    private String model;
    
    /**
     * Year of manufacture
     */
    private int year;
    
    /**
     * Color of the car
     */
    private String color;
    
    /**
     * Price of the car
     */
    private double price;
    
    // Constructor
    
    /**
     * Default constructor
     */
    public Voiture() {}
    
    /**
     * Le constructeur initialise les attributs
     * @param brand
     * @param model
     * @param year
     * @param color
     * @param price
     */
    public Voiture(String brand, String model, int year, String color, double price) {
    	this.brand=brand;
    	this.model=model;
    	this.year=year;
    	this.color=color;
    	this.price=price;
    }
    
    // Getter methods
    /**
     * Get Id
     * @return Id of Car (Voiture)
     */
    public int getId() {
    	return this.id;
    }
    /**
     * Get Brand
     * @return brand of Car (Voiture)
     */
    public String getBrand() {
    	return this.brand;
    }
    /**
     * Get Model
     * @return model of Car (Voiture)
     */
    public String getModel() {
    	return this.model;
    }
    /**
     * Get Year
     * @return year of Car (Voiture)
     */
    public int getYear() {
    	return this.year;
    }
    /**
     * Get Color
     * @return color of Car (Voiture)
     */
    public String getColor() {
    	return this.color;
    }
    /**
     * Get Price
     * @return price of Car (Voiture)
     */
    public double getPrice() {
    	return this.price;
    }
    
    // Setter methods
    
    /**
     * Set Id
     * @param Id of Car (Voiture)
     */
    public void setId(int id) {
    	this.id = id;
    }
    
    /**
     * Set Brand
     * @param brand of Car (Voiture)
     */
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    
    /**
     * Set Model
     * @param model of Car (Voiture)
     */
    public void setModel(String model) {
    	this.model = model;
    }
    
    /**
     * Set Year
     * @param year of Car (Voiture)
     */
    public void setYear(int year) {
    	this.year = year;
    }
    
    /**
     * Set Color
     * @param color of Car (Voiture)
     */
    public void setColor(String color) {
    	this.color = color;
    }
    
    /**
     * Set Price
     * @param price of Car (Voiture)
     */
    public void setPrice(double price) {
    	this.price = price;
    }
    
    /**
     * Method toString returns information about car (Voiture) in string format
     */
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.getClass().getSimpleName() + "[Brand " + this.brand + " Model " + this.model + " Year " + this.year 
    			+ " Color " + this.color + " Price " + this.price + "]";
    } 
    
    /**
     * Method equals compares two Voiture Object, 
     * and returns true if the Object are equal, and false if not
     */
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	Voiture voiture = (Voiture) obj;
    	return this.equals(voiture);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return (Voiture) this.clone();
    }
    
    /**
     * Une Methods qui renvoie un nombre entier qui représente le résultat de la comparaison
     */
    @Override
	public int compareTo(Voiture o) {
		// TODO Auto-generated method stub
		if(this.getId()==o.getId()) return 0;
		else return 1;
	}
    
    public static void main(String[]args) {
    	
    
    	
    	
    }
    
    

}
