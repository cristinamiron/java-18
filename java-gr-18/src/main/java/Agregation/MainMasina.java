package Agregation;

public class MainMasina {

    public static void main(String[] args) {
        //masina VW de culoare alba de capacitate 1 si putere 75
        //afisam mesaj: masina X are culoarea Y si motorul de putere Z si capacitate T

        //creare obiect motor
        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPutere(75);

        //afisare atribute motor

        System.out.println("MotorVW are puterea:" + motorVW.getPutere());
        System.out.println("MotorVW are capacitatea:" + motorVW.getCapacitate());

        //creare obiect masina
        Masina masinaVW = new Masina(motorVW, "VW");
        masinaVW.setCuloare("alb");
        //afisam mesaj: masina X are culoarea Y si motorul de putere Z si capacitate T


        System.out.println("Masina"+masinaVW.getNume()
                +"are culoarea"+masinaVW.getCuloare()
                +"si motorul de putere"+masinaVW.getMotor().getCapacitate()
                +"si capacitate"+masinaVW.getMotor().getCapacitate());

        //daca vrem sa stergem masina
        masinaVW= null;

        //chiar daca obiectul masina a fost distrus, obiectul motor exista inca

    }
}
