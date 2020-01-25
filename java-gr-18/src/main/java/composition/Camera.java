package Composition;

public class Camera {
    String culoarea;
    private int marime;


    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }
    //constructor
    public Camera(){
        this.culoarea= "alb";
        this.marime= 10;


    }
}
