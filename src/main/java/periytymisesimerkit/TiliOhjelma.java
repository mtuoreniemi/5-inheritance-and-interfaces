package periytymisesimerkit;

public class TiliOhjelma {
    public static void main(String[] args) {
        // luodaan yksi tili
        Tili tili = new Tili();

        tili.setOmistajanNimi("Miika Tuoreniemi");
        tili.setSaldo(300);
        tili.setTilinumero("FI1315");

        // luodaan lainaTili

        LainaTili lainaTili = new LainaTili();
        // Lainatilillekin voidaan asettaa saldo, vaikka kenttä
        // ei siinä tiedostossa ole
        lainaTili.setSaldo(399000);
        System.out.println("Lainaa tuolla tilillä on " + lainaTili.getSaldo());

        // voidaan selvittää olion ajonaikana tyyppi instanceOf avainsanalla
        
        if (lainaTili instanceof LainaTili) {
            System.out.println("TIli on tyypiltään Lainatili");
            
        }
    }

}
