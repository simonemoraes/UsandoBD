package br.com.deviaDesktop.view;

import br.com.deviaDesketop.dao.AlunoDao;
import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.services.Servicos;

public class PesquisarRegistro extends javax.swing.JDialog {

    Aluno aluno;
    Servicos servicos;

    public PesquisarRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        aluno = new Aluno();
        servicos = new Servicos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_IdAluno = new javax.swing.JLabel();
        jt_idAluno = new javax.swing.JTextField();
        jb_Pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_IdAluno.setText("Id:");

        jt_idAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idAlunoActionPerformed(evt);
            }
        });

        jb_Pesquisar.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_IdAluno)
                .addGap(18, 18, 18)
                .addComponent(jt_idAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Pesquisar)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdAluno)
                    .addComponent(jt_idAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Pesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(445, 84));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_idAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idAlunoActionPerformed

        aluno.setIdAluno( Integer.parseInt(jt_idAluno.getText() ) );
        
        
    }//GEN-LAST:event_jt_idAlunoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Pesquisar;
    private javax.swing.JLabel jl_IdAluno;
    private javax.swing.JTextField jt_idAluno;
    // End of variables declaration//GEN-END:variables
}
