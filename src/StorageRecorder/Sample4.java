package StorageRecorder;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class Sample4 extends JFrame{
    JTextField tf1 , tf2 ;
    JButton show , add , quit ;
     int lastId ; // by default it starts by 0 and it increases with each item added
    ArrayList <Item>  myItems ; 
    JLabel lb1 , lb2 ;

    public Sample4(){
        super("Container Filler");

        myItems = new ArrayList<>() ;
        setSize(800, 600);
        setLayout(null);

        lb1 = new JLabel("The name :") ;
        lb1.setBounds(80, 100, 100, 100);
        add(lb1) ;

        lb1 = new JLabel("The quantity :") ;
        lb1.setBounds(400, 100, 100, 100);
        add(lb1) ;

        tf1 = new JTextField();
        tf1.setBounds(200, 125, 100, 50);
        add(tf1) ;

         tf2 = new JTextField();
        tf2.setBounds(500, 125, 100, 50);
        add(tf2) ;

        add = new JButton("add") ;
        add.setBounds(200, 300, 100, 100);
        add(add) ;

         show = new JButton("show") ;
        show.setBounds(400, 300, 100, 100);
        add(show) ;

         quit = new JButton("quit") ;
        quit.setBounds(600, 300, 100, 100);
        add(quit) ;

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                // myItems[myItems.length] = {lastId ++ ,tf1.getText() , tf2.getText() } ;
                // myItems[lastId] = new Item() ;
                // myItems[lastId].id = lastId ; // it will be affected then lastId will increment
                // myItems[lastId].name = tf1.getText() ;
                
                // try {
                //     myItems[lastId].quantity = Integer.parseInt(tf2.getText()) ;
                // } catch (NumberFormatException e) {
                //     System.out.println("you should input an integer ");
                // }
                // lastId ++ ;
                Item theNewItem = new Item() ;
                theNewItem.id = lastId ;
                theNewItem.name = tf1.getText() ;
                tf1.setText("");
                  try {
                    theNewItem.quantity = Integer.parseInt(tf2.getText()) ;
                     myItems.add(theNewItem) ;
                     tf2.setText("");
                 } catch (NumberFormatException e) {
                     System.out.println("you should input an integer ");
                     lastId-- ; // to prevent the id from increasing , i could just lastId ++ ; inside catch but however 
                 }
                 lastId ++ ;
            }
        });

        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                new Display(myItems) ;
            }
        });
         quit.addActionListener(new ActionListener() {

           public void actionPerformed(ActionEvent a) {
               System.exit(0);
           }

       });
      setVisible(true) ;
    }

}

