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
public class Unos extends javax.swing.JFrame {
    
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String server_databaze = "jdbc:mysql://192.168.10.16:3306/java"; 
   static final String korisnik_databaze = "student";
   static final String sifra_databaze = "student";

    /**
     * Creates new form Unos
     */
    public Unos() {
        initComponents();
        JFrame unos = new JFrame();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/prijava.png")).getImage());
        prikazivanjePivaUTabeli();
        sacuvajIzmjene.setVisible(false);
        redniBrojProizvoda_unos.setVisible(false);
        redniBrojProizvoda_tekst.setVisible(false);
        ponistiIzmjene.setVisible(false);
        int kolicina = 1;
        unosKolicineProizvoda_unos.setText(String.valueOf(kolicina));
       
    }
    
    public ArrayList<Proizvodi> prikazListePivo() {
        
    ArrayList<Proizvodi> prikazListePiva = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM proizvodi WHERE kategorija='Piva'";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Proizvodi pivoDodavanje;
            while(rezultat.next()){
                pivoDodavanje = new Proizvodi(rezultat.getInt("id"),rezultat.getInt("naStanju"),rezultat.getString("proizvod"),rezultat.getFloat("cijena"),rezultat.getString("kategorija"));
                prikazListePiva.add(pivoDodavanje);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListePiva;   
    }
    
    public void prikazivanjePivaUTabeli(){
        
        ArrayList<Proizvodi> lista = prikazListePivo();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaProizvoda.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getId();
            red[1] = lista.get(i).getNaStanju();
            red[2] = lista.get(i).getProizvod();
            red[3] = lista.get(i).getCijena();
            red[4] = lista.get(i).getKategorija();
            ispisUTabeli.addRow(red);
             
        }
        
    }
    
     public ArrayList<Proizvodi> prikazListeVino() {
        
    ArrayList<Proizvodi> prikazListeVina = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM proizvodi WHERE kategorija='Vina'";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Proizvodi vinoDodavanje;
            while(rezultat.next()){
                vinoDodavanje = new Proizvodi(rezultat.getInt("id"),rezultat.getInt("naStanju"),rezultat.getString("proizvod"),rezultat.getFloat("cijena"),rezultat.getString("kategorija"));
                prikazListeVina.add(vinoDodavanje);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListeVina;   
    }
    
    public void prikazivanjeVinaUTabeli(){
        
        ArrayList<Proizvodi> lista = prikazListeVino();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaProizvoda.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getId();
            red[1] = lista.get(i).getNaStanju();
            red[2] = lista.get(i).getProizvod();
            red[3] = lista.get(i).getCijena();
            red[4] = lista.get(i).getKategorija();
            ispisUTabeli.addRow(red);
            
        }
        
    }
   
    public ArrayList<Proizvodi> prikazListeZestoko() {
        
    ArrayList<Proizvodi> prikazListeZestokih = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM proizvodi WHERE kategorija='Zestoka'";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Proizvodi zestokoDodavanje;
            while(rezultat.next()){
                zestokoDodavanje = new Proizvodi(rezultat.getInt("id"),rezultat.getInt("naStanju"),rezultat.getString("proizvod"),rezultat.getFloat("cijena"),rezultat.getString("kategorija"));
                prikazListeZestokih.add(zestokoDodavanje);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListeZestokih;   
    }
    
    public void prikazivanjeZestokogUTabeli(){
        
        ArrayList<Proizvodi> lista = prikazListeZestoko();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaProizvoda.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getId();
            red[1] = lista.get(i).getNaStanju();
            red[2] = lista.get(i).getProizvod();
            red[3] = lista.get(i).getCijena();
            red[4] = lista.get(i).getKategorija();
            ispisUTabeli.addRow(red);
            
        }
        
    }
    
