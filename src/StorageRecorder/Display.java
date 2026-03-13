package StorageRecorder;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame {

    public Display(ArrayList<Item> theItems) {
        setTitle("My Items");
        setSize(500, 1000);

        // Create table data dynamically based on ArrayList size
        String[][] myTable = new String[theItems.size()][3];
        String[] header = {"ID", "Name", "Quantity"};

        // Fill table using ArrayList methods
        for (int i = 0; i < theItems.size(); i++) {
            Item item = theItems.get(i);  // get item from ArrayList
            myTable[i][0] = String.valueOf(item.id);
            myTable[i][1] = item.name;
            myTable[i][2] = String.valueOf(item.quantity);
        }

        JTable table = new JTable(myTable, header);

        // Add scroll pane
        JScrollPane sp = new JScrollPane(table);
        add(sp);

        setVisible(true);
    }
}