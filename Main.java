package oop7z1b;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Ship shipOne=new Ship("shipOne");
		Ship shipTho=new Ship("shipTho");
		Ship shipThree=new Ship("shipThree");
		
		ExecutorService exSer=Executors.newFixedThreadPool(2);
		exSer.submit(new DocThread(shipOne));
		exSer.submit(new DocThread(shipTho));
		exSer.submit(new DocThread(shipThree));
		exSer.shutdown();


		
	}

}
