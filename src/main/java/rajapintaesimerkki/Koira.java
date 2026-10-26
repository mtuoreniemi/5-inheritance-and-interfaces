package rajapintaesimerkki;

//JOs luokan pitää toteuttaa rajapinta käytä sanaa implements
public class Koira implements Aantelee{

    private String nimi;
    private int ika;
    
    public String aantele() {
        return "hauhau";
    }
    
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }


}
