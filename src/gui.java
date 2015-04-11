import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class gui extends JPanel implements ActionListener
{
	Timer time;
	Image map;
	int key,Auto_X,Auto_Y;
	int x_Car,y_Car;

	public gui()
	{
		setFocusable(true);
		ImageIcon u = new ImageIcon("C:/Users/SCHEMPIL/Documents/GitHub/Schemellearnsparking/images/Level1.png");
		map = u.getImage();

		addKeyListener(new AL());	//AktionListener aufrufen und aktivieren

		Auto_X=60;
	    Auto_Y=80;

	    time= new Timer(5,this);
	    time.start();
	}

	public void actionPerformed(ActionEvent e)
	{

	}

	public void paint (Graphics g)
	{
		super.paint(g);
		Graphics2D f2 =(Graphics2D) g;
		f2.drawImage(map,0,0,null);

		g.setColor(new Color(255,4,4));
		g.fillRect(Auto_X,Auto_Y,60,20);
	}

	private class AL extends KeyAdapter
	{
			public AL()
			{

			}

			public void keyPressed(KeyEvent e)  //tasten dr�cken
			{
				key= e.getKeyCode();

				if(key == KeyEvent.VK_LEFT)
				{	Auto_X=Auto_X-15;
					repaint();
					{

					}
				}

				if(key == KeyEvent.VK_RIGHT)
				{	Auto_X=Auto_X+15;
					repaint();
				}

				if(key == KeyEvent.VK_UP)
				{	Auto_Y=Auto_Y-15;
					repaint();
				}

				if(key == KeyEvent.VK_DOWN)
				{	Auto_Y=Auto_Y+15;
					repaint();
				}
			}

			public void keyReleased(KeyEvent e)  //Tasten losgelassen
			{
				key=e.getKeyCode();

				if(key==KeyEvent.VK_LEFT)
				{

				}

				if(key==KeyEvent.VK_RIGHT)
				{

				}
			}
	}

	public int getXCar()
	{
		return x_Car;
	}

	public int getYCar()
	{
		return y_Car;
	}
}
