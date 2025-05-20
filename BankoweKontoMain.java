public class BankoweKontoMain {
    public static void main(String[] args) {
        BankoweKonto konto = new BankoweKonto("Kacper Marek", 6802.14);

        System.out.println("Właściciel konta: " + konto.getWłaściciel());
        System.out.println("Saldo początkowe: " + konto.pobierzSaldo() + " zł");

        konto.wplac(700.0);
        konto.wyplac(200.0);

        System.out.println("Saldo końcowe: " + konto.pobierzSaldo() + " zł");
    }
}