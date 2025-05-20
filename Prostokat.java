class Prostokat {
    private double szerokosc;
    private double wysokosc;

    public Prostokat() {
        this.szerokosc = 1.0;
        this.wysokosc = 1.0;
    }

    public Prostokat(double szerokosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double obliczPole() {
        return wysokosc * szerokosc;
    }

    public String obliczPole(String jednostka) {
        double pole = szerokosc * wysokosc;
        return pole + " " + jednostka + "²";
    }

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat();
        Prostokat p2 = new Prostokat(4.5, 2.0);

        System.out.println("Pole prostokąta 1: " + p1.obliczPole("cm"));

        System.out.println("Pole prostokąta 2: " + p2.obliczPole("m"));
    }
}