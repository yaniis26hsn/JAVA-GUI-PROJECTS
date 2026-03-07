

import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Inter extends JFrame  {
	
	JLabel lb1, lb2, lb3;
	JTextField tf1, tf2, tf3;
	JButton b1, b2, b3;
	public Inter(){
		super("Somme de deux entiers");
		setSize(500, 500);
		setLayout(null);
		
		lb1 = new JLabel("Nombre 1"); lb1.setBounds(50,50,100,20); add(lb1);
		lb2 = new JLabel("Nombre 2"); lb2.setBounds(50,160,100,20); add(lb2);
		lb3 = new JLabel("resultat"); lb3.setBounds(50,270,100,20); add(lb3);
		
		tf1 = new JTextField(); tf1.setBounds(160,50,100,20); add(tf1);
		tf2 = new JTextField(); tf2.setBounds(160,160,100,20); add(tf2);
		tf3 = new JTextField(); tf3.setBounds(160,270,100,20); add(tf3);
		
		b1 = new JButton("add"); b1.setBounds(300,50,100,20); add(b1);
		b2 = new JButton("clean clean"); b2.setBounds(300,160,100,20); add(b2);
		b3 = new JButton("quit"); b3.setBounds(300,270,100,20); add(b3);
		
		b1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent a){
				try {
					int n1 = Integer.parseInt(tf1.getText()) ;
		int n2 = Integer.parseInt(tf2.getText()) ;
	    tf3.setText(Integer.toString(n1+n2)) ;
				}catch(NumberFormatException ex){
					System.out.println("you should input only integers");
				}
		
			}
			
		} ) ;
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent a){
				tf1.setText("") ;
				tf2.setText("") ;
				tf3.setText("") ;
				
			}
			
		} ) ;
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent a){
				System.exit(0);
				
			}
			
		} ) ;
		setVisible(true);
	}
}


