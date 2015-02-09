import javax.swing.*;
import java.awt.*;

public class DobbelsteenMVC extends JApplet
{
	DobbelsteenModel model;             // het model
	TekstView tekstView;              	// view
	DobbelsteenView dobbelsteenView;  	// view
	StatistiekView statView;		  	// view
	DobbelsteenController controller;	// Controller
	
	public void init()
	{
		resize(250,500);
        
		// Maak het model
		model = new DobbelsteenModel();
        
        // Maak de controller en geef hem het model
		controller = new DobbelsteenController(model);
        controller.setBackground(Color.cyan);
        getContentPane().add(controller,BorderLayout.NORTH);
        
        // Maak de views
        dobbelsteenView = new DobbelsteenView(Color.red);
        dobbelsteenView.setBackground(Color.black);
        getContentPane().add(dobbelsteenView,BorderLayout.CENTER);
        tekstView = new TekstView();
        tekstView.setBackground(Color.green);
        getContentPane().add(tekstView,BorderLayout.SOUTH);
        statView = new StatistiekView();
        statView.setBackground(Color.yellow);
        getContentPane().add(statView,BorderLayout.SOUTH);
        // Registreer de views bij het model
        model.addActionListener(tekstView);
        model.addActionListener(dobbelsteenView);
        model.addActionListener(statView);
    
        
        // Eerste worp
        model.gooi();
	}
}
