package periytymisesimerkit;

// Lainatili periytyy tililuokasta
// jos periytymisestä muistaa vain yhden asian
// tämän tunnin jälkee
// MUISTA EXTENDS AVAIN SANA

// EXTENDS ottaa tiedot Tili luokasta
public class LainaTili extends Tili {
    private double korko;
    private int lainaAikaVuosia;

    public LainaTili() {

    }

   
    // SUPER kutsuu yliluokkaa - tässä sen constructoria
    public LainaTili(double saldo, String nimi, String tilinumero, double korko, int lainaAikaVuosia) {
        super(saldo, nimi, tilinumero);
        this.korko = korko;
        this.lainaAikaVuosia = lainaAikaVuosia;
    }
    public double getKorko() {
        return korko;
    }
    public void setKorko(double korko) {
        this.korko = korko;
    }
    public int getLainaAikaVuosia() {
        return lainaAikaVuosia;
    }
    public void setLainaAikaVuosia(int lainaAikaVuosia) {
        this.lainaAikaVuosia = lainaAikaVuosia;
    }

    

}
