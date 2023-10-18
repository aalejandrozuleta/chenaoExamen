package examen2;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Procesos2 {
	int cantidadMeses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses a calcular"));
	ArrayList <Double> valoresMes = new ArrayList <>();
	HashMap<Integer, ArrayList<Double>> mesesValores = new HashMap<>();
	double mayorValor = 0;
	
	public void empezar() {
		meses();
		resultadoMayor();
		resultadoMenor();
		resultados();
	}
	
	
	
	public void meses() {
		double promedio = 0;
		double totalSuma = 0;
		for (int i = 0; i < cantidadMeses; i++) {
			int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del mes " +(i+1)));
			
			for (int j = 0; j < ventas; j++) {
				double ventasMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta #"+(j+1)));
				
				
				totalSuma+= ventasMes;
				promedio = totalSuma/ventas;
				
				valoresMes.add(ventasMes);
				mesesValores.put(i, valoresMes);		
			}
			JOptionPane.showMessageDialog(null, "El promedio de este mes es de " + promedio);
		}
	}
	
	public void resultadoMayor() {
		
		for (Double resultado : valoresMes) {
			
			if(resultado > mayorValor) {
				mayorValor = resultado;
			}
		}
		System.out.println("El resultado mayor de todos los meses es "+mayorValor);
	}
	
	public void resultadoMenor() {
		double menorValor = mayorValor;
		for (Double resultado : valoresMes) {
			
			if(resultado < menorValor) {
				menorValor = resultado;
			}
		}
		System.out.println("El resultado menor de todos los meses es "+menorValor);
	}
	
	public void resultados() {
		for(Integer key : mesesValores.keySet()) {
			System.out.println("el mes "+ (key + 1) + "tuvo las siguientes ventas "+mesesValores.get(key));
		}
	}
}
