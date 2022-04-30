
public abstract class Raza {

	protected Punto posicion;
	
	protected double vida;
	protected double fuerzaAtaque;
	protected double rangoAtaque;
	protected double velocidad;
	
	protected boolean descansado = false;
	
	//--Metodos
	
	public abstract void moverse(Punto poicionObjetivo);
	
	public abstract void atacar(Raza objetivo);
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	public abstract double recibirAtaque(double danio);
	
	public abstract void descansar();
	
	public abstract boolean estaEnRango(Punto p);
	
}
