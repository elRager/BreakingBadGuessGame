
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dague
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public PantallaPrincipal() {
        
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMain = new javax.swing.JPanel();
        pRight = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();
        pTop = new javax.swing.JPanel();
        pBot = new javax.swing.JPanel();
        pGrid = new javax.swing.JPanel();
        pGridLeft = new javax.swing.JPanel();
        pBotones = new javax.swing.JPanel();
        bNuevaPartida = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        pGridRight = new javax.swing.JPanel();
        pMid = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setResizable(false);

        pMain.setMinimumSize(new java.awt.Dimension(1200, 750));
        pMain.setName(""); // NOI18N
        pMain.setOpaque(false);
        pMain.setPreferredSize(new java.awt.Dimension(1200, 750));
        pMain.setLayout(new java.awt.BorderLayout());

        pRight.setMinimumSize(new java.awt.Dimension(200, 0));
        pRight.setOpaque(false);
        pRight.setPreferredSize(new java.awt.Dimension(200, 0));

        javax.swing.GroupLayout pRightLayout = new javax.swing.GroupLayout(pRight);
        pRight.setLayout(pRightLayout);
        pRightLayout.setHorizontalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pRightLayout.setVerticalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pMain.add(pRight, java.awt.BorderLayout.EAST);

        pLeft.setMinimumSize(new java.awt.Dimension(200, 0));
        pLeft.setName(""); // NOI18N
        pLeft.setOpaque(false);

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pMain.add(pLeft, java.awt.BorderLayout.WEST);

        pTop.setOpaque(false);

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        pMain.add(pTop, java.awt.BorderLayout.PAGE_START);

        pBot.setOpaque(false);

        pGrid.setOpaque(false);
        pGrid.setLayout(new java.awt.GridLayout(1, 3, 0, 20));

        pGridLeft.setOpaque(false);

        javax.swing.GroupLayout pGridLeftLayout = new javax.swing.GroupLayout(pGridLeft);
        pGridLeft.setLayout(pGridLeftLayout);
        pGridLeftLayout.setHorizontalGroup(
            pGridLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        pGridLeftLayout.setVerticalGroup(
            pGridLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        pGrid.add(pGridLeft);

        pBotones.setOpaque(false);
        pBotones.setLayout(new java.awt.GridLayout(2, 1, 0, 20));

        bNuevaPartida.setBackground(new java.awt.Color(51, 51, 51));
        bNuevaPartida.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        bNuevaPartida.setForeground(new java.awt.Color(0, 153, 0));
        bNuevaPartida.setText("NUEVA PARTIDA");
        bNuevaPartida.setBorder(null);
        bNuevaPartida.setBorderPainted(false);
        bNuevaPartida.setDefaultCapable(false);
        bNuevaPartida.setFocusPainted(false);
        bNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevaPartidaActionPerformed(evt);
            }
        });
        pBotones.add(bNuevaPartida);

        bSalir.setBackground(new java.awt.Color(51, 51, 51));
        bSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        bSalir.setForeground(new java.awt.Color(0, 153, 0));
        bSalir.setText("SALIR");
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setFocusPainted(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        pBotones.add(bSalir);

        pGrid.add(pBotones);

        pGridRight.setOpaque(false);

        javax.swing.GroupLayout pGridRightLayout = new javax.swing.GroupLayout(pGridRight);
        pGridRight.setLayout(pGridRightLayout);
        pGridRightLayout.setHorizontalGroup(
            pGridRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        pGridRightLayout.setVerticalGroup(
            pGridRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        pGrid.add(pGridRight);

        javax.swing.GroupLayout pBotLayout = new javax.swing.GroupLayout(pBot);
        pBot.setLayout(pBotLayout);
        pBotLayout.setHorizontalGroup(
            pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBotLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pBotLayout.setVerticalGroup(
            pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
            .addGroup(pBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pBotLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pGrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pMain.add(pBot, java.awt.BorderLayout.PAGE_END);

        pMid.setOpaque(false);
        pMid.setLayout(new java.awt.BorderLayout());

        lTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(0, 153, 0));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("¿QUIÉN ES QUIÉN?");
        pMid.add(lTitulo, java.awt.BorderLayout.NORTH);

        pMain.add(pMid, java.awt.BorderLayout.CENTER);

        getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevaPartidaActionPerformed
        this.setVisible(false);
        PantallaJuego juego = new PantallaJuego();
        juego.setVisible(true);
    }//GEN-LAST:event_bNuevaPartidaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bNuevaPartida;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pBot;
    private javax.swing.JPanel pBotones;
    private javax.swing.JPanel pGrid;
    private javax.swing.JPanel pGridLeft;
    private javax.swing.JPanel pGridRight;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pMid;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
