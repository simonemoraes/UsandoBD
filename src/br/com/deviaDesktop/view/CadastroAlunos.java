
package br.com.deviaDesktop.view;

import br.com.deviaDesktop.util.Conexao;
import javax.swing.JOptionPane;

public class CadastroAlunos extends javax.swing.JFrame {
    
    private Conexao conec;

    public CadastroAlunos() {
        initComponents();
        conec = new Conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cadastro = new javax.swing.JMenu();
        jMenuItem_Aluno = new javax.swing.JMenuItem();
        jMenuItem_Cidade = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Sair = new javax.swing.JMenuItem();
        jMenu_Relatorio = new javax.swing.JMenu();
        jMenuItem_relAluno = new javax.swing.JMenuItem();
        jMenuItem_relCidade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu_Cadastro.setText("Cadastro");

        jMenuItem_Aluno.setText("Aluno");
        jMenuItem_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AlunoActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(jMenuItem_Aluno);

        jMenuItem_Cidade.setText("Cidade");
        jMenuItem_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CidadeActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(jMenuItem_Cidade);
        jMenu_Cadastro.add(jSeparator1);

        jMenuItem_Sair.setText("Sair");
        jMenuItem_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SairActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(jMenuItem_Sair);

        jMenuBar1.add(jMenu_Cadastro);

        jMenu_Relatorio.setText("Relatório");

        jMenuItem_relAluno.setText("Aluno");
        jMenu_Relatorio.add(jMenuItem_relAluno);

        jMenuItem_relCidade.setText("Cidade");
        jMenu_Relatorio.add(jMenuItem_relCidade);

        jMenuBar1.add(jMenu_Relatorio);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SairActionPerformed
         if(conec != null){
             conec.closeAll();
        }else{
            JOptionPane.showMessageDialog(null, "Problemas com a conexão com o BD!");
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_SairActionPerformed

    private void jMenuItem_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AlunoActionPerformed
        if(conec != null){
             new CadAluno( this, true, conec).setVisible( true );
        }else{
            JOptionPane.showMessageDialog(null, "Problemas com a conexão com o BD!");
        }
       
    }//GEN-LAST:event_jMenuItem_AlunoActionPerformed

    private void jMenuItem_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CidadeActionPerformed
        new CadCidade( this, true ).setVisible( true );
    }//GEN-LAST:event_jMenuItem_CidadeActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Aluno;
    private javax.swing.JMenuItem jMenuItem_Cidade;
    private javax.swing.JMenuItem jMenuItem_Sair;
    private javax.swing.JMenuItem jMenuItem_relAluno;
    private javax.swing.JMenuItem jMenuItem_relCidade;
    private javax.swing.JMenu jMenu_Cadastro;
    private javax.swing.JMenu jMenu_Relatorio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
