import java.util.ArrayList;

public class Movil {
	
	
	private double peso;
	private Colgante colgante_a;
	private Colgante colgante_b;
	
	private static ArrayList<Movil> moviles = new ArrayList<Movil>();
	
	Movil(Colgante colgante_1, Colgante colgante_2){
		
		if(colgante_1.pesaIgualA(colgante_2)) {
			this.colgante_a = colgante_1;
			this.colgante_b = colgante_2;
			this.peso = colgante_1.getPeso() + colgante_2.getPeso();
		}
		
		
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	static void agregarMovil(Movil movil) {
		moviles.add(movil);
	}
	
	public static double getPesoTotal() {
		
		double pesoTotal = 0;
		for (Movil m : moviles) { 
			
		    pesoTotal+=m.getPeso();
		}
		return pesoTotal;
	}
	
	public static int getCantMoviles() {
		return moviles.size();
	}
	
	
}
