package main;

import modelos.Cat;
import modelos.Fish;
import modelos.Spider;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat gato = new Cat();
		gato.setName("Frajola");
		gato.eat();
		System.out.println("O nome do meu gato é: " + gato.getName());
		gato.walk();
		gato.play();
		
		System.out.println("");
		
		Spider aranha = new Spider();
		aranha.eat();
		aranha.walk();
		
		
		
		Fish peixe = new Fish();
		peixe.setName("Peixoto");
		peixe.eat();
		System.out.println("O nome do meu peixe é " + peixe.getName());
		peixe.walk();
		peixe.play();
	}

}
