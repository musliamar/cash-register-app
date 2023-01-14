package Kasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class jesteLiSigurni extends javax.swing.JFrame {
    
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String server_databaze = "jdbc:mysql://192.168.10.16:3306/java"; 
   static final String korisnik_databaze = "student";
   static final String sifra_databaze = "student";

    /**
     * Creates new form neuspjesnaPrijavaProzor
     */
    public jesteLiSigurni() {
        initComponents();
        JFrame jesteLiSigurni = new JFrame();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/prijava.png")).getImage());
        prikazTrenutnoPrijavljenog();
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
        izlogovani = new javax.swing.JLabel();
        izlogujMe = new javax.swing.JButton();
        jesteLiSigurni = new javax.swing.JLabel();
        necu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jeste li sigurni");
        setName("Nije uspjelo!"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 225));
        setResizable(false);
        setSize(new java.awt.Dimension(520, 225));

        glavniPanel.setBackground(new java.awt.Color(27, 88, 138));
        glavniPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 120, 189), 6));
        glavniPanel.setToolTipText(null);
        glavniPanel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        glavniPanel.setName("Jeste li sigurni"); // NOI18N

        izlogovani.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        izlogovani.setForeground(new java.awt.Color(224, 220, 211));
        izlogovani.setText("Biti ćete izlogovani.");
        izlogovani.setToolTipText(null);
        izlogovani.setName("Nije uspjelo!"); // NOI18N

        izlogujMe.setBackground(new java.awt.Color(27, 88, 138));
        izlogujMe.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        izlogujMe.setForeground(new java.awt.Color(224, 220, 211));
        izlogujMe.setText("Da");
        izlogujMe.setToolTipText(null);
        izlogujMe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        izlogujMe.setName("U redu"); // NOI18N
        izlogujMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlogujMeActionPerformed(evt);
            }
        });

        jesteLiSigurni.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jesteLiSigurni.setForeground(new java.awt.Color(224, 220, 211));
        jesteLiSigurni.setText("Jeste li sigurni da želite zatvoriti ovaj prozor?");
        jesteLiSigurni.setToolTipText(null);
        jesteLiSigurni.setName("Nije uspjelo!"); // NOI18N

        necu.setBackground(new java.awt.Color(27, 88, 138));
        necu.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        necu.setForeground(new java.awt.Color(224, 220, 211));
        necu.setText("Ne");
        necu.setToolTipText(null);
        necu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        necu.setName("U redu"); // NOI18N
        necu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                necuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout glavniPanelLayout = new javax.swing.GroupLayout(glavniPanel);
        glavniPanel.setLayout(glavniPanelLayout);
        glavniPanelLayout.setHorizontalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(izlogovani)
                .addGap(167, 167, 167))
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jesteLiSigurni))
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(izlogujMe, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(necu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        glavniPanelLayout.setVerticalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jesteLiSigurni)
                .addGap(18, 18, 18)
                .addComponent(izlogovani)
                .addGap(18, 18, 18)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izlogujMe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(necu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        izlogovani.getAccessibleContext().setAccessibleDescription("Nije uspjelo!");

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

        glavniPanel.getAccessibleContext().setAccessibleName("Jeste li sigurni");
        glavniPanel.getAccessibleContext().setAccessibleDescription("Jeste li sigurni");

        getAccessibleContext().setAccessibleDescription("Jeste li sigurni");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     int idUposlenika = 0;
   
    public void prikazTrenutnoPrijavljenog() {
        
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery("SELECT * FROM uposlenici WHERE daLiJeLogovan='Da'");
            
            while(rezultat.next()){
                idUposlenika = rezultat.getInt("id");
                
            }
           }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void izlogujMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlogujMeActionPerformed

        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String unosUBazu = "UPDATE uposlenici SET smjena=?, daLiJeLogovan=? where id="+idUposlenika;
            
            PreparedStatement brisanjeIzBase = konekcija.prepareStatement(unosUBazu);
            brisanjeIzBase.setString(1, "Nije na poslu");
            brisanjeIzBase.setString(2, "Ne");
            
            brisanjeIzBase.executeUpdate();
            
            java.awt.Window prozori[] = java.awt.Window.getWindows(); 
            for(int i=0;i<prozori.length;i++){ 
            prozori[i].dispose(); 
            } 
            
            Prijava prikazivanje = new Prijava();
            prikazivanje.setVisible(true);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  

    }//GEN-LAST:event_izlogujMeActionPerformed

    private void necuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_necuActionPerformed
       
         this.dispose();
        
    }//GEN-LAST:event_necuActionPerformed

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
            java.util.logging.Logger.getLogger(jesteLiSigurni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jesteLiSigurni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jesteLiSigurni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jesteLiSigurni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jesteLiSigurni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel glavniPanel;
    private javax.swing.JLabel izlogovani;
    private javax.swing.JButton izlogujMe;
    private javax.swing.JLabel jesteLiSigurni;
    private javax.swing.JButton necu;
    // End of variables declaration//GEN-END:variables
}