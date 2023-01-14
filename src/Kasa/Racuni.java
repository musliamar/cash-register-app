package Kasa;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class Racuni {
    
    private String brojRacuna;
    private String nazivFajla;
    private String datum;
    private String vrijeme;
    private String radnik;
    private String smjena;
    
    public Racuni(String brojRacuna, String nazivFajla, String datum, String vrijeme, String radnik, String smjena){
        
        this.brojRacuna = brojRacuna;
        this.nazivFajla = nazivFajla;
        this.datum = datum;
        this.vrijeme = vrijeme;
        this.radnik = radnik;
        this.smjena = smjena;
        
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getNazivFajla() {
        return nazivFajla;
    }

    public void setNazivFajla(String nazivFajla) {
        this.nazivFajla = nazivFajla;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(String vrijeme) {
        this.vrijeme = vrijeme;
    }

    public String getRadnik() {
        return radnik;
    }

    public void setRadnik(String radnik) {
        this.radnik = radnik;
    }

    public String getSmjena() {
        return smjena;
    }

    public void setSmjena(String smjena) {
        this.smjena = smjena;
    }
     
}
