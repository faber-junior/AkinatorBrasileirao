package com.mycompany.akinator;

import javax.swing.ImageIcon;

public class TelaResposta extends javax.swing.JFrame {
    Akinator main;
    ImageIcon time;
    ImageIcon akinator;
    public TelaResposta() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AKINATOR BRASILEIRÃO");
        jLabel1.setToolTipText("");

        jButton1.setText("FECHAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REINICIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("O TIME ESCOLHIDO FOI:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        main.criaTelaPric(main.getTelaPrincipal());        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResposta().setVisible(true);                
            }
        });
    }
    
    public void setMain(Akinator main)
    {
        this.main = main;
    }
    
    public void criaResposta()
    {
        if(main.getTimesPossiveis().size() != 1)
        {
            jLabel5.setText("");
            jLabel3.setText("NÃO CONSEGUI DESCOBRIR");
            this.akinator = new ImageIcon(getClass().getResource("/akinator3.png"));
            jLabel4.setIcon(akinator);
            this.time = new ImageIcon(getClass().getResource("/Akinatordefrenter.jpg"));
            jLabel6.setIcon(this.time);
        }
        else
        {
            jLabel5.setText("O TIME ESCOLHIDO FOI:");
            jLabel3.setText(main.getTimesPossiveis().get(0).getNome());
            String time = main.getTimesPossiveis().get(0).getNome();
            this.akinator = new ImageIcon(getClass().getResource("/akinator2.png"));
            jLabel4.setIcon(akinator);
            switch (time)
            {
                case "Botafogo":
                    this.time = new ImageIcon(getClass().getResource("/botafogo.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Bragantino":
                    this.time = new ImageIcon(getClass().getResource("/bragantino.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Grêmio":
                    this.time = new ImageIcon(getClass().getResource("/gremio.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Palmeiras":
                    this.time = new ImageIcon(getClass().getResource("/palmeiras.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Flamengo":
                    this.time = new ImageIcon(getClass().getResource("/flamengo.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Fortaleza":
                    this.time = new ImageIcon(getClass().getResource("/fortaleza.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Fluminense":
                    this.time = new ImageIcon(getClass().getResource("/fluminense.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Athletico-PR":
                    this.time = new ImageIcon(getClass().getResource("/athletico.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Atlético-MG":
                    this.time = new ImageIcon(getClass().getResource("/atletico.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "São Paulo":
                    this.time = new ImageIcon(getClass().getResource("/saopaulo.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Cuiabá":
                    this.time = new ImageIcon(getClass().getResource("/cuiaba.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Internacional":
                    this.time = new ImageIcon(getClass().getResource("/internacional.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Corinthians":
                    this.time = new ImageIcon(getClass().getResource("/corinthians.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Santos":
                    this.time = new ImageIcon(getClass().getResource("/santos.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Cruzeiro":
                    this.time = new ImageIcon(getClass().getResource("/cruzeiro.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Bahia":
                    this.time = new ImageIcon(getClass().getResource("/bahia.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Vasco da Gama":
                    this.time = new ImageIcon(getClass().getResource("/vasco.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Goiás":
                    this.time = new ImageIcon(getClass().getResource("/goias.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "Coritiba":
                    this.time = new ImageIcon(getClass().getResource("/coritiba.png"));
                    jLabel6.setIcon(this.time);
                    break;
                case "América-MG":
                    this.time = new ImageIcon(getClass().getResource("/america.png"));
                    jLabel6.setIcon(this.time);
                    break;
                default:
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
