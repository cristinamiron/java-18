public class Operatori {
	public static void main (String args []) {
	int a = 5;
	int b = 2;
	
	a = a + 1; // sau varianta prescuratata: a++
	int c = a++;
	/*
	int c = a ;
	a = a+1;
	*/

	int d = ++b;
	/*
	int b = b +1;
	int d = ;
	*/
	System.out.println("a: " + a+ "b: " + b + "c: " + c + "d: " +d);

	// if / else in varianta prescurtata

	if (a > 100 ) {
		System.out.println("a este > decat 100");
	}else {
		System.out.println("a nu este mai > decat 100");
	}
		System.out.println(a > 100 ? "a este > decat 100" : "a nu este mai > decat 100"); // if ? true : false

		// bitwise

		System.out.println("a in binar e : " + Integer.toBinaryString(a));
		System.out.println("b: " + b +" in binar e : " + Integer.toBinaryString(b));
		System.out.println(a&b);
	}
}