package periytymisesimerkit;

// tämä perytymisessä tässä esimerkissä niin sanottu yliluokka 
// eli super class
// Kyseessä pankkitili 

public class Tili {
    //pankkitilin kentöt
    private double saldo;
    private String omistajanNimi;
    private String tilinumero;

    public Tili() {

    }

    public Tili(double saldo, String nimi, String tilinumero) {
        this.saldo = saldo;
        this.omistajanNimi = nimi;
        this.tilinumero = tilinumero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getOmistajanNimi() {
        return omistajanNimi;
    }
    public void setOmistajanNimi(String nimi) {
        this.omistajanNimi = nimi;
    }
    public String getTilinumero() {
        return tilinumero;
    }
    public void setTilinumero(String tilinumero) {
        this.tilinumero = tilinumero;
    }



}


