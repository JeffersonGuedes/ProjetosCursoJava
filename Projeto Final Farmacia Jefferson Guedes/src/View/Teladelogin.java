package View;

import javax.swing.JOptionPane;
import java.sql.*;

import Dao.UsuarioDAO;
import Dto.UsuarioDTO;

public class Teladelogin extends javax.swing.JFrame {

    public void login() {

    }

    public Teladelogin() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Teladelogin.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llogin = new javax.swing.JLabel();
        tUsuario = new javax.swing.JTextField();
        lsenha = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        lusuario = new javax.swing.JLabel();
        pSenha = new javax.swing.JPasswordField();
        lteladefundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de login");
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        llogin.setBackground(new java.awt.Color(0, 255, 255));
        llogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        llogin.setForeground(new java.awt.Color(255, 255, 255));
        llogin.setText("LOGIN");
        getContentPane().add(llogin);
        llogin.setBounds(70, 200, 79, 28);

        tUsuario.setBackground(new java.awt.Color(102, 204, 255));
        tUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        tUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(tUsuario);
        tUsuario.setBounds(20, 260, 180, 25);

        lsenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lsenha.setForeground(new java.awt.Color(255, 255, 255));
        lsenha.setText("SENHA:");
        getContentPane().add(lsenha);
        lsenha.setBounds(20, 300, 51, 19);

        bEntrar.setBackground(new java.awt.Color(102, 204, 255));
        bEntrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bEntrar.setText("Entrar");
        bEntrar.setBorder(null);
        bEntrar.setBorderPainted(false);
        bEntrar.setContentAreaFilled(false);
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bEntrar);
        bEntrar.setBounds(60, 360, 91, 22);

        lusuario.setBackground(new java.awt.Color(255, 255, 255));
        lusuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lusuario.setForeground(new java.awt.Color(255, 255, 255));
        lusuario.setText("USUÁRIO:");
        getContentPane().add(lusuario);
        lusuario.setBounds(20, 240, 67, 19);

        pSenha.setBackground(new java.awt.Color(102, 204, 255));
        pSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pSenha.setForeground(new java.awt.Color(0, 0, 0));
        pSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pSenha.setToolTipText("");
        pSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        pSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        pSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pSenha);
        pSenha.setBounds(20, 320, 180, 25);

        lteladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/teladelogin.png"))); // NOI18N
        getContentPane().add(lteladefundo);
        lteladefundo.setBounds(0, 0, 628, 445);

        setSize(new java.awt.Dimension(644, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtbcontinuarnPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        try {
            String usuario = tUsuario.getText();
            String senha = pSenha.getText();

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setUsuario(usuario);
            objusuariodto.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
            if (rusuariodao.next()) {
                Controle objcontroleview = new Controle();
                objcontroleview.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha invalida!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Teladelogin: " + e.getMessage());
        }


    }//GEN-LAST:event_bEntrarActionPerformed

    private void pSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pSenhaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teladelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teladelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teladelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teladelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teladelogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JLabel llogin;
    private javax.swing.JLabel lsenha;
    private javax.swing.JLabel lteladefundo;
    private javax.swing.JLabel lusuario;
    private javax.swing.JPasswordField pSenha;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
