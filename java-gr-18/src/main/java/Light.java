public class Light {


    //atributes
    //constante
    public static final int MAX = 100;
    public static final int MIN = 0;
    private int step;// pasul cu care crestem intensitatea becului
    private int intensitateaCurenta;// atribut pe care il folosim doar pt logica mea interna si nu vreau sa fie accesibil din exterior

    //constructor
    public Light(int step) {
        this.step = step;
        this.intensitateaCurenta= 0;
    }

    //metode
    public void on() {
        System.out.println("Intensitatea becului este:" +MAX);
        this.intensitateaCurenta= MAX;
    }

    public void off () {
        System.out.println("Becul este stins.");
        this.intensitateaCurenta= MIN;
    }
    public void brighten () {
        if (intensitateaCurenta+ step<MAX){
            intensitateaCurenta= intensitateaCurenta+step;
            System.out.println("Intensitatea curenta a becului este:" +intensitateaCurenta);
        } else {
            System.out.println("Nu se mai poate creste intensitatea.");
        }

    }
    public void dimen () {
        if (intensitateaCurenta - step > MIN) {
            intensitateaCurenta = intensitateaCurenta - step;
            System.out.println("Intensitatea curenta a becului este:" +intensitateaCurenta);
        } else {
            System.out.println("Becul este stins.");
        }
    }
}
