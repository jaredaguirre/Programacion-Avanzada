public class Circulo {
	
	private Punto punto;
	private double radio;
	
	public Circulo(Punto punto, double radio) {
		this.punto = punto;
		this.radio = radio;
	}
	
	public boolean intersectaCon(Circulo circulo) {
		System.out.println(this.punto.distancia(circulo.punto));
		System.out.println(this.radio / 2 + circulo.radio / 2);
		 return this.punto.distancia(circulo.punto) < this.radio + circulo.radio;
	}

}
