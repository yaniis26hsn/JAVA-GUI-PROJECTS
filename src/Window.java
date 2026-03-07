
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends Frame {
protected Panel p;
protected Choice c;
protected List l;
protected Button suite;
protected Button exit ;
protected TextArea texte;
String vehicule ;
String Destination ;
Window() {
    p = new Panel();
    c = new Choice();
    c.add("Car") ;
    c.add("train") ;
    c.add("plane") ;
    c.add("bycicle") ;
    p.add(c);
    l = new List(5);
    l.add("Cairo ") ;
    l.add("Tunis") ;
    l.add("algeirs" ) ;
    p.add(l);
    texte = new TextArea();
     suite = new Button("validate your choice");
    suite.setBounds(100, 100, 30, 30);
    suite.addActionListener(new ActionListener (){
    	public void actionPerformed(ActionEvent a){
		vehicule = c.getSelectedItem() ;
		Destination = l.getSelectedItem() ; 
		 texte.setText("you want to get to " + Destination + " using a : " + vehicule ) ;
		    
		}
    
    }) ;
    p.add(suite);
  

    exit = new Button("Exit and Close Everything ") ;
    exit.setBounds(20, 100, 100 , 50);
    exit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a){System.exit(0);} ;
    });

    p.add(exit) ;

    add("North", p);
   
   
    add("South", texte);
     addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent e) {
            dispose(); // or System.exit(0)
        }
    });
}}





