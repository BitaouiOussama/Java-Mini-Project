/**
 * @author Anass Amazzar - Oussama Bitaoui
 */
package packg.voiture;

/**
 * Class Voiture
 */
public class Voiture {

	// Instance variables
	
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
     * The constructor initialize these attributes
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
     * Method equals compares two Voiture Object, 
     * and returns true if the Object are equal, and false if not
     */
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	Voiture voiture = (Voiture) obj;
    	return this.equals(voiture);
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

}
