
public class Ejercicio00 {

	
	
	public static boolean checkDiag(int[][] matA) {
		
		
		//Dada una matriz cuadrada de n dimensiones:
		int n = matA.length;
		int total = 0;
		
		//Comienzo de la iteracion
		for(int i=0 ; i<n ; i++) {
			
			total += matA[i][i];
			if(i+1 < n) {
				if(matA[i+1][i+1] != total) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		//test
		int[][] a = {
				{-1, 3, 2},
				{5, -1, 0},
				{-1, 2, -2}
		};
		
		if(checkDiag(a)) {
			System.out.println("La diagonal SI cumple la regla");
		}else {
			System.out.println("La diagonal NO cumple la regla");
		}
	}
	
	
}

