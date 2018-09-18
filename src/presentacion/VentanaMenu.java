/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class VentanaMenu extends javax.swing.JFrame {

    private ControladorMenu control;
    private Modelo modelo;

    public VentanaMenu(Modelo aThis) {
        modelo = aThis;
        initComponents();
        capturarEventos();

    }

    public Modelo getModelo() {
        return modelo;
    }

    public ControladorMenu getControl() {
        if (control == null) {
            control = new ControladorMenu(this);
        }
        return control;
    }

    private void capturarEventos() {
        LvlEasy.setName("Facil");
        LvlMedium.setName("Medio");
        LvlHard.setName("Dificil");
        LvlEasy.addMouseListener(getControl());
        LvlMedium.addMouseListener(getControl());
        LvlHard.addMouseListener(getControl());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LvlEasy = new javax.swing.JLabel();
        LvlMedium = new javax.swing.JLabel();
        LvlHard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BIENVENIDO A CONCENTRESE");

        jLabel1.setText("Desarrollo : Camilo Armando Rozo");

        LvlEasy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LvlEasy.setText("NIVEL FACIL (10 PAREJAS)");
        LvlEasy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LvlEasy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LvlEasyMouseClicked(evt);
            }
        });

        LvlMedium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LvlMedium.setText("NIVEL MEDIO (18 PAREJAS)");
        LvlMedium.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LvlMedium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LvlMediumMouseClicked(evt);
            }
        });

        LvlHard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LvlHard.setText("NIVEL DIFICIL (30 PAREJAS)");
        LvlHard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LvlHard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LvlHardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LvlEasy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LvlMedium, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(LvlHard, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(LvlEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LvlMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LvlHard, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LvlEasyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LvlEasyMouseClicked

    }//GEN-LAST:event_LvlEasyMouseClicked

    private void LvlMediumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LvlMediumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LvlMediumMouseClicked

    private void LvlHardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LvlHardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LvlHardMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LvlEasy;
    private javax.swing.JLabel LvlHard;
    private javax.swing.JLabel LvlMedium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
