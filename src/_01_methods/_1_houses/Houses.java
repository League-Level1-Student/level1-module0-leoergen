package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		
		// Check the recipe to find out what code to put here
		Robot rob=new Robot(10,200);
		rob.penDown();
		rob.miniaturize();
buildhousen

		
	}
	
	public void buildhousen (Robot rob) {
		rob.setPenColor(Color.GRAY);
		rob.move(50);
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
		rob.move(50);
		rob.setPenColor(Color.green);
		rob.turn(-45);
		rob.move(10);
		rob.turn(-45);
		rob.move(10);
		rob.turn(-45);
		rob.move(10);
		rob.turn(-45);
	}
}
