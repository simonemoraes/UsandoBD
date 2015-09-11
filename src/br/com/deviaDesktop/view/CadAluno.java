package br.com.deviaDesktop.view;

import br.com.deviaDesketop.dao.AlunoDao;
import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.services.Servicos;
import br.com.deviaDesktop.util.Conexao;
import java.util.List;
import javax.swing.JOptionPane;

public class CadAluno extends javax.swing.JDialog {

    Aluno aluno;
    AlunoDao alunoDao;
    Servicos servicos;
    Conexao conect;
    List<Aluno> listaAlunosRetornada = null;
    int ultimaPosicao = 0;

    public CadAluno(java.awt.Frame parent, boolean modal, Conexao cnt) {
        super(parent, modal);
        initComponents();
        //iniciarBD();
        this.conect = cnt;
        aluno = new Aluno();
        Aluno alunoRetornado = new Aluno();
        alunoDao = new AlunoDao();
        servicos = new Servicos();
        preencheListadeAlunos(cnt);
        preecherPrimeiroAluno();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_código = new javax.swing.JLabel();
        jl_Nome = new javax.swing.JLabel();
        jl_Sobrenome = new javax.swing.JLabel();
        jl_CodCidade = new javax.swing.JLabel();
        jt_Codigo = new javax.swing.JTextField();
        jt_Nome = new javax.swing.JTextField();
        jt_Sobrenome = new javax.swing.JTextField();
        jt_CodCidoade = new javax.swing.JTextField();
        jb_Primeiro = new javax.swing.JButton();
        jb_Anterior = new javax.swing.JButton();
        jb_Proximo = new javax.swing.JButton();
        jb_Ultimo = new javax.swing.JButton();
        jb_Novo = new javax.swing.JButton();
        jb_Salvar = new javax.swing.JButton();
        jb_Excluir = new javax.swing.JButton();
        jb_Pesquizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_código.setText("Código:");

        jl_Nome.setText("Nome:");

        jl_Sobrenome.setText("Sobrenome:");

        jl_CodCidade.setText("Cod. Cidade:");

        jb_Primeiro.setText("<<");
        jb_Primeiro.setPreferredSize(new java.awt.Dimension(309, 265));
        jb_Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PrimeiroActionPerformed(evt);
            }
        });

        jb_Anterior.setText("<");
        jb_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AnteriorActionPerformed(evt);
            }
        });

        jb_Proximo.setText(">");
        jb_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ProximoActionPerformed(evt);
            }
        });

        jb_Ultimo.setText(">>");
        jb_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_UltimoActionPerformed(evt);
            }
        });

        jb_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/add.jpg"))); // NOI18N
        jb_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_NovoActionPerformed(evt);
            }
        });

        jb_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/save.png"))); // NOI18N
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });

        jb_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/erase.jpg"))); // NOI18N
        jb_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ExcluirActionPerformed(evt);
            }
        });

        jb_Pesquizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/pesq.png"))); // NOI18N
        jb_Pesquizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PesquizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_código)
                            .addComponent(jl_Nome)
                            .addComponent(jl_Sobrenome)
                            .addComponent(jl_CodCidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Novo)
                                .addGap(51, 51, 51)
                                .addComponent(jb_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_Excluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_Ultimo))
                            .addComponent(jt_Sobrenome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_Nome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_Pesquizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jt_CodCidoade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jb_Anterior)
                        .addGap(46, 46, 46)
                        .addComponent(jb_Proximo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Pesquizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_código))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nome)
                    .addComponent(jt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Sobrenome))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CodCidade)
                    .addComponent(jt_CodCidoade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_Primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_Ultimo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_Anterior)
                        .addComponent(jb_Proximo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_Salvar)
                    .addComponent(jb_Novo)
                    .addComponent(jb_Excluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NovoActionPerformed
        jt_Codigo.setText("0");
        jt_Nome.setText("");
        jt_Sobrenome.setText("");
        jt_CodCidoade.setText("");
        jt_Nome.requestFocus();
        jt_Codigo.setEditable(false);

    }//GEN-LAST:event_jb_NovoActionPerformed

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed

        Aluno novoAluno = new Aluno();
        
        novoAluno.setIdAluno(Integer.parseInt(jt_Codigo.getText()));
        novoAluno.setNome(jt_Nome.getText());
        novoAluno.setSobreNome(jt_Sobrenome.getText());
        novoAluno.setCidade(Integer.parseInt(jt_CodCidoade.getText()));
        
        Servicos alunoSRV = new Servicos();
        alunoSRV.salvarAluno(novoAluno, conect);
        preencheListadeAlunos(conect);
        preecherPrimeiroAluno();

    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jb_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ExcluirActionPerformed

        int retorno = servicos.deletar(Integer.parseInt(jt_Codigo.getText()), conect, alunoDao);

        if (retorno != 0) {
            JOptionPane.showMessageDialog(null, " Deleção concluida com sucesso!");
            preecherPrimeiroAluno();
        } else {
            JOptionPane.showMessageDialog(null, " A operação não foi concluida!");
        }
    }//GEN-LAST:event_jb_ExcluirActionPerformed

    private void jb_PesquizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PesquizarActionPerformed

        jt_Codigo.setText("");
        jt_Nome.setText("");
        jt_Sobrenome.setText("");
        jt_CodCidoade.setText("");
        jt_Codigo.requestFocus();
        jt_Nome.setEditable(false);
        jt_Sobrenome.setEditable(false);
        jt_CodCidoade.setEditable(false);

        new PesquisarRegistro(null, rootPaneCheckingEnabled).setVisible(true);

        // JOptionPane.showMessageDialog( null, "Entre com o Id a ser pesquisado." );

        /*
         Aluno alunoRetornado = new Aluno();
        
         alunoRetornado = servicos.retornaAlunoPorId(Integer.parseInt(jt_Codigo.getText()));

         if ( alunoRetornado != null) {

         jt_Codigo.setText(String.valueOf(alunoRetornado.getIdAluno()));
         jt_Nome.setText(alunoRetornado.getNome());
         jt_Sobrenome.setText(alunoRetornado.getSobreNome());
         jt_CodCidoade.setText(String.valueOf(alunoRetornado.getCidade()));
         } else {
         JOptionPane.showMessageDialog( null, "Não houve retorno do banco" );
         }
         */


    }//GEN-LAST:event_jb_PesquizarActionPerformed

    private void jb_PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PrimeiroActionPerformed
        preecherPrimeiroAluno();

    }//GEN-LAST:event_jb_PrimeiroActionPerformed

    private void jb_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AnteriorActionPerformed
        retornarAluno();

    }//GEN-LAST:event_jb_AnteriorActionPerformed

    private void jb_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ProximoActionPerformed
        avancarAluno();
    }//GEN-LAST:event_jb_ProximoActionPerformed

    private void jb_UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_UltimoActionPerformed
        preecherUltimoAluno();

    }//GEN-LAST:event_jb_UltimoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Anterior;
    private javax.swing.JButton jb_Excluir;
    private javax.swing.JButton jb_Novo;
    private javax.swing.JButton jb_Pesquizar;
    private javax.swing.JButton jb_Primeiro;
    private javax.swing.JButton jb_Proximo;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JButton jb_Ultimo;
    private javax.swing.JLabel jl_CodCidade;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JLabel jl_Sobrenome;
    private javax.swing.JLabel jl_código;
    private javax.swing.JTextField jt_CodCidoade;
    private javax.swing.JTextField jt_Codigo;
    private javax.swing.JTextField jt_Nome;
    private javax.swing.JTextField jt_Sobrenome;
    // End of variables declaration//GEN-END:variables

    private void iniciarBD() {
        new Conexao();
    }

    private void preecherPrimeiroAluno() {
        ultimaPosicao = 0;
        preencherCampos();
    }

    private void preecherUltimoAluno() {

        ultimaPosicao = listaAlunosRetornada.size() - 1;
        preencherCampos();
    }

    private void avancarAluno() {



        if (ultimaPosicao < listaAlunosRetornada.size() - 1) {
            ultimaPosicao = ultimaPosicao + 1;
            preencherCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Ultimo registro!");
        }

    }

    private void retornarAluno() {
        if (ultimaPosicao > 0) {
            ultimaPosicao = ultimaPosicao - 1;
            preencherCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Primeiro registro!");
        }
    }

    private void preencherCampos() {
        Aluno alunoRetornado;
        alunoRetornado = listaAlunosRetornada.get(ultimaPosicao);
        jt_Codigo.setText(String.valueOf(alunoRetornado.getIdAluno()));
        jt_Nome.setText(alunoRetornado.getNome());
        jt_Sobrenome.setText(alunoRetornado.getSobreNome());
        jt_CodCidoade.setText(String.valueOf(alunoRetornado.getCidade()));
    }

    private void preencheListadeAlunos(Conexao cnt) {
        listaAlunosRetornada = servicos.selecionaTodosAlunos(cnt);
    }
}
