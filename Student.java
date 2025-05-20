class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private double srednia;

    public Student(String imie, String nazwisko, int numerIndeksu, double srednia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.srednia = srednia;
    }

    public Student(String imie, String nazwisko, int numerIndeksu) {
        this(imie, nazwisko, numerIndeksu, 0.0);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    public void wypiszDane() {
        System.out.println("Student: " + imie + " " + nazwisko + ", indeks: " + numerIndeksu + ", średnia: " + srednia);
    }
}
