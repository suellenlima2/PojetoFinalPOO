/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.ClienteDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.Cliente;

/**
 *
 * @author suell
 */
public class TelaExcluir extends javax.swing.JFrame {

    /**
     * Creates new form TelaExcluir
     */
    public TelaExcluir() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        txtExcluirCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DIGITE SEU CPF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(740, 180, 180, 16);

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("EXCLUIR CONTA");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(760, 270, 150, 22);

        txtExcluirCPF.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtExcluirCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtExcluirCPF);
        txtExcluirCPF.setBounds(730, 210, 220, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/login (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-70, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        String cpf = txtExcluirCPF.getText();
        
    
        ClienteDAO clienteDAO = new ClienteDAO();
        
   
        
        if((txtExcluirCPF.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio.");

        }else{
            
        JOptionPane.showMessageDialog(null, "Usuario removido.");

        }
        
        TelaInicial telainicial = new TelaInicial();
        telainicial.setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExcluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JFormattedTextField txtExcluirCPF;
    // End of variables declaration//GEN-END:variables
}
