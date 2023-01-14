package Kasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class unosRadnika extends javax.swing.JFrame {
    
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String server_databaze = "jdbc:mysql://192.168.10.16:3306/java"; 
   static final String korisnik_databaze = "student";
   static final String sifra_databaze = "student";

    /**
     * Creates new form Unos
     */
    public unosRadnika() {
        initComponents();
        JFrame unosRadnika = new JFrame();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/prijava.png")).getImage());
        prikazivanjeRadnikaUTabeli();
        sacuvajIzmjene.setVisible(false);
        redniBrojRadnika_unos.setVisible(false);
        redniBrojRadnika_tekst.setVisible(false);
        ponistiIzmjene.setVisible(false);
       
    }
    
    public ArrayList<Radnici> prikazListeRadnik() {
        
    ArrayList<Radnici> prikazListeRadnika = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM uposlenici";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Radnici radniciPrikaz;
            while(rezultat.next()){
                radniciPrikaz = new Radnici(rezultat.getInt("id"), rezultat.getString("uposlenik"), rezultat.getString("sifra"), rezultat.getString("daLiJeAdministrator"));
                prikazListeRadnika.add(radniciPrikaz);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListeRadnika;   
    }
    
    public void prikazivanjeRadnikaUTabeli(){
        
        ArrayList<Radnici> lista = prikazListeRadnik();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaRadnika.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getRedniBroj();
            red[1] = lista.get(i).getUposlenik();
            red[2] = lista.get(i).getSifra();
            red[3] = lista.get(i).getDaLiJeAdministrator();
            ispisUTabeli.addRow(red);
            
        }
        
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
        dodavanjeTekst = new javax.swing.JLabel();
        dodajImeRadnikaUBazu_unos = new javax.swing.JTextField();
        dodajImeRadnikaUBazu_tekst = new javax.swing.JLabel();
        dodajSifruRadnikaUBazu_tekst = new javax.swing.JLabel();
        dodajSifruRadnikaUBazu_unos = new javax.swing.JTextField();
        resetujPolja_dugme = new javax.swing.JButton();
        tabelaSkrol = new javax.swing.JScrollPane();
        tabelaRadnika = new javax.swing.JTable();
        radnikAdministrator_tekst = new javax.swing.JLabel();
        radnikAdministrator_biranje = new javax.swing.JComboBox<>();
        dodajUBazuRadnika = new javax.swing.JButton();
        brisanjeRadnikaIzBaze_dugme = new javax.swing.JButton();
        promijeniPodatke = new javax.swing.JButton();
        redniBrojRadnika_unos = new javax.swing.JTextField();
        redniBrojRadnika_tekst = new javax.swing.JLabel();
        sacuvajIzmjene = new javax.swing.JButton();
        ponistiIzmjene = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caffe bar \"Romansa\" - Unos proizvoda");
        setName("Caffe bar \"Romansa\" - Unos proizvoda"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1127, 537));
        setResizable(false);
        setSize(new java.awt.Dimension(1127, 537));

        glavniPanel.setBackground(new java.awt.Color(27, 88, 138));
        glavniPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 120, 189), 3, true));
        glavniPanel.setToolTipText(null);
        glavniPanel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        glavniPanel.setName("Caffe bar \"Romansa\" - Unos proizvoda"); // NOI18N
        glavniPanel.setPreferredSize(new java.awt.Dimension(1127, 537));

        dodavanjeTekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodavanjeTekst.setForeground(new java.awt.Color(224, 220, 211));
        dodavanjeTekst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/listaradnika.png"))); // NOI18N
        dodavanjeTekst.setText("Unesite radnika u bazu ili obrišite radnika iz baze");
        dodavanjeTekst.setToolTipText(null);
        dodavanjeTekst.setName("Dodavanje"); // NOI18N

        dodajImeRadnikaUBazu_unos.setBackground(new java.awt.Color(27, 68, 115));
        dodajImeRadnikaUBazu_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajImeRadnikaUBazu_unos.setForeground(new java.awt.Color(224, 220, 211));
        dodajImeRadnikaUBazu_unos.setToolTipText(null);
        dodajImeRadnikaUBazu_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dodajImeRadnikaUBazu_unos.setName("Unos naziva piva"); // NOI18N

        dodajImeRadnikaUBazu_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajImeRadnikaUBazu_tekst.setForeground(new java.awt.Color(224, 220, 211));
        dodajImeRadnikaUBazu_tekst.setText("Ime radnika:");
        dodajImeRadnikaUBazu_tekst.setToolTipText(null);
        dodajImeRadnikaUBazu_tekst.setName("Unesite naziv proizvoda"); // NOI18N

        dodajSifruRadnikaUBazu_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajSifruRadnikaUBazu_tekst.setForeground(new java.awt.Color(224, 220, 211));
        dodajSifruRadnikaUBazu_tekst.setText("Šifra radnika:");
        dodajSifruRadnikaUBazu_tekst.setToolTipText(null);
        dodajSifruRadnikaUBazu_tekst.setName("Unesite cijenu proizvoda"); // NOI18N

        dodajSifruRadnikaUBazu_unos.setBackground(new java.awt.Color(27, 68, 115));
        dodajSifruRadnikaUBazu_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajSifruRadnikaUBazu_unos.setForeground(new java.awt.Color(224, 220, 211));
        dodajSifruRadnikaUBazu_unos.setToolTipText(null);
        dodajSifruRadnikaUBazu_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dodajSifruRadnikaUBazu_unos.setName("Unos cijene proizvoda"); // NOI18N

        resetujPolja_dugme.setBackground(new java.awt.Color(27, 88, 138));
        resetujPolja_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        resetujPolja_dugme.setForeground(new java.awt.Color(224, 220, 211));
        resetujPolja_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/reset.png"))); // NOI18N
        resetujPolja_dugme.setText("Očisti polja");
        resetujPolja_dugme.setToolTipText(null);
        resetujPolja_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        resetujPolja_dugme.setName("Očisti polja"); // NOI18N
        resetujPolja_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetujPolja_dugmeActionPerformed(evt);
            }
        });

        tabelaSkrol.setBackground(new java.awt.Color(27, 88, 138));
        tabelaSkrol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 120, 189), 3, true));
        tabelaSkrol.setForeground(new java.awt.Color(224, 220, 211));
        tabelaSkrol.setToolTipText(null);
        tabelaSkrol.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

        tabelaRadnika.setAutoCreateRowSorter(true);
        tabelaRadnika.setBackground(new java.awt.Color(27, 88, 138));
        tabelaRadnika.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 120, 189), 3, true));
        tabelaRadnika.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        tabelaRadnika.setForeground(new java.awt.Color(224, 220, 211));
        tabelaRadnika.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Redni broj", "Ime", "Sifra", "Da li je Administrator?"
            }
        ));
        tabelaRadnika.setToolTipText(null);
        tabelaRadnika.setRowHeight(28);
        tabelaSkrol.setViewportView(tabelaRadnika);

        radnikAdministrator_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        radnikAdministrator_tekst.setForeground(new java.awt.Color(224, 220, 211));
        radnikAdministrator_tekst.setText("Administrator:");
        radnikAdministrator_tekst.setToolTipText(null);
        radnikAdministrator_tekst.setName("Unesite cijenu proizvoda"); // NOI18N

        radnikAdministrator_biranje.setBackground(new java.awt.Color(27, 68, 115));
        radnikAdministrator_biranje.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        radnikAdministrator_biranje.setForeground(new java.awt.Color(27, 68, 115));
        radnikAdministrator_biranje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ne", "Da" }));

        dodajUBazuRadnika.setBackground(new java.awt.Color(27, 88, 138));
        dodajUBazuRadnika.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        dodajUBazuRadnika.setForeground(new java.awt.Color(224, 220, 211));
        dodajUBazuRadnika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/dodaj.png"))); // NOI18N
        dodajUBazuRadnika.setText("Dodaj radnika u bazu");
        dodajUBazuRadnika.setToolTipText(null);
        dodajUBazuRadnika.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        dodajUBazuRadnika.setName("Očisti polja"); // NOI18N
        dodajUBazuRadnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajUBazuRadnikaActionPerformed(evt);
            }
        });

        brisanjeRadnikaIzBaze_dugme.setBackground(new java.awt.Color(27, 88, 138));
        brisanjeRadnikaIzBaze_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        brisanjeRadnikaIzBaze_dugme.setForeground(new java.awt.Color(224, 220, 211));
        brisanjeRadnikaIzBaze_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/obrisi.png"))); // NOI18N
        brisanjeRadnikaIzBaze_dugme.setText("Ukloni radnika iz baze");
        brisanjeRadnikaIzBaze_dugme.setToolTipText(null);
        brisanjeRadnikaIzBaze_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        brisanjeRadnikaIzBaze_dugme.setName("Očisti polja"); // NOI18N
        brisanjeRadnikaIzBaze_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brisanjeRadnikaIzBaze_dugmeActionPerformed(evt);
            }
        });

        promijeniPodatke.setBackground(new java.awt.Color(27, 88, 138));
        promijeniPodatke.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        promijeniPodatke.setForeground(new java.awt.Color(224, 220, 211));
        promijeniPodatke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/osvjezi.png"))); // NOI18N
        promijeniPodatke.setText("Uredi podatke o radniku");
        promijeniPodatke.setToolTipText(null);
        promijeniPodatke.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        promijeniPodatke.setName("Očisti polja"); // NOI18N
        promijeniPodatke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promijeniPodatkeActionPerformed(evt);
            }
        });

        redniBrojRadnika_unos.setBackground(new java.awt.Color(27, 68, 115));
        redniBrojRadnika_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        redniBrojRadnika_unos.setForeground(new java.awt.Color(255, 0, 0));
        redniBrojRadnika_unos.setToolTipText(null);
        redniBrojRadnika_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        redniBrojRadnika_unos.setDisabledTextColor(new java.awt.Color(27, 88, 138));
        redniBrojRadnika_unos.setEnabled(false);
        redniBrojRadnika_unos.setName("Unos naziva piva"); // NOI18N
        redniBrojRadnika_unos.setSelectedTextColor(new java.awt.Color(27, 88, 138));

        redniBrojRadnika_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        redniBrojRadnika_tekst.setForeground(new java.awt.Color(224, 220, 211));
        redniBrojRadnika_tekst.setText("Redni broj radnika:");
        redniBrojRadnika_tekst.setToolTipText(null);
        redniBrojRadnika_tekst.setName("Unesite naziv proizvoda"); // NOI18N

        sacuvajIzmjene.setBackground(new java.awt.Color(27, 88, 138));
        sacuvajIzmjene.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        sacuvajIzmjene.setForeground(new java.awt.Color(224, 220, 211));
        sacuvajIzmjene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/uspjesno.png"))); // NOI18N
        sacuvajIzmjene.setText("Sačuvaj izmjene");
        sacuvajIzmjene.setToolTipText(null);
        sacuvajIzmjene.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        sacuvajIzmjene.setName("Očisti polja"); // NOI18N
        sacuvajIzmjene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajIzmjeneActionPerformed(evt);
            }
        });

        ponistiIzmjene.setBackground(new java.awt.Color(27, 88, 138));
        ponistiIzmjene.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        ponistiIzmjene.setForeground(new java.awt.Color(224, 220, 211));
        ponistiIzmjene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/obrisi.png"))); // NOI18N
        ponistiIzmjene.setText("Poništi izmjene");
        ponistiIzmjene.setToolTipText(null);
        ponistiIzmjene.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        ponistiIzmjene.setName("Očisti polja"); // NOI18N
        ponistiIzmjene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponistiIzmjeneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout glavniPanelLayout = new javax.swing.GroupLayout(glavniPanel);
        glavniPanel.setLayout(glavniPanelLayout);
        glavniPanelLayout.setHorizontalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(glavniPanelLayout.createSequentialGroup()
                                        .addComponent(radnikAdministrator_tekst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radnikAdministrator_biranje, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glavniPanelLayout.createSequentialGroup()
                                        .addComponent(redniBrojRadnika_tekst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(redniBrojRadnika_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glavniPanelLayout.createSequentialGroup()
                                        .addComponent(dodajImeRadnikaUBazu_tekst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dodajImeRadnikaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, glavniPanelLayout.createSequentialGroup()
                                        .addComponent(dodajSifruRadnikaUBazu_tekst)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dodajSifruRadnikaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51))
                            .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(glavniPanelLayout.createSequentialGroup()
                                    .addComponent(sacuvajIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ponistiIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(glavniPanelLayout.createSequentialGroup()
                                    .addComponent(dodajUBazuRadnika, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(resetujPolja_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tabelaSkrol, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                .addComponent(promijeniPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brisanjeRadnikaIzBaze_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(dodavanjeTekst))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        glavniPanelLayout.setVerticalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(dodavanjeTekst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redniBrojRadnika_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redniBrojRadnika_tekst))
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajImeRadnikaUBazu_tekst)
                            .addComponent(dodajImeRadnikaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajSifruRadnikaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodajSifruRadnikaUBazu_tekst))
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radnikAdministrator_tekst)
                            .addComponent(radnikAdministrator_biranje, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sacuvajIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponistiIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tabelaSkrol, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetujPolja_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brisanjeRadnikaIzBaze_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodajUBazuRadnika, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promijeniPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        dodavanjeTekst.getAccessibleContext().setAccessibleName("Dodavanje");
        dodavanjeTekst.getAccessibleContext().setAccessibleDescription("Dodavanje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(glavniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        glavniPanel.getAccessibleContext().setAccessibleName("Caffe bar \"Romansa\" - Unos proizvoda");
        glavniPanel.getAccessibleContext().setAccessibleDescription("Caffe bar \"Romansa\" - Unos proizvoda");

        getAccessibleContext().setAccessibleDescription("Caffe bar \"Romansa\" - Unos proizvoda");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetujPolja_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetujPolja_dugmeActionPerformed

        dodajSifruRadnikaUBazu_unos.setText("");
        dodajImeRadnikaUBazu_unos.setText("");
        radnikAdministrator_biranje.setSelectedItem("Ne");
        
    }//GEN-LAST:event_resetujPolja_dugmeActionPerformed

    private void dodajUBazuRadnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajUBazuRadnikaActionPerformed
       
          if(dodajImeRadnikaUBazu_unos.getText().equals("") || dodajSifruRadnikaUBazu_unos.getText().equals("")){
                
                neuspjesnoDodavanjeProzor iskace = new neuspjesnoDodavanjeProzor();
                iskace.setVisible(true);
                radnikAdministrator_biranje.setSelectedItem("Ne");
                
            }else {
        
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String unosUBazu = "Insert into uposlenici(uposlenik, sifra, smjena, daLiJeLogovan, daLiJeAdministrator)values(?,?,?,?,?)";
            PreparedStatement ubacivanjeUBazu = konekcija.prepareStatement(unosUBazu);
            ubacivanjeUBazu.setString(1, dodajImeRadnikaUBazu_unos.getText());
            ubacivanjeUBazu.setString(2, dodajSifruRadnikaUBazu_unos.getText());
            ubacivanjeUBazu.setString(3, "Nije na poslu");
            ubacivanjeUBazu.setString(4, "Ne");
            ubacivanjeUBazu.setString(5, radnikAdministrator_biranje.getSelectedItem().toString());
            ubacivanjeUBazu.executeUpdate();
            DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaRadnika.getModel();
            osvjezivanjeTabele.setRowCount(0);
            dodajSifruRadnikaUBazu_unos.setText("");
            dodajImeRadnikaUBazu_unos.setText("");
            radnikAdministrator_biranje.setSelectedItem("Ne");
            prikazivanjeRadnikaUTabeli();
            
             uspjesnoDodavanjeProzor iskace = new uspjesnoDodavanjeProzor();
             iskace.setVisible(true);
            
        } catch (Exception e) {
                
                neuspjesnoDodavanjeProzor iskace = new neuspjesnoDodavanjeProzor();
                iskace.setVisible(true);
        }
        }
        
    }//GEN-LAST:event_dodajUBazuRadnikaActionPerformed

    private void brisanjeRadnikaIzBaze_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brisanjeRadnikaIzBaze_dugmeActionPerformed
        
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            int red = tabelaRadnika.getSelectedRow();
            String pripremaZaBrisanje=(tabelaRadnika.getModel().getValueAt(red, 0).toString());
            String upitZaBrisanje = "Delete from uposlenici where id="+pripremaZaBrisanje;
            PreparedStatement brisanjeIzBase = konekcija.prepareStatement(upitZaBrisanje);
            brisanjeIzBase.executeUpdate();
            DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaRadnika.getModel();
            osvjezivanjeTabele.setRowCount(0);
            dodajSifruRadnikaUBazu_unos.setText("");
            dodajImeRadnikaUBazu_unos.setText("");
            radnikAdministrator_biranje.setSelectedItem("Ne");
            prikazivanjeRadnikaUTabeli();
           
             uspjesnoBrisanjeProzor iskace = new uspjesnoBrisanjeProzor();
             iskace.setVisible(true);

        } catch (Exception e) {
            
                neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
                iskace.setVisible(true);
                dodajSifruRadnikaUBazu_unos.setText("");
                dodajImeRadnikaUBazu_unos.setText("");
                radnikAdministrator_biranje.setSelectedItem("Ne");
            
        }  
        
    }//GEN-LAST:event_brisanjeRadnikaIzBaze_dugmeActionPerformed

    private void sacuvajIzmjeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajIzmjeneActionPerformed

        String redniBrojRadnika = redniBrojRadnika_unos.getText();
        int redniBroj = Integer.parseInt(redniBrojRadnika);

        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String unosUBazu = "UPDATE uposlenici SET uposlenik=?, sifra=?, daLiJeAdministrator=? where id="+redniBroj;
            PreparedStatement ubacivanjeUBazu = konekcija.prepareStatement(unosUBazu);
            ubacivanjeUBazu.setString(1, dodajImeRadnikaUBazu_unos.getText());
            ubacivanjeUBazu.setString(2, dodajSifruRadnikaUBazu_unos.getText());
            ubacivanjeUBazu.setString(3, radnikAdministrator_biranje.getSelectedItem().toString());
            ubacivanjeUBazu.executeUpdate();
            DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaRadnika.getModel();
            osvjezivanjeTabele.setRowCount(0);

            dodajImeRadnikaUBazu_unos.setText("");
            dodajSifruRadnikaUBazu_unos.setText("");
            radnikAdministrator_biranje.setSelectedItem("Ne");
            prikazivanjeRadnikaUTabeli();
            dodajUBazuRadnika.setVisible(true);
            resetujPolja_dugme.setVisible(true);
            sacuvajIzmjene.setVisible(false);
            ponistiIzmjene.setVisible(false);
            redniBrojRadnika_unos.setVisible(false);
            redniBrojRadnika_tekst.setVisible(false);
        
        uspjesnoAzuriranje iskace = new uspjesnoAzuriranje();
        iskace.setVisible(true);
 
        } catch (Exception e) {

            neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
            iskace.setVisible(true);

        }

    }//GEN-LAST:event_sacuvajIzmjeneActionPerformed

    private void promijeniPodatkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promijeniPodatkeActionPerformed

         if(tabelaRadnika.getSelectionModel().isSelectionEmpty()){
             
        neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
        iskace.setVisible(true);
         }else{
        int i = tabelaRadnika.getSelectedRow();
        TableModel model = tabelaRadnika.getModel();
        redniBrojRadnika_unos.setText(model.getValueAt(i, 0).toString());
        dodajImeRadnikaUBazu_unos.setText(model.getValueAt(i, 1).toString());
        dodajSifruRadnikaUBazu_unos.setText(model.getValueAt(i, 2).toString());
        radnikAdministrator_biranje.setSelectedItem(model.getValueAt(i, 3));
        sacuvajIzmjene.setVisible(true);
        ponistiIzmjene.setVisible(true);
        redniBrojRadnika_unos.setVisible(true);
        redniBrojRadnika_tekst.setVisible(true);
        dodajUBazuRadnika.setVisible(false);
        resetujPolja_dugme.setVisible(false);
         }
    }//GEN-LAST:event_promijeniPodatkeActionPerformed

    private void ponistiIzmjeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponistiIzmjeneActionPerformed

        dodajImeRadnikaUBazu_unos.setText("");
        dodajSifruRadnikaUBazu_unos.setText("");
        radnikAdministrator_biranje.setSelectedItem("Ne");
        redniBrojRadnika_unos.setText("");
        dodajUBazuRadnika.setVisible(true);
        resetujPolja_dugme.setVisible(true);
        sacuvajIzmjene.setVisible(false);
        redniBrojRadnika_unos.setVisible(false);
        redniBrojRadnika_tekst.setVisible(false);
        ponistiIzmjene.setVisible(false);

    }//GEN-LAST:event_ponistiIzmjeneActionPerformed

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
            java.util.logging.Logger.getLogger(unosRadnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unosRadnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unosRadnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unosRadnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new unosRadnika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brisanjeRadnikaIzBaze_dugme;
    private javax.swing.JLabel dodajImeRadnikaUBazu_tekst;
    private javax.swing.JTextField dodajImeRadnikaUBazu_unos;
    private javax.swing.JLabel dodajSifruRadnikaUBazu_tekst;
    private javax.swing.JTextField dodajSifruRadnikaUBazu_unos;
    private javax.swing.JButton dodajUBazuRadnika;
    private javax.swing.JLabel dodavanjeTekst;
    private javax.swing.JPanel glavniPanel;
    private javax.swing.JButton ponistiIzmjene;
    private javax.swing.JButton promijeniPodatke;
    private javax.swing.JComboBox<String> radnikAdministrator_biranje;
    private javax.swing.JLabel radnikAdministrator_tekst;
    private javax.swing.JLabel redniBrojRadnika_tekst;
    private javax.swing.JTextField redniBrojRadnika_unos;
    private javax.swing.JButton resetujPolja_dugme;
    private javax.swing.JButton sacuvajIzmjene;
    private javax.swing.JTable tabelaRadnika;
    private javax.swing.JScrollPane tabelaSkrol;
    // End of variables declaration//GEN-END:variables

}