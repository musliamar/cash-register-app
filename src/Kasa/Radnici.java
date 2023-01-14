package Kasa;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class Radnici {
    
    private int redniBroj;
    private String uposlenik;
    private String sifra;
    private String daLiJeAdministrator;
    
    public Radnici(int redniBroj, String uposlenik, String sifra, String daLiJeAdministrator){
        
        this.redniBroj = redniBroj;
        this.uposlenik = uposlenik;
        this.sifra = sifra;
        this.daLiJeAdministrator = daLiJeAdministrator;
        
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }
    
    

    public String getUposlenik() {
        return uposlenik;
    }

    public void setUposlenik(String uposlenik) {
        this.uposlenik = uposlenik;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getDaLiJeAdministrator() {
        return daLiJeAdministrator;
    }

    public void setDaLiJeAdministrator(String daLiJeAdministrator) {
        this.daLiJeAdministrator = daLiJeAdministrator;
    }

}
