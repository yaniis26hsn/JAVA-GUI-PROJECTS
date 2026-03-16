
import Calculator.*;
import Ilearning.*;
import LogIn.*;
import StorageRecorder.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;
import javax.swing.* ;


public class Menu extends JFrame {
   JButton b1 , b2 , b3 , b4 , b5 , b6, b7 , exit  ;
   public Menu(){
       super("Main Menu");
       setSize(800 , 800) ;
       setLayout(null) ;
       b1 = new JButton("ADDER") ;

       b1.setBounds(250 , 5 , 300 , 35 ) ;
       add(b1) ;
       b1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a){ new Inter() ; //  this will run the code in the constructor so it will make the frame and everything else
               }

           }) ;
            b2 = new JButton("CURRANCY CONVERTER") ;
       
       b2.setBounds(250 , 200 , 300 , 35 ) ;
       add(b2) ;
       b2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a){ new CurrancyConverter() ; }
            
           }) ;
            b3 = new JButton("TRIP") ;
       
       b3.setBounds(250 , 300 , 300 , 35 ) ;
       add(b3) ;
       b3.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a){ 

		Window window = new Window() ;
		window.pack();
		window.setVisible(true) ;
                }

           }) ;
           b4 = new JButton("STORAGE RECORDER") ;
       
       b4.setBounds(250 , 400 , 300 , 35 ) ;
       add(b4) ;
       b4.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a){ 
                 new Sample4() ;
		
                }

           }) ;
         b5 = new JButton("LOG IN") ;
          b5.setBounds(250 , 500 , 300 ,35) ;
          add(b5) ;
          b5.addActionListener(e -> {
          javax.swing.SwingUtilities.invokeLater(() -> new log().setVisible(true));
          });

           b7 = new JButton("ILEARNING") ;
          b7.setBounds(250 , 100 , 300 ,35) ;
          add(b7) ;
          b7.addActionListener(e -> {
          javax.swing.SwingUtilities.invokeLater(() -> new exo7().setVisible(true));
          });

          b6 = new JButton("CALCULATOR") ;
          b6.setBounds(250 , 600 , 300 ,35) ;
          add(b6) ;
           b6.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent a) {
               new Calculator() ;
           }
        });

       exit = new JButton("Exit") ;
       exit.setBounds(350 , 700 , 100 , 35 ) ;
       add(exit) ;
       exit.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent a) {
               System.exit(0);
           }

       });



       setVisible(true);
   }


}
