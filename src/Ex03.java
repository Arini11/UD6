import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();

		if(esPrimo(n)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
	}

	public static boolean esPrimo(int n) {
		for(int i=2;i<n;i++) {
	        if(n%i==0) {
	        	return false;
	        }
	    }
	    return true;
	}
	
}
