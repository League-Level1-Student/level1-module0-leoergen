package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 500;
    PImage image;
    PImage burd;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        image=loadImage("_01_methods/_5_FlappyBird/pixil-frame-0 (2).png");
       burd=loadImage("_01_methods/_5_FlappyBird/pixil-frame-0 (1).png");
    }

    @Override
    public void setup() {
        image(image ,0,0);
        image(burd ,10,10);
    }

    @Override
    public void draw() {
        
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
