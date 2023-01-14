package Kasa;

import javax.swing.JFrame;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class neuspjesnoBrisanjeSvegaSaRacuna extends javax.swing.JFrame {

    /**
     * Creates new form uspjesnaPrijavaProzor
     */
    public neuspjesnoBrisanjeSvegaSaRacuna() {
        initComponents();
        JFrame neuspjesnoBrisanjeSvegaSaRacuna = new JFrame();
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
        neuspjesnoObrisanoTekst = new javax.swing.JLabel();
        ureduDugme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morate označiti proizvod!");
        setBackground(new java.awt.Color(27, 88, 138));
        setName("Uspješno obrisano!"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        glavniPanel.setBackground(new java.awt.Color(27, 88, 138));
        glavniPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 120, 189), 6));
        glavniPanel.setToolTipText(null);
        glavniPanel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        glavniPanel.setName("Morate označiti proizvod!"); // NOI18N

        neuspjesnoObrisanoTekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        neuspjesnoObrisanoTekst.setForeground(new java.awt.Color(224, 220, 211));
        neuspjesnoObrisanoTekst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/obrisi.png"))); // NOI18N
        neuspjesnoObrisanoTekst.setText("Na računu nema nijednog proizvoda");
        neuspjesnoObrisanoTekst.setToolTipText(null);
        neuspjesnoObrisanoTekst.setName("Uspješno obrisano!"); // NOI18N

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

        javax.swing.GroupLayout glavniPanelLayout = new javax.swing.GroupLayout(glavniPanel);
        glavniPanel.setLayout(glavniPanelLayout);
        glavniPanelLayout.setHorizontalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glavniPanelLayout.createSequentialGroup()
                        .addComponent(neuspjesnoObrisanoTekst)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glavniPanelLayout.createSequentialGroup()
                        .addComponent(ureduDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        glavniPanelLayout.setVerticalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(neuspjesnoObrisanoTekst)
                .addGap(31, 31, 31)
                .addComponent(ureduDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        neuspjesnoObrisanoTekst.getAccessibleContext().setAccessibleDescription("Uspješno obrisano!");
        ureduDugme.getAccessibleContext().setAccessibleDescription("U redu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        glavniPanel.getAccessibleContext().setAccessibleName("Morate označiti proizvod!");
        glavniPanel.getAccessibleContext().setAccessibleDescription("Morate označiti proizvod!");

        getAccessibleContext().setAccessibleDescription("Morate označiti proizvod!");

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
            java.util.logging.Logger.getLogger(neuspjesnoBrisanjeSvegaSaRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoBrisanjeSvegaSaRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoBrisanjeSvegaSaRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(neuspjesnoBrisanjeSvegaSaRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new neuspjesnoBrisanjeSvegaSaRacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel glavniPanel;
    private javax.swing.JLabel neuspjesnoObrisanoTekst;
    private javax.swing.JButton ureduDugme;
    // End of variables declaration//GEN-END:variables
}
