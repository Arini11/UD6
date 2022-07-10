import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		String quant = JOptionPane.showInputDialog("Quina quantitat en euros vols canviar?");
		double euros = Double.parseDouble(quant);
		String moneda = JOptionPane.showInputDialog("A que ho vols convertir? (libras, dolares, yenes)");
		
		switch(moneda) {
			case "libras":
				libras(euros);
				break;
			case "dolares":
				dolares(euros);
				break;
			case "yenes":
				yenes(euros);
				break;
		}
	}
	
	public static void libras(double e) {
		double resultado = e * 0.86;
		System.out.println("Serian " + resultado + " libras.");
	}
	
	public static void dolares(double e) {
		double resultado = e * 1.28611;
		System.out.println("Serian " + resultado + " dolares.");
	}
	
	public static void yenes(double e) {
		double resultado = e * 129.852;
		System.out.println("Serian " + resultado + " yenes.");
	}
}
