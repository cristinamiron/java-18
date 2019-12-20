public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "red");
        System.out.println("Aria obiectului circle1 ests:" + circle1.getAria());
        System.out.println("Aria Perimetrului obiectului circle1 este:" + circle1.getPerimeter());
        System.out.println("Culoarea obiectului circle1 este:" + circle1.color);

        Circle circle2 = new Circle(7, "green");
        System.out.println("Aria obiectului circle2 ests:" + circle2.getAria());
        System.out.println("Aria Perimetrului obiectului circle2 este:" + circle2.getPerimeter());
        System.out.println("Culoarea obiectului circle2 este:" + circle2.color);

        Circle circle3 = new Circle(8, "black");
        System.out.println("Aria obiectului circle3 ests:" + circle3.getAria());
        System.out.println("Aria Perimetrului obiectului circle3 este:" + circle3.getPerimeter());
        System.out.println("Culoarea obiectului circle3 este:" + circle3.color);

        Circle circle4 = new Circle(10, "pink");
        System.out.println("APELARE METODE DIN OBJECT CLASS");
        System.out.println(circle4);
        System.out.println(circle4.toString());

        createArrayOfCircle();
    }
        public static void createArrayOfCircle(){
            Circle [] circleArray= new Circle[10];
            for (int i =0; i<=circleArray.length-1; i++) {
                if (i%2==0) {
                    Circle circleEven = new Circle (i+1,"red");
                    circleArray[i] = circleEven;
                } else {
                    Circle circleOdd = new Circle (i+1, "green");
                    circleArray[i]= circleOdd;
                }
            }

            //afisare culori ale cercurilor dinarray utilizand for each
            for( Circle itemCircle:circleArray){
                System.out.println(itemCircle.color);
                //in dreapta  array-ul si in stanga itemul/elementele array-ului
            }
        }
    }

