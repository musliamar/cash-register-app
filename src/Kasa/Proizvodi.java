package Kasa;

/**
 *
 * @author Amar Musli, 2017/210017 - Fakultet za računarstvo i informatiku, Univerzitet Sinergija, Bijeljina.
 */
public class Proizvodi {
    
    private int id;
    private int naStanju;
    private float cijena;
    private String proizvod;
    private String kategorija;
    
    public Proizvodi(int id, int naStanju, String proizvod, float cijena, String kategorija){
        
        this.id = id;
        this.cijena = cijena;
        this.proizvod = proizvod;
        this.kategorija = kategorija;
        this.naStanju = naStanju;
        
    }

    public float getCijena() {
        return cijena;
    }

    public void setCijena(float cijena) {
        this.cijena = cijena;
    }

    public String getProizvod() {
        return proizvod;
    }

    public void setProizvod(String proizvod) {
        this.proizvod = proizvod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public int getNaStanju() {
        return naStanju;
    }

    public void setNaStanju(int naStanju) {
        this.naStanju = naStanju;
    }
    
    
     
}
