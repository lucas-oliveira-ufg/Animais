package modelos;

public abstract class Animal {
	
	// legs : patas
	// walk : andar
	// play : brincar
	// eat  : comer
	
	protected int legs;
	
	protected Animal(int legsAnimal) {
		super();
		this.legs = legsAnimal;
	}
	
	public void walk() {
		System.out.println("Este animal caminha sobre " + legs + " patas.");
	}
	
	public abstract void eat();

}
