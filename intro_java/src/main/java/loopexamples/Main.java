package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50, 70, 90};
        afisareElemArray(arrayInt);

        sumaNrArray(arrayInt);
        int numar = 1501;

        inversareNumar(numar);

        //afisare caracterele unui string
        //afisare nr de vocale din string
        String propozitie = "Ana are mere";
        char[] arrayCaractere = propozitie.toCharArray();

        int nrVocale = 0;

        for (char element : arrayCaractere) {
            System.out.println(element);

            if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                nrVocale++;
            }
        }

        System.out.println("Nr vocale din string e :" + nrVocale);
    }

    public static void inversareNumar(int numar) {
        int numarInversat = 0;

        while (numar > 0) {
            numarInversat = numarInversat * 10 + numar % 10;
            numar = numar / 10;
        }

        System.out.println("Numarul inversat este:" + numarInversat);
    }

    private static void afisareElemArray(int[] arrayInt) {
        //afisare elemente array
        for (int elem : arrayInt) {
            System.out.println(elem);
        }
    }

    private static void sumaNrArray(int[] arrayInt) {
        //calculeaza suma in functie de niste conditii:
        //a) daca elem din array==30, nu se va calcula suma
        //b) daca suma depaseste valoarea 100, se intrerupe executia array-ului

        // suma tuturor elementelor dintr-un array: suma= suma+ elem;
        int suma = 0;

        for (int elem : arrayInt) {
            if (elem == 30) {
                continue;
            }
            if (suma > 100) {
                break;
            }

            suma = suma + elem;
            System.out.println("element:" + elem + "suma:" + suma);
        }

        System.out.println("Am iesit din bucla for. Suma finala este: " + suma);
    }
}