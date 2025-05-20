class Produkt {
    private String nazwa;
    private double  cena;
    private int ilosc;

    public Produkt(String nazwa, double cena, int ilosc) {
        this.nazwa = nazwa;
        setCena(cena);
        setIlosc(ilosc);
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena < 0) {
            System.out.println("Błąd: nie można ustawić wartości ujemnej");
        } else {
            this.cena = cena;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        if (ilosc < 0) {
            System.out.println("Błąd: nie można ustawić wartości ujemnej");
        } else {
            this.ilosc = ilosc;
        }
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + getNazwa());
        System.out.println("Cena: " + getCena() + " zł");
        System.out.println("Ilość: " + getIlosc() + " szt.");
    }
}
