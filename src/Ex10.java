import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		String tamany = JOptionPane.showInputDialog("De que tamaño sera el array?");
		int largo = Integer.parseInt(tamany);

		int array[] = new int[largo];
		
		System.out.println("Introdueix el numero màxim del random");
		int max = lector.nextInt();
		
		System.out.println("Introdueix el numero mínim del random");
		int min = lector.nextInt();
		
		arrayPrimo(array, largo, max, min);
		llistarNumeros(array, largo);
		maxim(array, largo);
	}
	
	public static void arrayPrimo(int[] array, int largo, int max, int min) {
		for(int i=0; i<largo; i++) {
			boolean primo = false;	
			do {
				int numero = (int) (Math.random()*(max + min) + min);
				if(calcPrimo(numero)) {
					array[i] = numero;
					primo = true;
				}
			} while(primo==false);
		}
	}
	
	public static boolean calcPrimo(int array) {
		int i=2;
		boolean isPrimo = true;
		
		while((isPrimo) && (i != array)) {
			if(array %  i == 0) {
				isPrimo = false;
			}
			i++;
		}

		return isPrimo;		
	}

	public static void maxim(int array[], int largo) {
		int max = 0;
		
		for(int i=0; i<largo; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("El numero més gran de la array es " + max);
	}
	
	public static void llistarNumeros(int num[], int largo) {		
		System.out.println("Posició - Valor");

		for(int i=0;i<largo;i++) {
			System.out.println((i+1) + " - " + num[i]);	
		}
	}
	
}
