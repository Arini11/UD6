import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Que quieres calcular?");
		
		switch(figura) {
			case "circulo":
				circulo();
			break;
			case "triangulo":
				triangulo();			
			break;
			case "cuadrado":
				cuadrado();
			break;
		}
	}
	
	public static void circulo() { 
		String numero = JOptionPane.showInputDialog("Cual es el radio?");
		double radio = Double.parseDouble(numero);
		double resultadoCi = Math.pow(radio, 2)*Math.PI;
		
		System.out.println("El area de tu circulo és " + resultadoCi);
	}
	
	public static void triangulo() { 
		String bas = JOptionPane.showInputDialog("Cual es la base?");
		double base = Double.parseDouble(bas);
		
		String alt = JOptionPane.showInputDialog("Cual es la altura?");
		double altura = Double.parseDouble(alt);
		
		double resultadoTr = (base * altura)/2;
		
		System.out.println("El area de tu triangulo és " + resultadoTr); 
	}
	
	public static void cuadrado() { 
		String lad1 = JOptionPane.showInputDialog("Cual es el valor del primer lado?");
		double lado1 = Double.parseDouble(lad1); 
		String lad2 = JOptionPane.showInputDialog("Cual es el valor del segundo lado?"); 
		double lado2 = Double.parseDouble(lad2);
		
		double resultadoCu = lado1 * lado2;

		System.out.println("El area de tu cuadrado és: " + resultadoCu);
	}
		
	
}
