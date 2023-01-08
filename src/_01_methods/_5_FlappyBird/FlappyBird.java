package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 500;
    PImage image;
    PImage burd;
    PImage spritesheet;
    double velocity= 0.08;
    		double gravity= 1;
    		double y= 200;
    		int burdFrame = 0;
    		
    		PImage currentBurd;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        image=loadImage("_01_methods/_5_FlappyBird/pixil-frame-0 (2).png");
       burd=loadImage("_01_methods/_5_FlappyBird/pixil-frame-0 (1).png");
       spritesheet = loadImage("_01_methods/_5_FlappyBird/spritesheet.png");
    }

    @Override
    public void setup() {
        burd.resize(175, 175);
        frameRate(10);
    }
 int animationSpeed = 50;
    @Override
    public void draw() {
    	image(image ,0,0);
    	// select animation
    	PImage animateBurd;
    	println("bird frame " + burdFrame*100);
    	animateBurd = spritesheet.get(burdFrame*100,0,100,100);
    	animateBurd.resize(175, 175);
    	println(frameCount);
    	// inrement animation to the next frame
    	if(frameCount % animationSpeed == 0 && burdFrame < 5) {
    		burdFrame ++;
    		println(burdFrame);
    	}
    	
    	if(frameCount < 5) {
    		currentBurd = animateBurd;
    	} else {
            // currentBurd = burd;
    	}
        image(currentBurd ,10,(float)y);
        y+= velocity;
        velocity+=gravity;
       // gravity+=frameCount *0.00001;

    }
    public void mousePressed() {
    	velocity=-15;
    	if(burdFrame >= 5)
    	burdFrame = 0;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
