public class Punto {
	
	private double x;
	private double y;
	
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(Punto p) {
		
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.hypot(dx, dy);
	}

}
