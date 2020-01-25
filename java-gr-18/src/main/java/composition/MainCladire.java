package Composition;

public class MainCladire {
    public static void main(String[] args) {
        Cladire cladireaA= new Cladire("CBC");
        cladireaA.getCamera().setMarime(100);
        cladireaA.getCamera().setCuloarea("rosie");

        System.out.println(cladireaA.getNume()+ "are o camera de culoarea:"+ cladireaA.getCamera().getCuloarea());
    }
}