     public ArrayList<Proizvodi> prikazListeSok() {
        
    ArrayList<Proizvodi> prikazListeSokova = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM proizvodi WHERE kategorija='Sokovi'";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Proizvodi sokoviDodavanje;
            while(rezultat.next()){
                sokoviDodavanje = new Proizvodi(rezultat.getInt("id"),rezultat.getInt("naStanju"),rezultat.getString("proizvod"),rezultat.getFloat("cijena"),rezultat.getString("kategorija"));
                prikazListeSokova.add(sokoviDodavanje);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListeSokova;   
    }
    
    public void prikazivanjeSokovaUTabeli(){
        
        ArrayList<Proizvodi> lista = prikazListeSok();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaProizvoda.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getId();
            red[1] = lista.get(i).getNaStanju();
            red[2] = lista.get(i).getProizvod();
            red[3] = lista.get(i).getCijena();
            red[4] = lista.get(i).getKategorija();
            ispisUTabeli.addRow(red);
            
        }
        
    }
    
     public ArrayList<Proizvodi> prikazListeKafe() {
        
    ArrayList<Proizvodi> prikazListeKafa = new ArrayList<>();
    
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String prikazivanjeIzBaze = "SELECT * FROM proizvodi WHERE kategorija='Kafe'";
            stejtment = konekcija.createStatement();
            ResultSet rezultat = stejtment.executeQuery(prikazivanjeIzBaze);
            Proizvodi kafeDodavanje;
            while(rezultat.next()){
                kafeDodavanje = new Proizvodi(rezultat.getInt("id"),rezultat.getInt("naStanju"),rezultat.getString("proizvod"),rezultat.getFloat("cijena"),rezultat.getString("kategorija"));
                prikazListeKafa.add(kafeDodavanje);
            }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
      
     return prikazListeKafa;   
    }
    
