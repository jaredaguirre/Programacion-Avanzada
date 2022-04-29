
public class Main {

	
	public static void main(String[] args) {
		
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
        Circulo c = new Circulo(new Punto(0,0),2);
        Circulo d = new Circulo(new Punto(4,0),1);
        Circulo e = new Circulo(new Punto(0,0),1);
        Circulo f = new Circulo(new Punto(1,0),1);
        Circulo g = new Circulo(new Punto(0,3),2);
        Circulo h = new Circulo(new Punto(4,0),2);
        Circulo p1 = new Circulo(new Punto(0,0),2);
        Circulo p2 = new Circulo(new Punto(0,0),1);
        

        System.out.println(c.intersectaCon(d));//false
        System.out.println(c.intersectaCon(e));//false
        System.out.println(c.intersectaCon(g));//true
        System.out.println(c.intersectaCon(c));//true
        System.out.println(c.intersectaCon(h));//true
        System.out.println(p1.intersectaCon(p2));//false
	}
}
