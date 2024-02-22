package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(10, 138, 40);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		double[]x = {0.25, 0.5, 0.5};
		double[]y = {0.5, 0.65, 0.35};
		StdDraw.setPenColor(232, 225, 14);
		StdDraw.filledPolygon(x, y);
		double[]z = {0.5, 0.5, 0.75};
		double[]w = {0.35, 0.65, 0.5};
		StdDraw.setPenColor(232, 225, 14);
		StdDraw.filledPolygon(z, w);
		StdDraw.setPenColor(24, 18, 130);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		double[]m = {0.4, 0.4, 0.6, 0.6};
		double[]n = {0.52, 0.5, 0.48, 0.5};
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledPolygon(m,n);
	}
}