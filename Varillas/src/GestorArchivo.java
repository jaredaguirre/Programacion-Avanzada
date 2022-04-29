import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class GestorArchivo {

	public static void leerArchivoColgantes() throws FileNotFoundException {

		String rutaCompleta = "/Users/agujared/eclipse-workspace/Varillas/media/text.txt";

		// creating File instance to reference text file in Java
		File text = new File(rutaCompleta);

		// Creating Scanner instance to read File in Java
		Scanner scanner = new Scanner(text);
		
		//Get the first line and store the amount of colgantes
		String primerLinea = scanner.nextLine();
		int cantColgantes = Integer.parseInt(primerLinea);

		
		System.out.println("Hay " + cantColgantes + " colgantes");
		
		double[] pesos = new double[cantColgantes];
		
		// Leyendo cada linea y guardandola en un array de pesos
		for(int i = 0; i < cantColgantes ; i++) {
			
			pesos[i] = scanner.nextDouble();
			
		}
		//Guardamos la informacion en una variable estatica de la clase Colgante
		Colgante.setColgantesArray(pesos);
		
	}
}
