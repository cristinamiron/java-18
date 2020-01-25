package Composition;

public class Cladire {
    private String nume;
    private Camera camera;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    //constructor
    public Cladire(String nume) {
        this.nume = nume;
        this.camera = new Camera();
    }

    public void setCuloareCamera(String culoare) {
        this.camera.setCuloarea(culoare);
    }

    public void setMarireCamera(int marime) {
        this.camera.setMarime(marime);
    }

}
