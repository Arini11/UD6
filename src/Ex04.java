import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		
		Scanner lector = new Scanner(System.in);
		int n = lector.nextInt();
		
		factorial(n);
	}
	
	public static void factorial(int x) {
		int resultat = 1;
		for(int i = x; i>0; i--) {
			resultat = resultat * i;
			if(i>1) {
				System.out.print(x + " * ");
			}else{
				System.out.print(x + " = " + resultat);
			}
			x--;
		}
	}

}
