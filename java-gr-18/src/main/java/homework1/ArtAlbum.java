package homework1;

public class ArtAlbum extends Book {
    //varianta 1
    private String calitateHartie;

    public String getCalitateHartie() {
        return calitateHartie;
    }

    public void setCalitateHartie(String calitateHartie) {
        this.calitateHartie = calitateHartie;
    }


    // varianta 2
    enum CalitateHartie {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        CalitateHartie myVar = CalitateHartie.MEDIUM;
        System.out.println(myVar);
    }
}
