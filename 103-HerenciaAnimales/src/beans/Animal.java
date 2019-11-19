package beans;

public class Animal {
	protected String color;

	//constructores
	
	public Animal(String color) {
		super();
		this.setColor(color);
	}
	public Animal() {
	}
	
	// getter and setter
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	public void saludar() {
		
		System.out.println( "soy un animal");
	}
	
	public void sonido() {
	System.out.println( "no digo mú ni ná");
	}
	
	// to string
	@Override 
	public String toString() {
		return "Animal [color=" + color + "]";
	}
	
	
	
}
