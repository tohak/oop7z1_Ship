package oop7z1;

public class ShipThread implements Runnable{
	private Doc doc;
	private String name;

	public ShipThread(Doc doc,String name) {
		super();
		this.doc = doc;
		this.name=name;
		}	
	
	public ShipThread(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void check(Doc docOne, Doc docTho) {		
		for (;docOne.isTurn()==false && docTho.isTurn()==false;) {
			try {
				wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		if (docOne.isTurn()==true) {
			Thread th= new Thread(new ShipThread(docOne,this.name));
			th.start();
		}else if (docTho.isTurn()==true) {
			Thread th= new Thread(new ShipThread(docTho,this.name));
			th.start();
		}	
			}
	@Override
	public void run() {
		doc.action();
		
	}

}
