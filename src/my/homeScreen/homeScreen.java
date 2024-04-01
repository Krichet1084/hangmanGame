/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.homeScreen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import my.setup.*;
import my.scoreMenu.*;
import my.howTo.*;
 
/**
 *
 * @author kshar1
 */
public class homeScreen extends javax.swing.JFrame {

    /**
     * Creates new form homeScreen
     */
    Color quitBackground = new Color(35,35,35);
    
    public homeScreen() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        confirmQuit.setBackground(quitBackground);
        confirmQuit.setVisible(false);
        this.getContentPane().setBackground(Color.darkGray);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guideButton = new javax.swing.JButton();
        playButon = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        confirmQuit = new javax.swing.JDesktopPane();
        noButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        quitText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.yellow);
        setForeground(java.awt.Color.yellow);
        setResizable(false);

        guideButton.setBackground(java.awt.Color.black);
        guideButton.setForeground(java.awt.Color.white);
        guideButton.setText("Guide");
        guideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideButtonActionPerformed(evt);
            }
        });

        playButon.setBackground(java.awt.Color.black);
        playButon.setForeground(java.awt.Color.white);
        playButon.setText("Play");
        playButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButonActionPerformed(evt);
            }
        });

        quitButton.setBackground(java.awt.Color.black);
        quitButton.setForeground(java.awt.Color.white);
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        scoreButton.setBackground(java.awt.Color.black);
        scoreButton.setForeground(java.awt.Color.white);
        scoreButton.setText("High Score");
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });

        confirmQuit.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        confirmQuit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmQuit.setForeground(java.awt.Color.white);

        noButton.setBackground(java.awt.Color.black);
        noButton.setForeground(java.awt.Color.white);
        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        confirmButton.setBackground(java.awt.Color.black);
        confirmButton.setForeground(java.awt.Color.white);
        confirmButton.setText("Quit");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        quitText.setForeground(java.awt.Color.white);
        quitText.setText("Would you like to quit?");

        confirmQuit.setLayer(noButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmQuit.setLayer(confirmButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        confirmQuit.setLayer(quitText, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout confirmQuitLayout = new javax.swing.GroupLayout(confirmQuit);
        confirmQuit.setLayout(confirmQuitLayout);
        confirmQuitLayout.setHorizontalGroup(
            confirmQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmQuitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(confirmQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmQuitLayout.createSequentialGroup()
                        .addComponent(confirmButton)
                        .addGap(40, 40, 40)
                        .addComponent(noButton)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmQuitLayout.createSequentialGroup()
                        .addComponent(quitText)
                        .addGap(35, 35, 35))))
        );
        confirmQuitLayout.setVerticalGroup(
            confirmQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmQuitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quitText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(noButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playButon)
                        .addGap(42, 42, 42)
                        .addComponent(guideButton)
                        .addGap(49, 49, 49)
                        .addComponent(scoreButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmQuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButon)
                    .addComponent(guideButton)
                    .addComponent(scoreButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmQuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addContainerGap())
        );

        confirmQuit.show();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        confirmQuit.setVisible(true);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        confirmQuit.setVisible(false);
    }//GEN-LAST:event_noButtonActionPerformed

    private void playButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButonActionPerformed
        homeScreen.this.dispose();
        setup startGame = new setup();
        startGame.setVisible(true);
    }//GEN-LAST:event_playButonActionPerformed

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        scoreMenu score = new scoreMenu();
        score.setVisible(true);
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void guideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideButtonActionPerformed
        howTo guide = new howTo();
        guide.setVisible(true);
    }//GEN-LAST:event_guideButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
   
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
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JDesktopPane confirmQuit;
    private javax.swing.JButton guideButton;
    private javax.swing.JButton noButton;
    private javax.swing.JButton playButon;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel quitText;
    private javax.swing.JButton scoreButton;
    // End of variables declaration//GEN-END:variables
}
