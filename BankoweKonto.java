class BankoweKonto {
    private String właściciel;
    private double saldo;

    public BankoweKonto(String właściciel, double saldo) {
        this.właściciel = właściciel;
        this.saldo = saldo;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłacono:  " + kwota + " zł");
        } else {
            System.out.println("Kwota musi być większa od 0.");
        }
    }
    public void wyplac(double kwota) {
        if (kwota > 0 && kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Wypłacono: " + kwota + " zł");
        } else {
            System.out.println("Niewystarczające środki na koncie.");
        }
    }

    public double pobierzSaldo() {
        return saldo;
    }

    public String getWłaściciel() {
        return właściciel;
    }
}
