/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author Mariana
 */
public class FormPrincipalAvaliador extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();

    /**
     * Creates new form FormPrincipalAvaliador
     *
     * @param usuario
     */
    public FormPrincipalAvaliador(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    public FormPrincipalAvaliador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadPessoa = new javax.swing.JButton();
        jButtonCadEvento = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuferramenta = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alteração de dados");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(0, 100, 120, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Avaliação");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 14);

        jButtonCadPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/network.png"))); // NOI18N
        jButtonCadPessoa.setToolTipText("Alteração de dados");
        jButtonCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPessoaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPessoa);
        jButtonCadPessoa.setBounds(0, 120, 70, 70);

        jButtonCadEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planning.png"))); // NOI18N
        jButtonCadEvento.setToolTipText("Cadastro de Avaliações");
        jButtonCadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEventoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadEvento);
        jButtonCadEvento.setBounds(0, 20, 70, 70);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plano.jpg"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 620, 270);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 28, 620, 270);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de ");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 22);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/error.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar tela");
        jButtonFecharBemVindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFecharBemVindoMouseClicked(evt);
            }
        });
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(590, 0, 20, 20);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(180, 100, 630, 330);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 480, 310, 14);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 480, 50, 14);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodeFundoPricipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 870, 540);

        jMenuferramenta.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuferramenta.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuferramenta);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(891, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPessoaActionPerformed
        // TODO add your handling code here
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Avaliador")) {
                FormAlteraDadosPessoa telaPessoas = new FormAlteraDadosPessoa(jLabelUsuario.getText());
                telaPessoas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }

    }//GEN-LAST:event_jButtonCadPessoaActionPerformed

    private void jButtonCadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEventoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Avaliador")) {
                FormAvaliacao telaAvalicao = new FormAvaliacao(jLabelUsuario.getText());
                telaAvalicao.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jButtonCadEventoActionPerformed

    private void jButtonFecharBemVindoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoMouseClicked
        // TODO add your handling code here:
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoMouseClicked

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipalAvaliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipalAvaliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipalAvaliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipalAvaliador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipalAvaliador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadEvento;
    private javax.swing.JButton jButtonCadPessoa;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuferramenta;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}