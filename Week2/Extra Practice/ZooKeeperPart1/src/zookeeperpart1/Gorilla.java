package zookeeperpart1;

public class Gorilla extends Mammal {

	// inherit super class with Gorilla class
	public Gorilla(int energyLvl) {
		super(energyLvl);
	}
	
	public void throwSomething() {
		System.out.println("I just threw something!");
		this.energyLvl -= 5;
		System.out.println(displayEnergy());
	}
	
	public void eatBananas() {
		System.out.println("Now eating a banana...yum!");
		this.energyLvl += 10;
		System.out.println(displayEnergy());
	}
	
	public void climb() {
		System.out.println("I am climbing this tree now.");
		this.energyLvl -= 10;
		System.out.println(displayEnergy());
	}
}
