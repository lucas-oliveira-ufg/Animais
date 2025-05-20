package modelos;

import controladores.Pet;

public class Cat extends Animal implements Pet {

	public String gatoNome;
	
	public Cat(String name) {
		super(4);
		this.gatoNome = name;
		// TODO Auto-generated constructor stub
	}
	
	public Cat() {
		this("");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Gatos comem peixes.");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return gatoNome;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.gatoNome = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Gatos brincam em caixa de papelão");
	}

}
