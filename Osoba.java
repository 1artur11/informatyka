public class Osoba {
    private String imie;
    private int wiek;

    public Osoba() {
        this.wiek = wiek;
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String przedstawSie() {
        return "Cześć, mam na imię " + imie + " i mam " + wiek + " lat.";
    }
}