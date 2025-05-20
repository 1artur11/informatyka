public class ProduktMain {
    public static void main(String[] args) {
        Produkt produkt1 = new Produkt("Woda", 3, 5);
        Produkt produkt2 = new Produkt("Jabłka", 7, 9);

        produkt1.wyswietlInformacje();
        produkt2.wyswietlInformacje();
    }
}
