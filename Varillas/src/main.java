import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		

		GestorArchivo.leerArchivoColgantes();
		
		//test
		
		
		Colgante.generarMoviles();
		
		System.out.println("Cantidad moviles: " + Movil.getCantMoviles());
		System.out.println("Peso total de tales moviles: " + Movil.getPesoTotal());

		

	}

}