    public void prikazivanjeKafaUTabeli(){
        
        ArrayList<Proizvodi> lista = prikazListeKafe();
        DefaultTableModel ispisUTabeli = (DefaultTableModel)tabelaProizvoda.getModel();
        Object[] red = new Object[6];
        for(int i=0;i<lista.size(); i++){
            
            red[0] = lista.get(i).getId();
            red[1] = lista.get(i).getNaStanju();
            red[2] = lista.get(i).getProizvod();
            red[3] = lista.get(i).getCijena();
            red[4] = lista.get(i).getKategorija();
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
        dodajNazivProizvodaUBazu_unos = new javax.swing.JTextField();
        dodajNazivProizvodaUBazu_tekst = new javax.swing.JLabel();
        dodajCijenuProizvodaUBazu_tekst = new javax.swing.JLabel();
        dodajCijenuProizvodaUBazu_unos = new javax.swing.JTextField();
        kmMalaPivo = new javax.swing.JLabel();
        resetujPolja_dugme = new javax.swing.JButton();
        tabelaSkrol = new javax.swing.JScrollPane();
        tabelaProizvoda = new javax.swing.JTable();
        prikaziPiva_dugme = new javax.swing.JButton();
        prikaziVina_dugme = new javax.swing.JButton();
        prikaziZestoka_dugme = new javax.swing.JButton();
        prikaziKafe_dugme = new javax.swing.JButton();
        prikaziSokove_dugme = new javax.swing.JButton();
        dodajKategorijuProizvodaUBazu_tekst = new javax.swing.JLabel();
        izborKategorijeProizvoda_unos = new javax.swing.JComboBox<>();
        dodajUBazuProizvod = new javax.swing.JButton();
        brisanjeProizvodaIzBaze_dugme = new javax.swing.JButton();
        promijeniPodatke = new javax.swing.JButton();
        sacuvajIzmjene = new javax.swing.JButton();
        redniBrojProizvoda_unos = new javax.swing.JTextField();
        redniBrojProizvoda_tekst = new javax.swing.JLabel();
        ponistiIzmjene = new javax.swing.JButton();
        unosKolicineProizvoda_tekst = new javax.swing.JLabel();
        unosKolicineProizvoda_unos = new javax.swing.JTextField();

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
        dodavanjeTekst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/listaproizvoda.png"))); // NOI18N
        dodavanjeTekst.setText("Unesite proizvod u bazu ili obrišite proizvod iz baze");
        dodavanjeTekst.setToolTipText(null);
        dodavanjeTekst.setName("Dodavanje"); // NOI18N

        dodajNazivProizvodaUBazu_unos.setBackground(new java.awt.Color(27, 68, 115));
        dodajNazivProizvodaUBazu_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajNazivProizvodaUBazu_unos.setForeground(new java.awt.Color(224, 220, 211));
        dodajNazivProizvodaUBazu_unos.setToolTipText(null);
        dodajNazivProizvodaUBazu_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dodajNazivProizvodaUBazu_unos.setName("Unos naziva piva"); // NOI18N

        dodajNazivProizvodaUBazu_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajNazivProizvodaUBazu_tekst.setForeground(new java.awt.Color(224, 220, 211));
        dodajNazivProizvodaUBazu_tekst.setText("Unesite naziv proizvoda:");
        dodajNazivProizvodaUBazu_tekst.setToolTipText(null);
        dodajNazivProizvodaUBazu_tekst.setName("Unesite naziv proizvoda"); // NOI18N

        dodajCijenuProizvodaUBazu_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajCijenuProizvodaUBazu_tekst.setForeground(new java.awt.Color(224, 220, 211));
        dodajCijenuProizvodaUBazu_tekst.setText("Unesite cijenu proizvoda:");
        dodajCijenuProizvodaUBazu_tekst.setToolTipText(null);
        dodajCijenuProizvodaUBazu_tekst.setName("Unesite cijenu proizvoda"); // NOI18N

        dodajCijenuProizvodaUBazu_unos.setBackground(new java.awt.Color(27, 68, 115));
        dodajCijenuProizvodaUBazu_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajCijenuProizvodaUBazu_unos.setForeground(new java.awt.Color(224, 220, 211));
        dodajCijenuProizvodaUBazu_unos.setToolTipText(null);
        dodajCijenuProizvodaUBazu_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dodajCijenuProizvodaUBazu_unos.setName("Unos cijene proizvoda"); // NOI18N

        kmMalaPivo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        kmMalaPivo.setForeground(new java.awt.Color(224, 220, 211));
        kmMalaPivo.setText("KM");
        kmMalaPivo.setToolTipText(null);
        kmMalaPivo.setName("KM mali"); // NOI18N

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

        tabelaProizvoda.setBackground(new java.awt.Color(27, 88, 138));
        tabelaProizvoda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(36, 120, 189), 3, true));
        tabelaProizvoda.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        tabelaProizvoda.setForeground(new java.awt.Color(224, 220, 211));
        tabelaProizvoda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Redni broj", "Na stanju", "Proizvod", "Cijena", "Kategorija"
            }
        ));
        tabelaProizvoda.setToolTipText(null);
        tabelaProizvoda.setRowHeight(28);
        tabelaSkrol.setViewportView(tabelaProizvoda);

        prikaziPiva_dugme.setBackground(new java.awt.Color(27, 88, 138));
        prikaziPiva_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        prikaziPiva_dugme.setForeground(new java.awt.Color(224, 220, 211));
        prikaziPiva_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/pivo.png"))); // NOI18N
        prikaziPiva_dugme.setText("Piva");
        prikaziPiva_dugme.setToolTipText(null);
        prikaziPiva_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        prikaziPiva_dugme.setName("Očisti polja"); // NOI18N
        prikaziPiva_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziPiva_dugmeActionPerformed(evt);
            }
        });

        prikaziVina_dugme.setBackground(new java.awt.Color(27, 88, 138));
        prikaziVina_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        prikaziVina_dugme.setForeground(new java.awt.Color(224, 220, 211));
        prikaziVina_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/vino.png"))); // NOI18N
        prikaziVina_dugme.setText("Vina");
        prikaziVina_dugme.setToolTipText(null);
        prikaziVina_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        prikaziVina_dugme.setName("Očisti polja"); // NOI18N
        prikaziVina_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziVina_dugmeActionPerformed(evt);
            }
        });

        prikaziZestoka_dugme.setBackground(new java.awt.Color(27, 88, 138));
        prikaziZestoka_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        prikaziZestoka_dugme.setForeground(new java.awt.Color(224, 220, 211));
        prikaziZestoka_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/zestoko.png"))); // NOI18N
        prikaziZestoka_dugme.setText("Žestoka");
        prikaziZestoka_dugme.setToolTipText(null);
        prikaziZestoka_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        prikaziZestoka_dugme.setName("Očisti polja"); // NOI18N
        prikaziZestoka_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziZestoka_dugmeActionPerformed(evt);
            }
        });

        prikaziKafe_dugme.setBackground(new java.awt.Color(27, 88, 138));
        prikaziKafe_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        prikaziKafe_dugme.setForeground(new java.awt.Color(224, 220, 211));
        prikaziKafe_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/kafa.png"))); // NOI18N
        prikaziKafe_dugme.setText("Kafe");
        prikaziKafe_dugme.setToolTipText(null);
        prikaziKafe_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        prikaziKafe_dugme.setName("Očisti polja"); // NOI18N
        prikaziKafe_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziKafe_dugmeActionPerformed(evt);
            }
        });

        prikaziSokove_dugme.setBackground(new java.awt.Color(27, 88, 138));
        prikaziSokove_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        prikaziSokove_dugme.setForeground(new java.awt.Color(224, 220, 211));
        prikaziSokove_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/sok.png"))); // NOI18N
        prikaziSokove_dugme.setText("Sokovi");
        prikaziSokove_dugme.setToolTipText(null);
        prikaziSokove_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        prikaziSokove_dugme.setName("Očisti polja"); // NOI18N
        prikaziSokove_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziSokove_dugmeActionPerformed(evt);
            }
        });

        dodajKategorijuProizvodaUBazu_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        dodajKategorijuProizvodaUBazu_tekst.setForeground(new java.awt.Color(224, 220, 211));
        dodajKategorijuProizvodaUBazu_tekst.setText("Kategorija proizvoda:");
        dodajKategorijuProizvodaUBazu_tekst.setToolTipText(null);
        dodajKategorijuProizvodaUBazu_tekst.setName("Unesite cijenu proizvoda"); // NOI18N

        izborKategorijeProizvoda_unos.setBackground(new java.awt.Color(27, 68, 115));
        izborKategorijeProizvoda_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        izborKategorijeProizvoda_unos.setForeground(new java.awt.Color(27, 68, 115));
        izborKategorijeProizvoda_unos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kafe", "Piva", "Vina", "Sokovi", "Zestoka" }));

        dodajUBazuProizvod.setBackground(new java.awt.Color(27, 88, 138));
        dodajUBazuProizvod.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        dodajUBazuProizvod.setForeground(new java.awt.Color(224, 220, 211));
        dodajUBazuProizvod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/dodaj.png"))); // NOI18N
        dodajUBazuProizvod.setText("Dodaj proizvod u bazu");
        dodajUBazuProizvod.setToolTipText(null);
        dodajUBazuProizvod.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        dodajUBazuProizvod.setName("Očisti polja"); // NOI18N
        dodajUBazuProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajUBazuProizvodActionPerformed(evt);
            }
        });

        brisanjeProizvodaIzBaze_dugme.setBackground(new java.awt.Color(27, 88, 138));
        brisanjeProizvodaIzBaze_dugme.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        brisanjeProizvodaIzBaze_dugme.setForeground(new java.awt.Color(224, 220, 211));
        brisanjeProizvodaIzBaze_dugme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/obrisi.png"))); // NOI18N
        brisanjeProizvodaIzBaze_dugme.setText("Ukloni proizvod iz baze");
        brisanjeProizvodaIzBaze_dugme.setToolTipText(null);
        brisanjeProizvodaIzBaze_dugme.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        brisanjeProizvodaIzBaze_dugme.setName("Očisti polja"); // NOI18N
        brisanjeProizvodaIzBaze_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brisanjeProizvodaIzBaze_dugmeActionPerformed(evt);
            }
        });

        promijeniPodatke.setBackground(new java.awt.Color(27, 88, 138));
        promijeniPodatke.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        promijeniPodatke.setForeground(new java.awt.Color(224, 220, 211));
        promijeniPodatke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kasa/slike/osvjezi.png"))); // NOI18N
        promijeniPodatke.setText("Uredi podatke o proizvodu");
        promijeniPodatke.setToolTipText(null);
        promijeniPodatke.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 220, 211), 3, true));
        promijeniPodatke.setName("Očisti polja"); // NOI18N
        promijeniPodatke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promijeniPodatkeActionPerformed(evt);
            }
        });

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

        redniBrojProizvoda_unos.setBackground(new java.awt.Color(27, 68, 115));
        redniBrojProizvoda_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        redniBrojProizvoda_unos.setForeground(new java.awt.Color(255, 0, 0));
        redniBrojProizvoda_unos.setToolTipText(null);
        redniBrojProizvoda_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        redniBrojProizvoda_unos.setDisabledTextColor(new java.awt.Color(27, 88, 138));
        redniBrojProizvoda_unos.setEnabled(false);
        redniBrojProizvoda_unos.setName("Unos naziva piva"); // NOI18N
        redniBrojProizvoda_unos.setSelectedTextColor(new java.awt.Color(27, 88, 138));

        redniBrojProizvoda_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        redniBrojProizvoda_tekst.setForeground(new java.awt.Color(224, 220, 211));
        redniBrojProizvoda_tekst.setText("Redni broj proizvoda:");
        redniBrojProizvoda_tekst.setToolTipText(null);
        redniBrojProizvoda_tekst.setName("Unesite naziv proizvoda"); // NOI18N

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

        unosKolicineProizvoda_tekst.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        unosKolicineProizvoda_tekst.setForeground(new java.awt.Color(224, 220, 211));
        unosKolicineProizvoda_tekst.setText("Komada na stanju:");
        unosKolicineProizvoda_tekst.setToolTipText(null);
        unosKolicineProizvoda_tekst.setName("Unesite cijenu proizvoda"); // NOI18N

        unosKolicineProizvoda_unos.setBackground(new java.awt.Color(27, 68, 115));
        unosKolicineProizvoda_unos.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        unosKolicineProizvoda_unos.setForeground(new java.awt.Color(224, 220, 211));
        unosKolicineProizvoda_unos.setToolTipText(null);
        unosKolicineProizvoda_unos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        unosKolicineProizvoda_unos.setName("Unos cijene proizvoda"); // NOI18N

        javax.swing.GroupLayout glavniPanelLayout = new javax.swing.GroupLayout(glavniPanel);
        glavniPanel.setLayout(glavniPanelLayout);
        glavniPanelLayout.setHorizontalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glavniPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(dodajUBazuProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glavniPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(redniBrojProizvoda_tekst, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dodajNazivProizvodaUBazu_tekst, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dodajCijenuProizvodaUBazu_tekst, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(unosKolicineProizvoda_tekst, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dodajKategorijuProizvodaUBazu_tekst, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(glavniPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dodajNazivProizvodaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(izborKategorijeProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redniBrojProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                                .addComponent(dodajCijenuProizvodaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(kmMalaPivo))
                                            .addComponent(unosKolicineProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glavniPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resetujPolja_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(sacuvajIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ponistiIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(glavniPanelLayout.createSequentialGroup()
                                    .addComponent(promijeniPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(brisanjeProizvodaIzBaze_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tabelaSkrol, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(glavniPanelLayout.createSequentialGroup()
                                .addComponent(prikaziPiva_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prikaziVina_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prikaziZestoka_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prikaziSokove_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prikaziKafe_dugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(dodavanjeTekst)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        glavniPanelLayout.setVerticalGroup(
            glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(glavniPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(dodavanjeTekst)
                .addGap(64, 64, 64)
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, glavniPanelLayout.createSequentialGroup()
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redniBrojProizvoda_tekst)
                            .addComponent(redniBrojProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prikaziVina_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prikaziPiva_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prikaziZestoka_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prikaziSokove_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prikaziKafe_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tabelaSkrol, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brisanjeProizvodaIzBaze_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(promijeniPodatke, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(glavniPanelLayout.createSequentialGroup()
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajNazivProizvodaUBazu_tekst)
                            .addComponent(dodajNazivProizvodaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajCijenuProizvodaUBazu_tekst)
                            .addComponent(dodajCijenuProizvodaUBazu_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kmMalaPivo))
                        .addGap(18, 18, 18)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unosKolicineProizvoda_tekst)
                            .addComponent(unosKolicineProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajKategorijuProizvodaUBazu_tekst)
                            .addComponent(izborKategorijeProizvoda_unos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sacuvajIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponistiIzmjene, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(glavniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodajUBazuProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetujPolja_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );

        dodavanjeTekst.getAccessibleContext().setAccessibleName("Dodavanje");
        dodavanjeTekst.getAccessibleContext().setAccessibleDescription("Dodavanje");
        kmMalaPivo.getAccessibleContext().setAccessibleName("KM mali");
        kmMalaPivo.getAccessibleContext().setAccessibleDescription("KM mali");

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

        dodajCijenuProizvodaUBazu_unos.setText("");
        dodajNazivProizvodaUBazu_unos.setText("");
        unosKolicineProizvoda_unos.setText("");
        
    }//GEN-LAST:event_resetujPolja_dugmeActionPerformed

    private void prikaziPiva_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziPiva_dugmeActionPerformed
       
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        prikazivanjePivaUTabeli();
        
    }//GEN-LAST:event_prikaziPiva_dugmeActionPerformed

    private void prikaziVina_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziVina_dugmeActionPerformed
        
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        prikazivanjeVinaUTabeli();
        
    }//GEN-LAST:event_prikaziVina_dugmeActionPerformed

    private void prikaziZestoka_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziZestoka_dugmeActionPerformed
        
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        prikazivanjeZestokogUTabeli();
        
    }//GEN-LAST:event_prikaziZestoka_dugmeActionPerformed

    private void prikaziKafe_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziKafe_dugmeActionPerformed
        
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        prikazivanjeKafaUTabeli();
        
    }//GEN-LAST:event_prikaziKafe_dugmeActionPerformed

    private void prikaziSokove_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziSokove_dugmeActionPerformed
        
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        prikazivanjeSokovaUTabeli();
        
    }//GEN-LAST:event_prikaziSokove_dugmeActionPerformed

    private void dodajUBazuProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajUBazuProizvodActionPerformed
        
         if(dodajNazivProizvodaUBazu_unos.getText().equals("")){
                
                neuspjesnoDodavanjeProzor iskace = new neuspjesnoDodavanjeProzor();
                iskace.setVisible(true);
                
            }else {
        
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            String unosUBazu = "Insert into proizvodi(naStanju, proizvod, cijena, kategorija)values(?,?,?,?)";
            PreparedStatement ubacivanjeUBazu = konekcija.prepareStatement(unosUBazu);
            ubacivanjeUBazu.setString(1, unosKolicineProizvoda_unos.getText());
            ubacivanjeUBazu.setString(2, dodajNazivProizvodaUBazu_unos.getText());
            ubacivanjeUBazu.setString(3, dodajCijenuProizvodaUBazu_unos.getText());
            ubacivanjeUBazu.setString(4, izborKategorijeProizvoda_unos.getSelectedItem().toString());
            ubacivanjeUBazu.executeUpdate();
            DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
            osvjezivanjeTabele.setRowCount(0);
            
            if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Piva"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                prikazivanjePivaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Vina"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                prikazivanjeVinaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Sokovi"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                prikazivanjeSokovaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Kafe"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                prikazivanjeKafaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Zestoka"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                prikazivanjeZestokogUTabeli();
                
            }
            
             uspjesnoDodavanjeProzor iskace = new uspjesnoDodavanjeProzor();
             iskace.setVisible(true);
            
        } catch (Exception e) {
                
                neuspjesnoDodavanjeProzor iskace = new neuspjesnoDodavanjeProzor();
                iskace.setVisible(true);
        }
        }
        
    }//GEN-LAST:event_dodajUBazuProizvodActionPerformed

    private void brisanjeProizvodaIzBaze_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brisanjeProizvodaIzBaze_dugmeActionPerformed
       
        Connection konekcija = null;
        Statement stejtment = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Povezivanje sa databazom...");
            konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
            int red = tabelaProizvoda.getSelectedRow();
            String pripremaZaBrisanje=(tabelaProizvoda.getModel().getValueAt(red, 0).toString());
            String upitZaBrisanje = "Delete from proizvodi where id="+pripremaZaBrisanje;
            PreparedStatement brisanjeIzBase = konekcija.prepareStatement(upitZaBrisanje);
            brisanjeIzBase.executeUpdate();
            DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
            osvjezivanjeTabele.setRowCount(0);
           
            if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Piva"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Piva");
                prikazivanjePivaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Vina"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Vina");
                prikazivanjeVinaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Sokovi"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Sokovi");
                prikazivanjeSokovaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Kafe"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Kafe");
                prikazivanjeKafaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Zestoka"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Zestoka");
                prikazivanjeZestokogUTabeli();
                
            }
            
             uspjesnoBrisanjeProzor iskace = new uspjesnoBrisanjeProzor();
             iskace.setVisible(true);

        
        } catch (Exception e) {
            
            neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
            iskace.setVisible(true);
            
        }  
        
    }//GEN-LAST:event_brisanjeProizvodaIzBaze_dugmeActionPerformed

    private void promijeniPodatkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promijeniPodatkeActionPerformed


    if(tabelaProizvoda.getSelectionModel().isSelectionEmpty()){    
        
        neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
        iskace.setVisible(true);
        
    }else{
        int i = tabelaProizvoda.getSelectedRow();
        TableModel model = tabelaProizvoda.getModel();
        redniBrojProizvoda_unos.setText(model.getValueAt(i, 0).toString());
        unosKolicineProizvoda_unos.setText(model.getValueAt(i, 1).toString());
        dodajNazivProizvodaUBazu_unos.setText(model.getValueAt(i, 2).toString());
        dodajCijenuProizvodaUBazu_unos.setText(model.getValueAt(i, 3).toString());
        izborKategorijeProizvoda_unos.setSelectedItem(model.getValueAt(i, 4));
        sacuvajIzmjene.setVisible(true);
        redniBrojProizvoda_unos.setVisible(true);
        redniBrojProizvoda_tekst.setVisible(true);
        ponistiIzmjene.setVisible(true);
        dodajUBazuProizvod.setVisible(false);
        resetujPolja_dugme.setVisible(false);
        
    }
    }//GEN-LAST:event_promijeniPodatkeActionPerformed

    private void sacuvajIzmjeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajIzmjeneActionPerformed
        
       String redniBrojproizvoda = redniBrojProizvoda_unos.getText();
       int redniBroj = Integer.parseInt(redniBrojproizvoda); 
        
       Connection konekcija = null;
       Statement stejtment = null;

        try{

        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Povezivanje sa databazom...");
        konekcija = DriverManager.getConnection(server_databaze,korisnik_databaze,sifra_databaze);
        String unosUBazu = "UPDATE proizvodi SET naStanju=?, proizvod=?, cijena=?, kategorija=? where id="+redniBroj;
        PreparedStatement ubacivanjeUBazu = konekcija.prepareStatement(unosUBazu);
        ubacivanjeUBazu.setString(1, unosKolicineProizvoda_unos.getText());
        ubacivanjeUBazu.setString(2, dodajNazivProizvodaUBazu_unos.getText());
        ubacivanjeUBazu.setString(3, dodajCijenuProizvodaUBazu_unos.getText());
        ubacivanjeUBazu.setString(4, izborKategorijeProizvoda_unos.getSelectedItem().toString());
        ubacivanjeUBazu.executeUpdate();
        DefaultTableModel osvjezivanjeTabele = (DefaultTableModel)tabelaProizvoda.getModel();
        osvjezivanjeTabele.setRowCount(0);
        
         if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Piva"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Piva");
                prikazivanjePivaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Vina"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Vina");
                prikazivanjeVinaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Sokovi"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Sokovi");
                prikazivanjeSokovaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Kafe"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Kafe");
                prikazivanjeKafaUTabeli();
                
            }else if(izborKategorijeProizvoda_unos.getSelectedItem().toString() == "Zestoka"){
                
                dodajCijenuProizvodaUBazu_unos.setText("");
                dodajNazivProizvodaUBazu_unos.setText("");
                unosKolicineProizvoda_unos.setText("");
                izborKategorijeProizvoda_unos.setSelectedItem("Zestoka");
                prikazivanjeZestokogUTabeli();
                
            }
         
        uspjesnoAzuriranje iskace = new uspjesnoAzuriranje();
        iskace.setVisible(true);
        
        } catch (Exception e) {
            
            neuspjesnoBrisanjeProzor iskace = new neuspjesnoBrisanjeProzor();
            iskace.setVisible(true);
            
        }  
        
        dodajUBazuProizvod.setVisible(true);
        resetujPolja_dugme.setVisible(true);
        sacuvajIzmjene.setVisible(false);
        redniBrojProizvoda_unos.setVisible(false);
        redniBrojProizvoda_tekst.setVisible(false);
        ponistiIzmjene.setVisible(false);
        
    }//GEN-LAST:event_sacuvajIzmjeneActionPerformed

    private void ponistiIzmjeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponistiIzmjeneActionPerformed
        
        dodajCijenuProizvodaUBazu_unos.setText("");
        dodajNazivProizvodaUBazu_unos.setText("");
        unosKolicineProizvoda_unos.setText("");
        izborKategorijeProizvoda_unos.setSelectedItem("Piva");
        redniBrojProizvoda_unos.setText("");
        dodajUBazuProizvod.setVisible(true);
        resetujPolja_dugme.setVisible(true);
        sacuvajIzmjene.setVisible(false);
        redniBrojProizvoda_unos.setVisible(false);
        redniBrojProizvoda_tekst.setVisible(false);
        ponistiIzmjene.setVisible(false);
        
    }//GEN-LAST:event_ponistiIzmjeneActionPerformed

    int kolicina = 1;
    
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
            java.util.logging.Logger.getLogger(Unos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brisanjeProizvodaIzBaze_dugme;
    private javax.swing.JLabel dodajCijenuProizvodaUBazu_tekst;
    private javax.swing.JTextField dodajCijenuProizvodaUBazu_unos;
    private javax.swing.JLabel dodajKategorijuProizvodaUBazu_tekst;
    private javax.swing.JLabel dodajNazivProizvodaUBazu_tekst;
    private javax.swing.JTextField dodajNazivProizvodaUBazu_unos;
    private javax.swing.JButton dodajUBazuProizvod;
    private javax.swing.JLabel dodavanjeTekst;
    private javax.swing.JPanel glavniPanel;
    private javax.swing.JComboBox<String> izborKategorijeProizvoda_unos;
    private javax.swing.JLabel kmMalaPivo;
    private javax.swing.JButton ponistiIzmjene;
    private javax.swing.JButton prikaziKafe_dugme;
    private javax.swing.JButton prikaziPiva_dugme;
    private javax.swing.JButton prikaziSokove_dugme;
    private javax.swing.JButton prikaziVina_dugme;
    private javax.swing.JButton prikaziZestoka_dugme;
    private javax.swing.JButton promijeniPodatke;
    private javax.swing.JLabel redniBrojProizvoda_tekst;
    private javax.swing.JTextField redniBrojProizvoda_unos;
    private javax.swing.JButton resetujPolja_dugme;
    private javax.swing.JButton sacuvajIzmjene;
    private javax.swing.JTable tabelaProizvoda;
    private javax.swing.JScrollPane tabelaSkrol;
    private javax.swing.JLabel unosKolicineProizvoda_tekst;
    private javax.swing.JTextField unosKolicineProizvoda_unos;
    // End of variables declaration//GEN-END:variables

}