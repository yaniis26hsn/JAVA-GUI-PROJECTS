// import java.lang.*; imported by default 
package Calculator;
import javax.swing.*; // since i need a lot of classes from it 

// TODO later on , add more functionalities as sqrt , untill that time , power will take care of the mission
public class Calculator extends JFrame{
 static final String myLabels = "0123456789.+-*/^=XC" ;
 Operation selectedOperation;
 double firstNumber ;
 

  JTextField screen ;
   JButton[] myButtons ; 
  public Calculator(){
    super("myCalculator") ;
        setSize(600, 1000);
        setLayout(null);
      screen = new JTextField("0") ;
      screen.setBounds(50, 60,460, 100);
      add(screen) ;
        myButtons = new JButton[20] ;
        for(int i=0 ; i<19 ; i++){
          myButtons[i] = new JButton(String.valueOf(myLabels.charAt(i))) ;
          int col = i % 4;
          int row = i / 4;
          myButtons[i].setBounds(50 + col * 120, 180 + row * 120, 100, 100);
        }
      
         myButtons[19] = new JButton("exit") ;
        myButtons[19].setBounds(50 + 3 * 120, 180 + 4 * 120, 100, 100) ;

       for (int i = 0; i < 20; i++) {
           add(myButtons[i]) ;
       }
       for (int i = 0; i < 10; i++) {
        final int index = i ;
            myButtons[i].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 // when screen is empty (or it has 0 you need to set directly , no concatenation)
                 if(screen.getText().equals("0")) screen.setText(""); ;
                screen.setText(screen.getText() + String.valueOf(index));
                //or i can do : screen.setText(screen.getText() + myButtons[index].getText());
            }
        });
         
       }
       myButtons[10].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              if(!screen.getText().contains(".") && !screen.getText().isEmpty())
                screen.setText(screen.getText() + "." ) ;
                
            }
        });
       for(int index = 11 ; index < 16 ; index++){
        final int i= index ;
         myButtons[index].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    firstNumber = Double.parseDouble(screen.getText());
                } catch (NumberFormatException e) {
                    System.out.println("you should input a number");
                }
                if(i == 11) selectedOperation = Operation.sum ;
                else if(i == 12) selectedOperation = Operation.substraction ;
                else if(i == 13) selectedOperation = Operation.multiplication ;
                else if(i == 14) selectedOperation = Operation.division ;
                else if(i == 15) selectedOperation = Operation.power ;
               screen.setText("0");
            }
        });
       }
     
            myButtons[16].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 
               try {
                if(selectedOperation == null) {
                    System.out.println("error : no operation was even selected");
                    return ;
                }
                    if(selectedOperation == Operation.sum) screen.setText( String.valueOf(Double.parseDouble(screen.getText()) + firstNumber) ) ;
             else if(selectedOperation == Operation.substraction) screen.setText( String.valueOf( firstNumber - Double.parseDouble(screen.getText())) ) ;
             else if(selectedOperation == Operation.multiplication) screen.setText( String.valueOf(Double.parseDouble(screen.getText()) * firstNumber) ) ;
             else if(selectedOperation == Operation.division){
                if(Double.parseDouble(screen.getText()) != 0) {
                    screen.setText( String.valueOf( firstNumber / Double.parseDouble(screen.getText()) ) ) ;
                }else{
                    System.out.println("you can't divid by 0");
                }
             } 
             else if(selectedOperation == Operation.power) screen.setText(String.valueOf(Math.pow( firstNumber,Double.parseDouble(screen.getText()) )) ) ;
               } catch (NumberFormatException e) {
                System.out.println("you should never input a string ");
               } 
            //catch(ArithmeticException e){
            //     System.out.println("you should never divide by 0 ");
            //    }
            // useless cz it doesnt work for doubles
             
            }
        });
         myButtons[17].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(screen.getText().length() == 1) screen.setText("0");
                else screen.setText(screen.getText().substring(0, screen.getText().length() - 1) );
            }
        });
        myButtons[18].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screen.setText("0");
            }
        });
        
       

        myButtons[19].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0) ;
            }
        });
        setVisible(true) ;
  }
}
