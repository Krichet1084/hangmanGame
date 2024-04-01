/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.scoreMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author kshar1
 */
public class scoreMenu extends javax.swing.JFrame {
    
    private String[][] info;
    /**
     * Creates new form scoreMenu
     */
    public scoreMenu() {
        sortedScore();
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.getContentPane().setBackground(Color.darkGray);
        scoreBoard.getTableHeader().setDefaultRenderer(new CustomHeaderRenderer());
        scorePane.getViewport().setBackground(Color.darkGray);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        scorePane = new javax.swing.JScrollPane();
        scoreBoard = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        homeButton.setBackground(java.awt.Color.black);
        homeButton.setForeground(java.awt.Color.white);
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(java.awt.Color.black);
        resetButton.setForeground(java.awt.Color.white);
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        scorePane.setBackground(java.awt.Color.black);
        scorePane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scorePane.setForeground(java.awt.Color.darkGray);
        scorePane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scorePane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        scoreBoard.setBackground(java.awt.Color.darkGray);
        scoreBoard.setForeground(java.awt.Color.white);
        scoreBoard.setModel(new javax.swing.table.DefaultTableModel(
            info,
            new String [] {
                "Usernames", "Guesses", "Mistakes", "Unique Letters", "Total Letters"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scoreBoard.setGridColor(java.awt.Color.black);
        scoreBoard.setSelectionForeground(java.awt.Color.darkGray);
        scoreBoard.getTableHeader().setResizingAllowed(false);
        scoreBoard.getTableHeader().setReorderingAllowed(false);
        scorePane.setViewportView(scoreBoard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scorePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scorePane, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static class CustomHeaderRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(Color.darkGray);
            c.setForeground(Color.white);
            return c;
        }
    }
    
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        scoreMenu.this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        try{
            FileWriter myWriter = new FileWriter("files/leaderboard.txt", false);
            myWriter.write("");
            myWriter.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void scoreValues(){
        String entry=null;
        int numOfLines =0;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("files/leaderboard.txt"));
            while(reader.readLine() != null)
            numOfLines++;
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        if(numOfLines!=0){
            info = new String[numOfLines-1][5];
            for(int x=0; x<numOfLines; x++){
                try (Stream<String> lines = Files.lines(Paths.get("files/leaderboard.txt"))) {
                    entry=lines.skip(x).findFirst().get();
                    if(x!=0){
                        info[x-1]=entry.split(" ");
                    }
                }
                catch(IOException e){
                    System.out.println(e);
                }
            }
        }
        
    }
    
    private void sortedScore(){
        scoreValues();
        //REST OF METHOD IS CHAT GPT CODE
        try{
            Comparator<String[]> comparator = (row1, row2) -> {
                // Convert 'b' and 'd' values to doubles
                double b1 = Double.parseDouble(row1[2]);
                double d1 = Double.parseDouble(row1[4]);
                double b2 = Double.parseDouble(row2[2]);
                double d2 = Double.parseDouble(row2[4]);

                // Calculate the ratio of b/d for each row
                double ratio1 = b1 / d1;
                double ratio2 = b2 / d2;

                // Compare the ratios
                return Double.compare(ratio1, ratio2);
            };

            // Sort the array based on the ratio of b/d

                Arrays.sort(info, comparator);
                
                // Replace the original array with its sorted version
                System.arraycopy(info, 0, info, 0, info.length);
        }
        catch(NullPointerException e){
            System.out.println(e);
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void create() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(scoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTable scoreBoard;
    private javax.swing.JScrollPane scorePane;
    // End of variables declaration//GEN-END:variables
}
