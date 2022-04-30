
public class Punto {

	public double x;
	public double y;
	
	Punto(double _x, double _y){
		
		this.x = _x;
		this.y = _y;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
    
    public double distancia(Punto a) {
    	
    	double distanciaX= a.getX()- this.x;
        double distanciaY= a.getY()- this.y;
        double distancia = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
        
        return distancia;
    }
}
