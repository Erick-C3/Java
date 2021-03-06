/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JuegoApp;


/*
    Juego: Piedra papel o tijera
        
        
 */
public class PanelPrincipal extends javax.swing.JFrame {

    private static final boolean QUE_NO_SE_VEA = false;
    private static final boolean QUIERO_QUE_SE_VEA = true;
    
    private static final int DETECTO_JUGADA_PIEDRA = 1;
    private static final int DETECTO_JUGADA_PAPEL = 2;
    private static final int DETECTO_JUGADA_TIJERA = 3;
    
    private static final int EMPATE = 0;
    private static final int GANO_JUGADOR_UNO = 1;
    private static final int GANO_JUGADOR_DOS = 2;
    
    

    private Usuario jugador;
    private Bot bob;
    private Juego piedraPapelTijera;
    
    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();

        ocultarJugadasBot();
        jugador = new Usuario();
        bob = new Bot();
        piedraPapelTijera = new Juego();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonPiedra = new javax.swing.JButton();
        BotonPapel = new javax.swing.JButton();
        BotonTijera = new javax.swing.JButton();
        jLabelImagenPiedraBot = new javax.swing.JLabel();
        jLabelImagenPapelBot = new javax.swing.JLabel();
        jLabelImagenTijeraBot = new javax.swing.JLabel();
        jLabelTextoGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BotonPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/piedra.png"))); // NOI18N
        BotonPiedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPiedraMouseClicked(evt);
            }
        });

        BotonPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/papel.png"))); // NOI18N
        BotonPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPapelMouseClicked(evt);
            }
        });

        BotonTijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/tijera.png"))); // NOI18N
        BotonTijera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonTijeraMouseClicked(evt);
            }
        });

        jLabelImagenPiedraBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/piedraBot.png"))); // NOI18N

        jLabelImagenPapelBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/papelBot.png"))); // NOI18N

        jLabelImagenTijeraBot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuegoApp/tijeraBot.png"))); // NOI18N

        jLabelTextoGanador.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabelTextoGanador.setText("Gano tal jugador!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabelImagenPiedraBot, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(jLabelImagenPapelBot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagenTijeraBot)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(BotonPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(BotonTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTextoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImagenPiedraBot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImagenPapelBot)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabelImagenTijeraBot, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabelTextoGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Detectar que el boton de piedra fue clickeado
     *
     * @param evt
     */
    private void BotonPiedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPiedraMouseClicked
        jugador.eligioPiedra();
        
        ocultarJugadasBot();
        
        mostrarJugadaAleatoria();
        mostrarGanador();
    }//GEN-LAST:event_BotonPiedraMouseClicked

    /**
     * Detectar que el boton papel fue clickeado
     *
     * @param evt
     */
    private void BotonPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPapelMouseClicked
        jugador.eligioPapel();
        
        ocultarJugadasBot();
        
        mostrarJugadaAleatoria();
        mostrarGanador();
    }//GEN-LAST:event_BotonPapelMouseClicked

    /**
     * Detectar que el boton tijero fue clickeado
     *
     * @param evt
     */
    private void BotonTijeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTijeraMouseClicked
        jugador.eligioTijera();
        
        ocultarJugadasBot();
        
        mostrarJugadaAleatoria();
        mostrarGanador();
    }//GEN-LAST:event_BotonTijeraMouseClicked

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPapel;
    private javax.swing.JButton BotonPiedra;
    private javax.swing.JButton BotonTijera;
    private javax.swing.JLabel jLabelImagenPapelBot;
    private javax.swing.JLabel jLabelImagenPiedraBot;
    private javax.swing.JLabel jLabelImagenTijeraBot;
    private javax.swing.JLabel jLabelTextoGanador;
    // End of variables declaration//GEN-END:variables

    /**
     * Muestra la jugada aleatoria del bot
     */
    private void mostrarJugadaAleatoria() {
        switch (bob.generaJugadaAleatoria()) {
            case DETECTO_JUGADA_PIEDRA:
                //mostrar jugada piedra
                jLabelImagenPiedraBot.setVisible(QUIERO_QUE_SE_VEA);
                break;
            case DETECTO_JUGADA_PAPEL:
                //mostrar jugada papel
                jLabelImagenPapelBot.setVisible(QUIERO_QUE_SE_VEA);
                break;
            case DETECTO_JUGADA_TIJERA:
                //mostrar jugada tijera
                jLabelImagenTijeraBot.setVisible(QUIERO_QUE_SE_VEA);
        }
    }

    /**
     * Oculte los iconos de las jugadas del bot
     */
    private void ocultarJugadasBot() {
        jLabelImagenPapelBot.setVisible(QUE_NO_SE_VEA);
        jLabelImagenPiedraBot.setVisible(QUE_NO_SE_VEA);
        jLabelImagenTijeraBot.setVisible(QUE_NO_SE_VEA);
    }
    
    /**
     * Muestra la informacion en la app de quien gano
     */
    private void mostrarGanador() {
        switch(piedraPapelTijera.decimeQuienGano(jugador, bob)){
            case EMPATE:
                jLabelTextoGanador.setText("EMPATE");
                break;
            case GANO_JUGADOR_UNO:
                jLabelTextoGanador.setText("GANO "+jugador.decimeTuNombre());
                break;
            case GANO_JUGADOR_DOS:
                jLabelTextoGanador.setText("GANO "+bob.decimeTuNombre());
               
        }
    }

}
