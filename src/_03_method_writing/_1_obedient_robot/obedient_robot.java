package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	
	static Robot rob = new Robot();
	
	
public static void main(String[] args) {
	
	String shape = JOptionPane.showInputDialog(null, "Do you want to draw a circle, square, or triangle?");
	String color = JOptionPane.showInputDialog(null, "Do you want to draw your shape in red, green, or blue?");
	
	Color color1;
	if (color.equalsIgnoreCase("red")) {
		color1=Color.RED;
	}
	else if(color.equalsIgnoreCase("blue")) {
		color1=Color.BLUE;
	}
	else {
		color1=Color.GREEN;
	}
	
	if(shape.equals("circle")) {
		drawCircle(color1);
	}
	else if(shape.equals("square")) {
		drawSquare(color1);
	}
	else {
		drawTriangle(color1);
	}
	
}

private static void drawCircle(Color color1) {
	rob.penDown();
	rob.setPenColor(color1);
	for (int i = 0; i < 36; i++) {
		rob.setSpeed(10);
		rob.move(10);
		rob.turn(10);
		
	}
}

private static void drawTriangle(Color color1) {
	rob.penDown();
	rob.setPenColor(color1);
	rob.turn(150);
	for (int i = 0; i <3; i++) {
		rob.setSpeed(10);
		rob.move(150);
		rob.turn(120);
		
	}
	
}

private static void drawSquare(Color color1) {
	rob.penDown();
	rob.setPenColor(color1);
	for (int i = 0; i < 4; i++) {
		rob.setSpeed(10);
		rob.move(150);
		rob.turn(90);
	}	
	
}


}

