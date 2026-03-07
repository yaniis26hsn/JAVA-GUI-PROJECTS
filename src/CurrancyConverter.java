import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrancyConverter extends JFrame  {

    JLabel lb1, lb2, lb3, lb4;
    JTextField tf1, tf2, tf3;
    JButton b2, b3;
    JSpinner spinner;

    public CurrancyConverter() {
        super("Currancy Converter");

        spinner = new JSpinner(new SpinnerNumberModel(1.5, 1, 2, 0.01));
        spinner.setBounds(160, 160, 100, 20);
        add(spinner);

        setSize(500, 500);
        setLayout(null);


        lb1 = new JLabel("euro <=> $  ");
        lb1.setBounds(160, 50, 100, 20);
        add(lb1);
        lb2 = new JLabel("Unit Price : ");
        lb2.setBounds(50, 160, 100, 20);
        add(lb2);
        lb3 = new JLabel(" $ : ");
        lb3.setBounds(350, 50, 100, 20);
        add(lb3);
        lb4 = new JLabel(" $ : ");
        lb4.setBounds(270, 160, 100, 20);
        add(lb4);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 100, 20);
        add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(250, 50, 100, 20);
        add(tf2);



        b3 = new JButton("Quit");
        b3.setBounds(300, 300, 100, 20);
        add(b3);

        tf1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent a) {
                try {
                    double n1 = Double.parseDouble(tf1.getText());
                    double n2 = (Double) spinner.getValue();
                    tf2.setText(Double.toString(n1 * n2));
                    lb1.setText ("euro => $ ") ;
                }catch (NumberFormatException e){
                    System.out.println("wrong input : you must enter a number");
                }

            }

        });

        tf2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent a) {
                try {
                    double n1 = Double.parseDouble(tf2.getText());
                    double n2 = (Double) spinner.getValue();
                    tf1.setText(Double.toString(n1 / n2));
                    lb1.setText ("euro <= $ ") ;
                } catch (NumberFormatException e) {
                    System.out.println("wrong input : you must enter a number");
                }
            }

        });

        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent a) {
                System.exit(0);
            }

        });
        setVisible(true);

    }
}