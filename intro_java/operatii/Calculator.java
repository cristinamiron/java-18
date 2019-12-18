public class Calculator {
	public static void main (String args[]) {
		// args va arata 1+2 sau 4*5; pe pozitia 0 a arrayului avem 1. pe pozitia 1 avem + iar pe pozitia 2 avem valoarea 2
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		char c = args[1].charAt(0);
		calculeaza (a,b,c);

	}

	public static void calculeaza(int a, int b, char c) {
		switch(c) {
			case '+':
				int suma = a + b;
				System.out.println(suma);
			break;
			case '-':
				int dif = a - b;
				System.out.println(dif);
			break;
			case '*':
			int inm = a * b;
				System.out.println(inm);
			break;
			case '/':
			int imp = a / b;
				System.out.println(imp);
			break;
			default:
				System.out.println("mai incercati");
			}
	}
}