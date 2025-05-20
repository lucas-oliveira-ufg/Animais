package modelos;

import controladores.Pet;

public class Fish extends Animal implements Pet{

	public String peixeNome;
	
	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return peixeNome;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.peixeNome = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Peixes brincam na areia.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Peixes comem ração.");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Peixes não caminham.");
	}
	
	

}
