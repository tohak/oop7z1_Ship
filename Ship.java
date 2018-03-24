package oop7z1b;

public class Ship {
	
	private String nameShip;
	
	
	public Ship(String nameShip) {
		super();
		this.nameShip = nameShip;
	}

	public String getNameShip() {
		return nameShip;
	}
	public void action(Ship ship) {		
		try {
			wait(500 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("razryzilsay " + this.getNameShip());		
	}
	

}
