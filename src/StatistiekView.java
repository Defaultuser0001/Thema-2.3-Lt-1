
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
    
public class StatistiekView extends JPanel implements ActionListener
{
	private JTextField aantalWorpen = new JTextField();
	private JTextField worpen = new JTextField();
    DobbelsteenModel d;
    
	public StatistiekView()
	{
		setLayout(new GridLayout(2,1));
		this.add(aantalWorpen);
	    this.add(worpen);
	}
	
	public void actionPerformed( ActionEvent e )
	{
	    d = (DobbelsteenModel) e.getSource();
	    aantalWorpen.setText("Aantal worpen: " + d.getAantalWorpen());
	    worpen.setText(d.getAantalWorpen() + ": " + d.getWaarde());
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(50,200);
	} 
}
