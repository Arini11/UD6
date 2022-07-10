import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {	
		Scanner lector = new Scanner(System.in);
		System.out.println("Entre que dos numeros quieres que se genere un numero random?");
		
		int n1 = lector.nextInt();
		int n2 = lector.nextInt();
		
		numRandom(n1, n2);
	}

	public static void numRandom(int a, int b) {
		int rand = (int)(Math.random() * (b - a)+a);
		System.out.println("El numero random generado és " + rand);
	}
	
}
