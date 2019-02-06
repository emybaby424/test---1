import  javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class test_1 extends JPanel
{
	// You may change this constant
	private static final int SIZE = 400;

	public static void main(String[] args) 
	{
		// You may change the parameters in the code below a little, 
// but proceed with extreme caution. Do not reorder the methods.
		JFrame frame = new JFrame("Line");
		JPanel panel = new test_1();
		frame.setSize(SIZE,SIZE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setVisible(true);
	}
	
	// Do not change this method name or parameters
	public void paintComponent(Graphics g)
	{
		// Do not change the next two lines of code
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// This is where your code should go
		
		// construct the panda's ear
		Ellipse2D.Double leftEar = new Ellipse2D.Double(150, 130, 190, 180);
		g2d.setColor(Color.BLACK);
		g2d.fill(leftEar);
		g2d.draw(leftEar);
		
		Ellipse2D.Double rightEar = new Ellipse2D.Double(550, 130, 190, 180);
		g2d.setColor(Color.BLACK);
		g2d.fill(rightEar);
		g2d.draw(rightEar);
		
		// construct the panda's face
		Ellipse2D.Double face = new Ellipse2D.Double(185, 210, 520, 450);
		g2d.setColor(Color.WHITE);
		g2d.fill(face);
		g2d.draw(face);
		
		// construct the panda's eyes
		Ellipse2D.Double leftEye = new Ellipse2D.Double(300, 350, 70, 90);
		g2d.setColor(Color.BLACK);
		g2d.fill(leftEye);
		g2d.draw(leftEye);
		
		Ellipse2D.Double rightEye = new Ellipse2D.Double(530, 350, 70, 90);
		g2d.setColor(Color.BLACK);
		g2d.fill(rightEye);
		g2d.draw(rightEye);
		
		// construct the panda's blush
		Ellipse2D.Double blush1 = new Ellipse2D.Double(250, 470, 70, 40);
		g2d.setColor(Color.PINK);
		g2d.fill(blush1);
		g2d.draw(blush1);
		
		Ellipse2D.Double blush2 = new Ellipse2D.Double(580, 470, 70, 40);
		g2d.setColor(Color.PINK);
		g2d.fill(blush2);
		g2d.draw(blush2);
		
		// construct the panda's nose
		Ellipse2D.Double nose = new Ellipse2D.Double(420, 440, 55, 40);
		g2d.setColor(Color.BLACK);
		g2d.fill(nose);
		g2d.draw(nose);
		
		
		// construct the panda's mouth
        g2d.setStroke(new BasicStroke(10));
		g.drawArc(400, 490, 55, 65, 200, 130);
		g.drawArc(450, 505, 55, 50, 190, 170);
		
		g2d.setColor(Color.PINK);
		g.drawString("Hi Panda!", 450, 700);
		
		
	}

}
