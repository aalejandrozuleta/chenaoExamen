package examen3;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos3 {
	
	
	HashMap<Integer, Double> usuarios = new HashMap<>();
	int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas usaran la aplicacion"));
	
	
	public void iniciar() {
		calcular();
		resultados();
	}

	private void calcular() {
		for (int i = 0; i < cantidadPersonas; i++) {
			int opcionVendedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese \n 1. para vendedor tipo A \n 2. para vendedor tipo B \n 3. para tipo C \n 4. para tipo D"));
			int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas ventas hizo usuario " +(i+1)));
			double total = 0;
			switch (opcionVendedor) {
			case 1:
				total = cantidadVentas * 0.08;
				break;
			case 2:
				total = cantidadVentas * 0.06;
				break;
				
			case 3:
				total = cantidadVentas * 0.04;
				break;
			
			case 4:
				total = cantidadVentas * 0.02;
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
			usuarios.put(i, total);
			
		}
		
	}
	
	private void resultados() {
		for(Integer key : usuarios.keySet()) {
			System.out.println("el usuario "+ (key + 1) + " tiene una comision de "+ usuarios.get(key));
		}
	}
}
