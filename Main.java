package oop7z1;

public class Main {

	public static void main(String[] args) {
		Doc docOne=new Doc();
		Doc docTho=new Doc();
		
		ShipThread threadOne = new ShipThread("ShipOne");
		ShipThread threadTho= new ShipThread("ShipTho");
		ShipThread threadThree= new ShipThread("ShipThree");
		
		threadOne.check(docOne, docTho);
		threadTho.check(docOne, docTho);
		threadThree.check(docOne, docTho);

	}
	
	
	

}
