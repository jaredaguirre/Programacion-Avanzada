import java.util.Arrays; 

public class Ejercicio03 {

	public static int[] returnModa(int[][] matA){
		
		int n = matA.length;
		
		int[] modas = new int[n];
		
		for(int i=0; i < n;i++) {
			modas[i] = obtenerModa(matA[i]);
		}
		return modas;
	}
	
	public static int obtenerModa(int[] fila) {
		
		int i = 1;
		int m = fila.length;
		
		
		int moda_actual, moda_mayor, cant_moda_actual, cant_moda_mayor;
		
		Arrays.sort(fila);
		
		moda_mayor = fila[0];
		cant_moda_mayor = 1;
		
		moda_actual = fila[0];
		cant_moda_actual = 1;
		
		while(i <= m) {
			
			if(i < m && fila[i] == moda_actual) {
				cant_moda_actual++;
			}
			else {
				
				if(cant_moda_actual > cant_moda_mayor) {
					moda_mayor = moda_actual;
					cant_moda_mayor = cant_moda_actual;
				}
				else if(cant_moda_actual == cant_moda_mayor && moda_actual > moda_mayor) {
					moda_mayor = moda_actual;
					
				}
				if(i < m) {
					moda_actual = fila[i];
					cant_moda_actual = 1;	
				}
			}
			
			i++;
		}
		return moda_mayor;
		
	}
	public static void main(String[] args) {
		
		int[][] matriz = {
				{1},
				{2},
				{3}
		};
		int[] resultado = new int[matriz.length];	
		
		resultado = returnModa(matriz);
		
		for(int i =0 ; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
