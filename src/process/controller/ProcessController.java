package process.controller;

import process.model.PlayDohCircle;

public class ProcessController
{
	public ProcessController()
	{
		
	}
	
	public void start()
	{
		System.out.println("Hello! Practice in progress");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		
	}
	
	
}
