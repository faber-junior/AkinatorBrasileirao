package com.mycompany.akinator;

import java.util.ArrayList;

public class TelaPerguntas extends javax.swing.JFrame {

    public Akinator main = new Akinator();           
    char op = ' ';    
    int num_perg = 0;
    
    public TelaPerguntas() {
        initComponents();
        perguntar(main.getPerguntas(), main.getTimesPossiveis());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AKINATOR BRASILEIRÃO");
        jLabel1.setToolTipText("");

        jButton1.setText("PRÓXIMA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jRadioButton1PropertyChange(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/akinator1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jRadioButton1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char op = ' ';
        
        if (jRadioButton1.isSelected())
        {
            op = 'a';
        }
        else if(jRadioButton2.isSelected())
        {
            op = 'b';
        }
        else if(jRadioButton3.isSelected())
        {
            op = 'c';
        }
        else if(jRadioButton4.isSelected())
        {
            op = 'd';
        }
        else if(jRadioButton5.isSelected())
        {
            op = 'e';
        }
        
        main.atualizaTimesPossiveis(main.getTimesPossiveis(), num_perg, op);
        if (num_perg >= 14)
        {
            this.dispose();
            main.criaTelaResp(main.getTelaResposta(), main);
        }
        else
        {
            num_perg++;
            if (main.getTimesPossiveis().size() == 0)
            {
                this.dispose();
                main.criaTelaResp(main.getTelaResposta(), main);
            }
            else
            {
                perguntar(main.getPerguntas(), main.getTimesPossiveis());
            }            
        }
        
        for (Time t : main.getTimesPossiveis())
        {
            System.out.println(t.getNome());
        }
        
        System.out.println("");          
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntas().setVisible(true);
            }
        });        
    }
    
    public void perguntar(ArrayList<Pergunta> perguntas, ArrayList<Time> times_possiveis)
    {   
        if (this.num_perg <= 14)
        {
            int alt = 1;
            Pergunta p = perguntas.get(this.num_perg);
            jLabel3.setText(p.getPergunta());
            for (Alternativa a : p.getAlternativa())
            {
                switch(alt)
                {
                    case 1:
                        jRadioButton1.setText(a.getTexto());
                        break;
                    case 2:
                        jRadioButton2.setText(a.getTexto());
                        break;
                    case 3:
                        jRadioButton3.setText(a.getTexto());
                        break;
                    case 4:
                        jRadioButton4.setText(a.getTexto());
                        break;
                    case 5:
                        jRadioButton5.setText(a.getTexto());
                        break;
                    default:
                        break;
                }
                alt++;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    // End of variables declaration//GEN-END:variables
}
