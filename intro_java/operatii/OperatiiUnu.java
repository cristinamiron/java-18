public class OperatiiUnu {
	int oVariabilaDeInstanta; // variabila de instanta

	public static void main (String [] args) {
		int a = 0;
		int b = 0;

		double c = 0.0;
		double d = 0.0;

		if (args[0].equals("i")) {

		 a = Integer.parseInt(args[1]); //a este o variabila locala pt ca e in interior metoda; ii dam valoarea de la tastaura prin args
		 b = Integer.parseInt(args[2]); //b este o variabila locala pt ca e in interior metoda;;ii dam valoarea de la tastaura prin args
		
		division (a,b);
		} else if (args[0].equals("d")){
			c= Double.parseDouble (args[1]);
			d= Double.parseDouble (args[2]);

		division(c,d);
	} else {
		System.out.println("args[0] trebuie sa fie i sau d");
}
		
		//division(a,b);//se apeleaza metoda in CC prin java 

}
	public static void division (int a, int b) { //int a si int b= parametri
	if (b== 0) {
		System.out.println("Nu se poate face imprimarea la 0");
}
	else{
	int rez=a/b;
	System.out.println(rez);
	}
}
	public static void division (double a, double b) {
		if(b==0) {
			System.out.println ("Nu se poate face impartirea la 0");
	}
	else {
	double rez=a/b;
	System.out.println(rez);
		}
}
}