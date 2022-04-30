
public class Tanquin extends Raza{

	private double vida = 300;
	private double fuerzaAtaque = 82;
	//private double rangoAtaque = 4;
	
	//private double velocidad = 0.5;
	
	private boolean descansado = true;
	
	public Tanquin(Punto posicion){
		this.posicion = posicion;
	}
	
	//incompleto
	public void moverse(Punto posObjetivo) {
		
		this.posicion = posObjetivo;
	}
	
	public boolean estaEnRango(Punto a) {
		
		return a.distancia(this.posicion) < 4;
		
	}
	
	public void atacar(Raza objetivo) {
		
		if(objetivo.estaEnRango(objetivo.getPosicion()) && descansado == true) {
			objetivo.recibirAtaque(this.fuerzaAtaque);
			descansado = false;
			System.out.println("Tanquin ataco con " + this.fuerzaAtaque + "!");
		}
		else {
			System.out.println("No puede atacar!");
		}
		
		
	}
	
	public double recibirAtaque(double danio) {
		
		//mitigar
		this.vida -= (danio * 2);
		
		//calcular danio
		if(this.vida <= 0) {
			System.out.println("Ripeo");
		}
		return this.vida;
	}
	
	public void descansar() {
		
		
		if(this.descansado == false) {
			this.vida += 100;
			this.vida *= 1.11;
			this.descansado = true;
			System.out.println("Descansando...");
		}
		else {
			System.out.println("Ya lo descansaron a este");
		}
	}
	
}
