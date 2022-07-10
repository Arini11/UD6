import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Lenght array");
		int num[] = new int[Integer.valueOf(n)];
		
		omplirArray(num, 0, 9);
		llistarNumeros(num);
	}
	
	public static void omplirArray(int num[], int min, int max) {
		max++; // sumo un al 9 per que el màxim és exclusiu
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random() * (max - min));
		}
	}
	
	public static void llistarNumeros(int num[]) {
		System.out.println("Posició - Valor");
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1) + " - " + num[i]);
		}
	}

}
