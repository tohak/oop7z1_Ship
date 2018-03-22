package oop7z1;

public class Doc {
	private boolean turn = true;

	public Doc() {
		super();
		// TODO Auto-generated constructor stub
	}
	

public boolean isTurn() {
		return turn;
	}


public synchronized void action() {
	turn=false;
	try {
		wait(500*10);
	} catch (InterruptedException e) {		
		e.printStackTrace();
	}	
	System.out.println("razryzilsay "+Thread.currentThread().getName());
	turn=true;	
	}
}
