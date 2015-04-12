import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class frame  extends JFrame implements ActionListener{

	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;

	public static void main(String[] args)
	{
			frame frame = new frame("Menü");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(992,640);
			
			frame.setLayout(null);
			frame.setVisible(true);
	}

	public frame(String title)
	{
		super(title);
		
		setContentPane(new JLabel(new ImageIcon("C:/Users/Stefan/Documents/GitHub/Schemellearnsparking/images/menue.png")));
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(420,280,160,40);
		schliessen.addActionListener(this);
		add(schliessen);
		
		einstellung = new JButton("Einstellungen");
		einstellung.setBounds(420,360,160,40);
		einstellung.addActionListener(this);
		add (einstellung);
		
		info = new JButton("Credits");
		info.setBounds(420,440,160,40);
		info.addActionListener(this);
		add (info);
		
		ende = new JButton("Ende");
		ende.setBounds(420,520,160,40);
		ende.addActionListener(this);
		add (ende);
	}
	
	public void paint (Graphics g)
	{
		super.paint(g);		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== schliessen)
		{
			fenster();
		}
		
		if(e.getSource()== info)
		{
			Object[] options = { "OK"};     //Informationen
			JOptionPane.showOptionDialog(null, "Programmiert von Stefan Schemel  ", "Informationen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		}
		
//		if(e.getSource()== einstellung)
//		{
//			auswahl();
//		}
		
		if(e.getSource()== ende)
		{
			System.exit(0);
		}
	}
		
	
//	public static void auswahl()
//	{
//		
//	}
	public static void fenster()
	{
		JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(1000,680);
		fenster.setVisible(true);
		fenster.add(new gui());
	}
}
