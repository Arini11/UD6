import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		int num[]=new int[10];
		demanarNumeros(num);
		llistarNumeros(num);
	}
	
	public static void demanarNumeros(int num[]) {
		for(int i=0; i<10; i++) {
			String n = JOptionPane.showInputDialog("Num " + (i+1));
			num[i] = Integer.parseInt(n);
		}
	}
	
	public static void llistarNumeros(int num[]) {
		System.out.println("Posició - Valor");
		for(int i=0;i<10;i++) {
			System.out.println((i+1) + " - " + num[i]);
		}
	}
	
}
