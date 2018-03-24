package oop7z1b;

import java.io.IOException;
import java.util.Timer;

public class DocThread implements Runnable {
	
	private Ship ship;
	
	public DocThread(Ship ship) {
		super();
		this.ship = ship;
	}


	public DocThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Ship getShip() {
		return ship;
	}
public void unlock(Ship ship) {
	
}

	@Override
	public void run() {
		try {
			Thread th=Thread.currentThread();
			th.sleep(500*10);			
			System.out.println("unlock " + ship.getNameShip());	
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			}
		}