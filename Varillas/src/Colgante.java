import java.util.Arrays;

public class Colgante {

	
	private double peso;
	static private double[] colgantes;
	
	Colgante(double _peso){
		
		this.peso = _peso;
	}
	
	public boolean pesaIgualA(Colgante colgante) {
		
		return this.peso == colgante.peso ? true : false;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	static public void setColgantesArray(double[] arrayColgantes) {
		
		colgantes = arrayColgantes;
		
	}
	
	static public void generarMoviles() {
		
		Arrays.sort(colgantes);
		for(int i=0; i < colgantes.length - 1; i++) {
			
			if(colgantes[i] == colgantes[i+1]) {
				
				Movil.agregarMovil(new Movil(new Colgante(colgantes[i]), new Colgante(colgantes[i+1])));
				i++;
				
			}
			
		}
	}
}
