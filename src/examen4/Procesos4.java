package examen4;

import javax.swing.JOptionPane;

public class Procesos4 {

	public void inicar() {
		proceso();
		
	}

	private void proceso() {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
		double suma = 0;
		
		if(numero < 0) {
			System.out.println("El numero no puede ser negativo");
		}else {
			suma = (numero * (numero +1)/2);
			System.out.println("El resultado es: " + suma);
		}
		
	}

}
