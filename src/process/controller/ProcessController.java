package process.controller;

import process.model.PlayDohCircle;
import process.model.PlayDohSnake;
import process.model.PlayDohPoly;
import java.util.Scanner;

public class ProcessController
{
	
	public void start()
	{
		System.out.println("Welcome to practice!");
		
		/////
		//Custom Circle
		/////
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		System.out.println("Look, You made a Circle");
		
		PlayDohCircle customCircle = new PlayDohCircle(circleSize);
		System.out.println(customCircle);
		
		/////
		//Circle
		/////
		
		System.out.println("Look, I made a Circle");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle = new PlayDohCircle(41);
		
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		System.out.println(thirdCircle);
		
		/////
		//Snake
		/////
		
		System.out.println("Look, I made a Snake");
		
		PlayDohSnake firstSnake = new PlayDohSnake(1);
		PlayDohSnake secondSnake = new PlayDohSnake(2);
		PlayDohSnake thirdSnake = new PlayDohSnake(3);
		
		System.out.println(firstSnake);
		System.out.println(secondSnake);
		System.out.println(thirdSnake);
		
		/////
		//Polygon
		////
			
		System.out.println("Look, I made a Polygon");
			
		PlayDohPoly firstPoly = new PlayDohPoly();
		PlayDohPoly secondPoly = new PlayDohPoly(8);
		PlayDohPoly thirdPoly = new PlayDohPoly(3);
			
		System.out.println(firstPoly);
		System.out.println(secondPoly);
		System.out.println(thirdPoly);
		
		
		
	}
	
	
}
