/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class mouseevent extends javax.swing.JFrame {

    /**
     * Creates new form mouseevent
     */
    public mouseevent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textField1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textField1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textField1MouseReleased(evt);
            }
        });
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
System.out.println("Mouse clicked.");        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MouseClicked

    private void textField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseEntered
  System.out.println("Mouse entered.");        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MouseEntered

    private void textField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseExited
    System.out.println("Mouse exited.");        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MouseExited

    private void textField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MousePressed
    System.out.println("Mouse press.");        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MousePressed

    private void textField1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseReleased
    System.out.println("Mouse released.");
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MouseReleased

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
            java.util.logging.Logger.getLogger(mouseevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mouseevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mouseevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mouseevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mouseevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
