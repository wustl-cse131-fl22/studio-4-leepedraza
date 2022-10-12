package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		//background
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.9, 0.4);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.9, 0.4);
		
		//left column
		StdDraw.setPenColor(2, 4, 10);
		StdDraw.filledRectangle(0.2, 0.85, 0.3, 0.05);
		
		StdDraw.setPenColor(200, 200, 200);
		StdDraw.filledRectangle(0.2, 0.65, 0.3, 0.15);
		
		StdDraw.setPenColor(200, 0, 200);
		StdDraw.filledRectangle(0.2, 0.45, 0.3, 0.05);
		
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0.2, 0.3, 0.3, 0.1);
		
		StdDraw.setPenColor(0, 0, 200);
		StdDraw.filledRectangle(0.2, 0.15, 0.3, 0.05);
		
		//right column
		StdDraw.setPenColor(0, 200, 200);
		StdDraw.filledRectangle(0.8, 0.8, 0.3, 0.1);
		
		StdDraw.setPenColor(255, 100, 0);
		StdDraw.filledRectangle(0.8, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(255, 200, 255);
		StdDraw.filledRectangle(0.8, 0.25, 0.3, 0.05);
	}
}