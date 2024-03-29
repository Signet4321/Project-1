
package Project1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

 public class NewJFrame3 extends JPanel {

 public NewJFrame3() {
 super(new GridLayout(1,0));
 JTable table = new JTable(new MyTableModel());
 table.setPreferredScrollableViewportSize(new Dimension(500, 70));
 table.setFillsViewportHeight(true);

 JScrollPane scrollPane = new JScrollPane(table);

 add(scrollPane);
 }
 class MyTableModel extends AbstractTableModel {
 private String[] columnNames = {"1st Name",
 "Last Name",
 "ID/NUMBER",
 "Monday",
 "Tuesday",
 "Wednesday",
 "Thursday",
 "Friday"};
 private Object[][] data = {
 {"Corwin", "Addo",
 "110023", new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true)},
 {"Cozai", "Enam",
 "343409", new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true)},
 {"Daniel", "Alpha",
 "899800", new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true),new Boolean(true)},
 {"Michelle", "Pompojoo",
 "990909", new Boolean(false),new Boolean(false),new Boolean(false),new Boolean(false),new Boolean(true)},

 };
 public int getColumnCount() {
 return columnNames.length;
 }
 public int getRowCount() {
 return data.length;
 }
 public String getColumnName(int col) {
 return columnNames[col];
 }
  public Object getValueAt(int row, int col) {
  return data[row][col];
  }

public Class getColumnClass(int c) {
  return getValueAt(0, c).getClass();
   }




 }

 private static void createAndShowGUI() {
 //Create and set up the window.
 JFrame frame = new JFrame("TableDemo");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //Create and set up the content pane.
 NewJFrame3 newContentPane = new NewJFrame3();
 newContentPane.setOpaque(true); //content panes must be opaque
 frame.setContentPane(newContentPane);
 //Display the window.
 frame.pack();
 frame.setVisible(true);
 }
 public static void main(String[] args) {
     NewJFrame3 newJFrame = new NewJFrame3();
 SwingUtilities.invokeLater(new Runnable() {
 @Override
 public void run() {
 createAndShowGUI();
 }
 });
 }
 }

