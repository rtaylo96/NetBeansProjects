/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab9;

/**
 *
 * @author Rachel
 */
public class EndFrame extends javax.swing.JFrame {
private StoryBookModel myModel;
    /**
     * Creates new form EndFrame
     */
    public EndFrame() {
        initComponents();
    }
    
    public EndFrame(StoryBookModel myModel){
        initComponents();
        this.myModel = myModel;
        welcomeLabel.setText("Welcome " + myModel.getUserName() + ".");
        crimeLabel.setText("You have been accused of " + myModel.getCrime().toString());
        instructionLabel.setText("Pick a door to determine your verdict");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        crimeLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        leftDoorButton = new javax.swing.JButton();
        rightDoorButton = new javax.swing.JButton();
        doorButton1 = new javax.swing.JButton();
        doorButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome");

        crimeLabel.setText("jLabel1");

        instructionLabel.setText("jLabel1");

        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1213lab9/Door.GIF"))); // NOI18N
        leftDoorButton.setBorderPainted(false);
        leftDoorButton.setContentAreaFilled(false);
        leftDoorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftDoorButtonMouseClicked(evt);
            }
        });
        leftDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftDoorButtonActionPerformed(evt);
            }
        });
        leftDoorButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftDoorButtonKeyPressed(evt);
            }
        });

        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1213lab9/Door.GIF"))); // NOI18N
        rightDoorButton.setBorderPainted(false);
        rightDoorButton.setContentAreaFilled(false);
        rightDoorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightDoorButtonMouseClicked(evt);
            }
        });
        rightDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightDoorButtonActionPerformed(evt);
            }
        });
        rightDoorButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightDoorButtonKeyPressed(evt);
            }
        });

        doorButton1.setText("Exit Tribunal");
        doorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorButton1ActionPerformed(evt);
            }
        });

        doorButton2.setText("Next Trial -->");
        doorButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(welcomeLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(leftDoorButton)
                                    .addComponent(doorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rightDoorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instructionLabel)
                                    .addComponent(crimeLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crimeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rightDoorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doorButton2)
                            .addComponent(doorButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftDoorButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftDoorButtonActionPerformed
        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1213lab9/Tiger.GIF")));
        instructionLabel.setText("You are GUILTY! Prepare to be eaten!");
    }//GEN-LAST:event_leftDoorButtonActionPerformed

    private void rightDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightDoorButtonActionPerformed
        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1213lab9/Lady.GIF")));
        instructionLabel.setText("You are INNOCENT! Sorry about that. Please accept this lady."); 
    }//GEN-LAST:event_rightDoorButtonActionPerformed

    private void leftDoorButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftDoorButtonKeyPressed
        rightDoorButton.setEnabled(false);
    }//GEN-LAST:event_leftDoorButtonKeyPressed

    private void rightDoorButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightDoorButtonKeyPressed
        leftDoorButton.setEnabled(false);
    }//GEN-LAST:event_rightDoorButtonKeyPressed

    private void leftDoorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftDoorButtonMouseClicked
        rightDoorButton.setEnabled(false);
    }//GEN-LAST:event_leftDoorButtonMouseClicked

    private void rightDoorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightDoorButtonMouseClicked
        leftDoorButton.setEnabled(false);
    }//GEN-LAST:event_rightDoorButtonMouseClicked

    private void doorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_doorButton1ActionPerformed

    private void doorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doorButton2ActionPerformed
        StartFrame x = new StartFrame(myModel);
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doorButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EndFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crimeLabel;
    private javax.swing.JButton doorButton1;
    private javax.swing.JButton doorButton2;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JButton leftDoorButton;
    private javax.swing.JButton rightDoorButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
