
package br.com.deviaDesktop.view;

public class CadCidade extends javax.swing.JDialog {

    public CadCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_código = new javax.swing.JLabel();
        jl_Cidade = new javax.swing.JLabel();
        jl_Estado = new javax.swing.JLabel();
        jt_Codigo = new javax.swing.JTextField();
        jt_Cidade = new javax.swing.JTextField();
        jt_Sobrenome = new javax.swing.JTextField();
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

        jl_Cidade.setText("Cidade:");

        jl_Estado.setText("Estado:");

        jb_Primeiro.setText("<<");
        jb_Primeiro.setPreferredSize(new java.awt.Dimension(309, 265));

        jb_Anterior.setText("<");

        jb_Proximo.setText(">");

        jb_Ultimo.setText(">>");

        jb_Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/add.jpg"))); // NOI18N

        jb_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/save.png"))); // NOI18N

        jb_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/erase.jpg"))); // NOI18N

        jb_Pesquizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br.com.deviaDesktop.resourse/pesq.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_código)
                    .addComponent(jl_Cidade)
                    .addComponent(jl_Estado))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_Ultimo))
                            .addComponent(jt_Sobrenome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_Cidade)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_Pesquizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_Novo)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Anterior)
                                .addGap(45, 45, 45)
                                .addComponent(jb_Proximo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_Excluir)
                                .addContainerGap())))))
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
                    .addComponent(jl_Cidade)
                    .addComponent(jt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Estado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Ultimo)
                    .addComponent(jb_Proximo)
                    .addComponent(jb_Primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Anterior))
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

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Anterior;
    private javax.swing.JButton jb_Excluir;
    private javax.swing.JButton jb_Novo;
    private javax.swing.JButton jb_Pesquizar;
    private javax.swing.JButton jb_Primeiro;
    private javax.swing.JButton jb_Proximo;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JButton jb_Ultimo;
    private javax.swing.JLabel jl_Cidade;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_código;
    private javax.swing.JTextField jt_Cidade;
    private javax.swing.JTextField jt_Codigo;
    private javax.swing.JTextField jt_Sobrenome;
    // End of variables declaration//GEN-END:variables
}
