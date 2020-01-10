public class Dreptunghi {
    private double lungime;
    private double latime;

    //constructor
    public Dreptunghi(double lungime, double latime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    //metode
    public double getAria() {
        return lungime * latime;
    }

    public double getPerimetru() {
        return 2 * (lungime + latime);
    }

    public double getDiagonala() {
        return Math.sqrt(lungime * lungime + latime * latime); // sqrt= o metoda staica- poate fi accesata folosind numele clasei
    }
}
