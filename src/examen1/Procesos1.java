package examen1;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos1 {
	
	ArrayList <String> datosPersonas = new ArrayList <>();
	HashMap<String, ArrayList<String>> personas = new HashMap<>();
	
	public void iniciar() {
		proceso();
		resultados();
	}


	private void proceso() {
		String documento = JOptionPane.showInputDialog("Ingrese su documento");
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		double salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual"));
				
		double viviendaPorcentaje = 0;
		double transportePorcentaje = 0;;
		double ahorroPorcentaje = 0;
		
		String vivienda = "30% de vivienda " + viviendaPorcentaje;
		String transporte = "15% de transporte " + transportePorcentaje;
		String ahorros = "20% de ahorros " + ahorroPorcentaje;
		
		if (salarioAnual > 50000) {
			viviendaPorcentaje += salarioAnual - (salarioAnual*0.30);
			transportePorcentaje += salarioAnual - (salarioAnual * 0.15);
			ahorroPorcentaje += salarioAnual - (salarioAnual * 0.20);
		}
		
		
		
		datosPersonas.add(documento);
		datosPersonas.add(nombre);
		datosPersonas.add(vivienda);
		datosPersonas.add(transporte);
		datosPersonas.add(ahorros);
		
		personas.put(documento, datosPersonas);	
		
		
	}
	
	public void resultados() {
		for(String key : personas.keySet()) {
			System.out.println("persona con el documento: "+ key + "datos de ahorro "+personas.get(key));
		}
	}
	

}
