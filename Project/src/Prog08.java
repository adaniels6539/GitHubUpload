// APCS1 Lab Test 1
//
// Prog08.java
//
// JPII
//
// Points: 4
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program displays 3 large rectangles.
// You need to add to the program so that it will display the letters "JPII".
// These letters should be the same height & width and in the same location
// as the original 3 rectangles.
// NOTE: The double II takes up the space of 1 rectangular block.
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog08.html in order to execute this file.


import java.awt.*;
import java.applet.*;


public class Prog08 extends Applet
{
	public void paint(Graphics g)
	{
		// Draw 3 big rectangles
		//g.setColor(Color.ORANGE);

		
		// J
	g.setColor(Color.BLACK);
		g.fillRect(10, 100, 300, 50); // across bar
		g.fillRect(100, 100, 50, 300);
		g.fillRect(15, 325, 125, 75);
		g.fillRect(15, 275, 50, 50);
		//g.fillRect(x, y, width, height);

		// P
		g.setColor(Color.BLACK);
		g.fillRect(250, 100, 100, 400);
		g.fillArc(250, 100, 200, 200, 270, 180);
		g.setColor(Color.WHITE);
		g.fillOval(315, 150, 75, 75);

		// II
		g.setColor(Color.BLACK);
		g.fillRect(550, 100, 50, 400); //vertical 1
	g.fillRect(650, 100, 50, 400); //vertical 2
	g.fillRect(475, 100, 300, 50); //horizontal 2
	g.fillRect(475, 500, 300, 50); //horizontal 3
	
	}
}

