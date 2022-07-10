import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		System.out.print("Introduce un numero ");
		
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		
		contarDigitos(n);
	}
	
	public static void contarDigitos(int x) {
		String s = Integer.toString(x);
		
		System.out.println("El numero instroduit té " + s.length() + " digits");
	}

}
