/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.CadastroFornecedorDAO;
import Dao.CadastroProdutosDAO;
import Dto.CadastroFornecedorDTO;
import Dto.CadastroProdutosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manenhos
 */
public class CadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFornecedor
     */
    public CadastroFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(CadastroProdutos.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulocadastrodefornecedores = new javax.swing.JLabel();
        btProdutosf = new javax.swing.JButton();
        btFornecedoresf = new javax.swing.JButton();
        btLojasf = new javax.swing.JButton();
        lCondigodofornecedor = new javax.swing.JLabel();
        txtCodigodofornecedor = new javax.swing.JTextField();
        lEmpresa = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        lTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lTotalcompado = new javax.swing.JLabel();
        txtTotalcomprado = new javax.swing.JTextField();
        btExcluirp = new javax.swing.JButton();
        btConsultarp = new javax.swing.JButton();
        btAlterarp = new javax.swing.JButton();
        btSalvarp = new javax.swing.JButton();
        btInicial = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(630, 460));
        setMinimumSize(new java.awt.Dimension(650, 460));
        setPreferredSize(new java.awt.Dimension(630, 460));
        setSize(new java.awt.Dimension(630, 460));
        getContentPane().setLayout(null);

        lTitulocadastrodefornecedores.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lTitulocadastrodefornecedores.setForeground(new java.awt.Color(0, 0, 0));
        lTitulocadastrodefornecedores.setText("CADASTRO DE FORNECEDORES");
        getContentPane().add(lTitulocadastrodefornecedores);
        lTitulocadastrodefornecedores.setBounds(125, 12, 376, 28);

        btProdutosf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btProdutosf.setText("Produtos");
        btProdutosf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosfActionPerformed(evt);
            }
        });
        getContentPane().add(btProdutosf);
        btProdutosf.setBounds(125, 52, 110, 24);

        btFornecedoresf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btFornecedoresf.setText("Fornecedores");
        btFornecedoresf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedoresfActionPerformed(evt);
            }
        });
        getContentPane().add(btFornecedoresf);
        btFornecedoresf.setBounds(253, 52, 110, 24);

        btLojasf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btLojasf.setText("Lojas");
        btLojasf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLojasfActionPerformed(evt);
            }
        });
        getContentPane().add(btLojasf);
        btLojasf.setBounds(381, 52, 110, 24);

        lCondigodofornecedor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lCondigodofornecedor.setText("Código do fornecedor:");
        getContentPane().add(lCondigodofornecedor);
        lCondigodofornecedor.setBounds(320, 145, 130, 14);
        getContentPane().add(txtCodigodofornecedor);
        txtCodigodofornecedor.setBounds(320, 165, 189, 25);

        lEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lEmpresa.setText("Empresa:");
        getContentPane().add(lEmpresa);
        lEmpresa.setBounds(72, 94, 45, 14);
        getContentPane().add(txtEmpresa);
        txtEmpresa.setBounds(72, 114, 437, 25);

        lTelefone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lTelefone.setText("Telefone:");
        getContentPane().add(lTelefone);
        lTelefone.setBounds(72, 145, 45, 14);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(72, 165, 200, 25);

        lEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lEmail.setText("E-mail:");
        getContentPane().add(lEmail);
        lEmail.setBounds(72, 196, 34, 14);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(72, 216, 300, 25);

        lEndereco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lEndereco.setText("Endereço:");
        getContentPane().add(lEndereco);
        lEndereco.setBounds(72, 247, 47, 14);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(72, 267, 420, 25);

        lTotalcompado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lTotalcompado.setText("Total Comprado:");
        getContentPane().add(lTotalcompado);
        lTotalcompado.setBounds(72, 298, 83, 14);
        getContentPane().add(txtTotalcomprado);
        txtTotalcomprado.setBounds(72, 318, 200, 25);

        btExcluirp.setBackground(new java.awt.Color(121, 218, 247));
        btExcluirp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btExcluirp.setBorder(null);
        btExcluirp.setContentAreaFilled(false);
        btExcluirp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirpActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluirp);
        btExcluirp.setBounds(390, 380, 25, 24);

        btConsultarp.setBackground(new java.awt.Color(121, 218, 247));
        btConsultarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consultar.png"))); // NOI18N
        btConsultarp.setBorder(null);
        btConsultarp.setContentAreaFilled(false);
        btConsultarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarpActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultarp);
        btConsultarp.setBounds(290, 380, 25, 25);

        btAlterarp.setBackground(new java.awt.Color(121, 218, 247));
        btAlterarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.png"))); // NOI18N
        btAlterarp.setBorder(null);
        btAlterarp.setContentAreaFilled(false);
        btAlterarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarpActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterarp);
        btAlterarp.setBounds(200, 380, 24, 25);

        btSalvarp.setBackground(new java.awt.Color(121, 218, 247));
        btSalvarp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar_1.png"))); // NOI18N
        btSalvarp.setBorder(null);
        btSalvarp.setContentAreaFilled(false);
        btSalvarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarpActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarp);
        btSalvarp.setBounds(120, 380, 24, 25);

        btInicial.setBackground(new java.awt.Color(121, 218, 247));
        btInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/casa.png"))); // NOI18N
        btInicial.setBorder(null);
        btInicial.setContentAreaFilled(false);
        btInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicialActionPerformed(evt);
            }
        });
        getContentPane().add(btInicial);
        btInicial.setBounds(537, 12, 50, 50);

        btSelecionar.setText("Selecionar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(btSelecionar);
        btSelecionar.setBounds(460, 350, 90, 25);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(460, 380, 90, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundinho_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -5, 630, 450);

        tabelaFornecedor.setAutoCreateRowSorter(true);
        tabelaFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código Fornecedor", "Empresa", "Telefone", "E-mail", "Endereço", "Total Comprado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaFornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 440, 630, 260);

        setBounds(0, 0, 643, 735);
    }// </editor-fold>//GEN-END:initComponents

    private void btProdutosfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosfActionPerformed
        this.dispose();//fecha o form atual aberto
        CadastroProdutos cdp = new CadastroProdutos();
        cdp.setVisible(true);
    }//GEN-LAST:event_btProdutosfActionPerformed

    private void btLojasfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLojasfActionPerformed
        this.dispose();//fecha o form atual aberto
        CadastroLoja cl = new CadastroLoja();
        cl.setVisible(true);
    }//GEN-LAST:event_btLojasfActionPerformed

    private void btFornecedoresfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedoresfActionPerformed
        JOptionPane.showMessageDialog(null, "Você já está no cadastro fornecedores");
    }//GEN-LAST:event_btFornecedoresfActionPerformed

    private void btInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicialActionPerformed
        this.dispose();//fecha o form atual aberto
        Controle c = new Controle();
        c.setVisible(true);
    }//GEN-LAST:event_btInicialActionPerformed

    private void btSalvarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarpActionPerformed
        String empresa, telefone, email, endereco;
        int codigofornecedor;
        double totalcomprado;

        empresa = txtEmpresa.getText();
        telefone = txtTelefone.getText();
        email = txtEmail.getText();
        endereco = txtEndereco.getText();
        codigofornecedor = Integer.parseInt(txtCodigodofornecedor.getText());
        totalcomprado = Double.parseDouble(txtTotalcomprado.getText());

        CadastroFornecedorDTO objcadastrofornecedordto = new CadastroFornecedorDTO();
        objcadastrofornecedordto.setEmpresa(empresa);
        objcadastrofornecedordto.setTelefone(telefone);
        objcadastrofornecedordto.setEmail(email);
        objcadastrofornecedordto.setEndereco(endereco);
        objcadastrofornecedordto.setCodigoFornecedor(codigofornecedor);
        objcadastrofornecedordto.setTotalComprado(totalcomprado);

        if (codigofornecedor == 0) {
            JOptionPane.showMessageDialog(null, "Preenchimento do Código do Fornecedor obrigatório!");
        }
        if (empresa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchimento do Empresa obrigatório!");
        }
        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchimento do Telefone obrigatório!");
        }
        if (endereco.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchimento do Endereço obrigatório!");
        }
        if (totalcomprado == 0) {
            JOptionPane.showMessageDialog(null, "Preenchimento do Total Comprado obrigatório!");
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preenchimento do E-mail obrigatório!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }

        CadastroFornecedorDAO objfornecedordao = new CadastroFornecedorDAO();
        objfornecedordao.cadastroFornecedordao(objcadastrofornecedordto);

    }//GEN-LAST:event_btSalvarpActionPerformed

    private void tabelaFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaFornecedorAncestorAdded

    }//GEN-LAST:event_tabelaFornecedorAncestorAdded

    private void btConsultarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarpActionPerformed
        listarValoresFornecedor();
    }//GEN-LAST:event_btConsultarpActionPerformed

    private void btAlterarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarpActionPerformed
        AlterarCadastroFornecedor();
        listarValoresFornecedor();
        LimparCampos();
    }//GEN-LAST:event_btAlterarpActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btExcluirpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirpActionPerformed
        ExcluirCadastroFornecedor();
        listarValoresFornecedor();
        LimparCampos();
    }//GEN-LAST:event_btExcluirpActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        LimparCampos();
       
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarp;
    private javax.swing.JButton btConsultarp;
    private javax.swing.JButton btExcluirp;
    private javax.swing.JButton btFornecedoresf;
    private javax.swing.JButton btInicial;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLojasf;
    private javax.swing.JButton btProdutosf;
    private javax.swing.JButton btSalvarp;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCondigodofornecedor;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lEmpresa;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JLabel lTitulocadastrodefornecedores;
    private javax.swing.JLabel lTotalcompado;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtCodigodofornecedor;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotalcomprado;
    // End of variables declaration//GEN-END:variables

    private void listarValoresFornecedor() {
        try {
            CadastroFornecedorDAO objCadastrofornecedorDAO = new CadastroFornecedorDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaFornecedor.getModel();
            model.setNumRows(0);

            ArrayList<CadastroFornecedorDTO> lista = objCadastrofornecedorDAO.pesquisarCadastroFornecedor();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    
                    lista.get(num).getEmpresa(),
                    lista.get(num).getCodigoFornecedor(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEmail(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getTotalComprado()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Valores tela Fornecedor" + e.getMessage());
        }
    }

    private void AlterarCadastroFornecedor(){
        String empresa, telefone, email, endereco;
        int codigofornecedor;
        double totalcomprado;
        
        
        empresa = txtEmpresa.getText();
        telefone = txtTelefone.getText();
        codigofornecedor = Integer.parseInt(txtCodigodofornecedor.getText());
        email = txtEmail.getText();
        endereco = txtEndereco.getText();
        totalcomprado = Double.parseDouble(txtTotalcomprado.getText());

        CadastroFornecedorDTO objcadastrofornecedordto = new CadastroFornecedorDTO();
        objcadastrofornecedordto.setEmpresa(empresa);
        objcadastrofornecedordto.setTelefone(telefone);
        objcadastrofornecedordto.setCodigoFornecedor(codigofornecedor);
        objcadastrofornecedordto.setEmail(email);
        objcadastrofornecedordto.setEndereco(endereco);
        objcadastrofornecedordto.setTotalComprado(totalcomprado);
        
        CadastroFornecedorDAO objfornecedordao = new CadastroFornecedorDAO();
        objfornecedordao.alterarCadastroFornecedor(objcadastrofornecedordto);
    }
    
     private void ExcluirCadastroFornecedor(){
        String empresa, telefone, email, endereco;
        int codigofornecedor;
        double totalcomprado;

        empresa = txtEmpresa.getText();
        telefone = txtTelefone.getText();
        codigofornecedor = Integer.parseInt(txtCodigodofornecedor.getText());
        email = txtEmail.getText();
        endereco = txtEndereco.getText();
        totalcomprado = Double.parseDouble(txtTotalcomprado.getText());

        CadastroFornecedorDTO objcadastrofornecedordto = new CadastroFornecedorDTO();
        objcadastrofornecedordto.setEmpresa(empresa);
        objcadastrofornecedordto.setTelefone(telefone);
        objcadastrofornecedordto.setCodigoFornecedor(codigofornecedor);
        objcadastrofornecedordto.setEmail(email);
        objcadastrofornecedordto.setEndereco(endereco);
        objcadastrofornecedordto.setTotalComprado(totalcomprado);
        
        CadastroFornecedorDAO objfornecedordao = new CadastroFornecedorDAO();
        objfornecedordao.excluirCadastroFornecedor(objcadastrofornecedordto);
    }
     
    private void CarregarCampos(){
        int setar = tabelaFornecedor.getSelectedRow();
        txtCodigodofornecedor.setText(tabelaFornecedor.getModel().getValueAt(setar,1).toString());
        txtEmpresa.setText(tabelaFornecedor.getModel().getValueAt(setar, 0).toString());
        txtTelefone.setText(tabelaFornecedor.getModel().getValueAt(setar, 2).toString());
        txtEmail.setText(tabelaFornecedor.getModel().getValueAt(setar, 3).toString());
        txtEndereco.setText(tabelaFornecedor.getModel().getValueAt(setar, 4).toString());
        txtTotalcomprado.setText(tabelaFornecedor.getModel().getValueAt(setar, 5).toString());
    }
    private void LimparCampos(){
        txtCodigodofornecedor.setText("");
        txtEmpresa.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtTotalcomprado.setText("");
        
    }
}
