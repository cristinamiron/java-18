public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptunghiA= new Dreptunghi(20, 10);
        System.out.println("Aria obiect dreptunghiA este:"+dreptunghiA.getAria());
        System.out.println("Perim obiect dreptungiA este:"+dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB= new Dreptunghi(40, 40);
        System.out.println("Diagonala dreptungiB este:"+dreptunghiA.getDiagonala());
    }
}
