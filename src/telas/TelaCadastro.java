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
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Faça seu cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(820, 80, 200, 32);

        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 170, 35, 16);

        jLabel3.setText("TELEFONE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(820, 250, 70, 16);

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 330, 40, 16);

        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 410, 50, 16);

        jLabel6.setText("SENHA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(820, 490, 50, 16);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(820, 200, 230, 22);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(820, 440, 230, 22);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(820, 520, 230, 22);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(82) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(820, 280, 230, 22);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCPF);
        txtCPF.setBounds(820, 360, 230, 22);

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(890, 580, 100, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/login (1).jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-90, -10, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

        String nome = txtNome.getText();
        String telefone = txtTelefone.getText();
        String cpf = txtCPF.getText();
        String email = txtEmail.getText();
        String senha = txtSenha.getText();

        Cliente cliente = new Cliente(nome, cpf, senha, email, telefone);

        // fazendo a validação dos dados
        if ((txtNome.getText().isEmpty()) || (txtTelefone.getText().isEmpty()) || (txtCPF.getText().isEmpty()) || (txtEmail.getText().isEmpty()) || (txtSenha.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios.");

        } else {

            // instanciando a classe ClienteDAO do pacote dao e criando seu objeto dao
            ClienteDAO dao = new ClienteDAO();
            dao.cadastrar(cliente);
            JOptionPane.showMessageDialog(null, "Usuário " + txtNome.getText() + " inserido com sucesso! ");
        }

        // apaga os dados preenchidos nos campos de texto
        txtNome.setText("");
        txtTelefone.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtSenha.setText("");

        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
