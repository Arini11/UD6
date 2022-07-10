import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		String tamany = JOptionPane.showInputDialog("De que tamaño seran los arrays?");
		int largo = Integer.parseInt(tamany);

		int array1[] = new int[largo];
		int array2[] = new int[largo];
		
		llenarArrayR(array1);
		
		array2 = array1;
		
		System.out.println("Array1: ");
		mostrarArray(array1);
		
		System.out.println("Array2: ");
		mostrarArray(array2);
		
		llenarArrayR(array2);
		
		System.out.println("Array1: ");
		mostrarArray(array1);
		
		System.out.println("Array2: ");
		mostrarArray(array2);
		
		System.out.println("ArrayMultiplicada: ");
		multiplicar(array1, array2);
	}

	public static void llenarArrayR(int array[]) {
		for(int i=0; i<array.length; i++) {
			array[i] = (int) (Math.random()*9);
		}
	}
	
	public static void igualarArrays(int array1[], int array2[]) {
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
	}
	
	public static void mostrarArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void multiplicar(int a1[], int a2[]) {
		int arrayMultiplicada[] = new int[a1.length];
		
		for(int i=0; i<a1.length; i++) {
			arrayMultiplicada[i] = a1[i] * a2[i];
			System.out.println(arrayMultiplicada[i]);
		}
	}
	
}
