package Kasa;

import javax.swing.JFrame;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class neuspjesnoDodavanjeNaRacun extends javax.swing.JFrame {

    /**
     * Creates new form neuspjesnaPrijavaProzor
     */
    public neuspjesnoDodavanjeNaRacun() {
        initComponents();
        JFrame neuspjesnoDodavanjeNaRacun = new JFrame();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/prijava.png")).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glavniPanel = new javax.swing.JPanel();
        ureduDugme = new javax.swing.JButton();
        neuspjesnoDodavanjeTekst1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nije uspjelo!");
        setName("Nije uspjelo!"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 225));
        setResizable(false);
        setSize(new java.awt.Dimension(520, 225));

        glavniPanel.setBackground(new java.awt.Color(27, 88, 138));
        glavniPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 120, 189), 6));
        glavniPanel.setToolTipText(null);
        glavniPanel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        glavniPanel.setName("Nije uspjelo!"); // NOI18N

        ureduDugme.setBackground(new java.awt.Color(27, 88, 138));
        ureduDugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        ureduDugme.setForeground(new java.awt.Color(224, 220, 211));
        ureduDugme.setText("  U redu  ");
        ureduDugme.setToolTipText(null);
        ureduDugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        ureduDugme.setName("U redu"); // NOI18N
        ureduDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureduDugmeActionPerformed(evt);
            }
        });

        neuspjesnoDodavanjeTekst1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        neuspjesnoDodavanjeTekst1.setForeground(new java.awt.Color(224, 220, 211));
        neuspjesnoDodavanjeTekst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/obrisi.png"))); // NOI18N
        neuspjesnoDodavanjeTekst1.setText("Morate izabrati nešto");
        neuspjesnoDodavanjeTekst1.setToolTipText(null);
        neuspjesnoDodavanjeTekst1.setName("Nije uspjelo!"); // NOI18N

        javax.swing.GroupLayout glavniPanelLayout = new javax.swing.GroupLayout(glavniPanel);
        glavniPanel.setLayout(glavniPanelLayout);
        glavniPanelLayout.setHorizontalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(ureduDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(neuspjesnoDodavanjeTekst1)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        glavniPanelLayout.setVerticalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(neuspjesnoDodavanjeTekst1)
                .addGap(38, 38, 38)
                .addComponent(ureduDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        glavniPanel.getAccessibleContext().setAccessibleName("Nije uspjelo!");
        glavniPanel.getAccessibleContext().setAccessibleDescription("Nije uspjelo!");

        getAccessibleContext().setAccessibleDescription("Nije uspjelo!");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ureduDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureduDugmeActionPerformed

        this.dispose();

    }//GEN-LAST:event_ureduDugmeActionPerformed

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
            java.util.logging.Logger.getLogger(neuspjesnoDodavanjeNaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoDodavanjeNaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoDodavanjeNaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoDodavanjeNaRacun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new neuspjesnoDodavanjeNaRacun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel glavniPanel;
    private javax.swing.JLabel neuspjesnoDodavanjeTekst1;
    private javax.swing.JButton ureduDugme;
    // End of variables declaration//GEN-END:variables
}
