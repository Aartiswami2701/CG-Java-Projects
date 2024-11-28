package com.cg.assi;

public class UseAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] an= new Animal[2];
		an[0]=new Dog("rocky",3);
		an[1]=new Cat("angel",1);
		for(Animal a: an) {
			a.makeSound();
		}
		/*System.out.println("dog details: ");
		Dog g=new Dog("rocky",3);
		g.display();
		System.out.println("\n");
		System.out.println("cat details: ");
		Cat c=new Cat("angel",1);
		c.display();*/
		
	}

}
