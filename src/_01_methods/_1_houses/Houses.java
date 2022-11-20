package _01_methods._1_houses;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() throws IOException {
		
		// Check the recipe to find out what code to put here
		Robot rob=new Robot(ImageIO.read(new File("/Users/league 1/git/level1-module0-leoergen/images/pixil-gif-drawing.gif")));
		rob.penDown();
		rob.setSpeed(25);
		point(rob);
		point(rob);
		flat(rob);
		point(rob);
		flat(rob);
		flat(rob);
	}
	
	public void point (Robot rob) {
		rob.setPenColor(Color.GRAY);
		rob.move(50);
		rob.turn(45);
		rob.setPenColor(Color.red);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.setPenColor(Color.GRAY);
		rob.turn(45);
		rob.move(50);
		rob.setPenColor(Color.green);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
		
	}
	public void flat (Robot rob) {
		rob.setPenColor(Color.GRAY);
		rob.move(68);
		rob.turn(90);
		rob.setPenColor(Color.red);
		rob.move(50);
		rob.setPenColor(Color.GRAY);
		rob.turn(90);
		rob.move(68);
		rob.setPenColor(Color.green);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
		
	}
}
