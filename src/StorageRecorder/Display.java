package StorageRecorder;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame {

    public Display(ArrayList<Item> theItems) {
        setTitle("My Items");
        setSize(500, 1000);

      
        String[][] myTable = new String[theItems.size()][3];
        String[] header = {"ID", "Name", "Quantity"};

       
        for (int i = 0; i < theItems.size(); i++) {
            Item item = theItems.get(i);  
            myTable[i][0] = String.valueOf(item.id);
            myTable[i][1] = item.name;
            myTable[i][2] = String.valueOf(item.quantity);
        }

        JTable table = new JTable(myTable, header);

        
        JScrollPane sp = new JScrollPane(table);
        add(sp);

        setVisible(true);
    }
}