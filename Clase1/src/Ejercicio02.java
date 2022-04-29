public class Ejercicio02 {


	public static int[][] transformarMatriz(int[][] matA) {

		//Creamos una nueva matriz B de la misma medida
		int n = matA.length;
        int m = matA[0].length;
        int matB[][] = new int[n][m];
        
		int total = 0;

		//Inicio de la Iteracion
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[0].length; j++) {

				// inicio del valor
				total += matA[i][j];

				// Comprobaciones de esquinas o paredes
				if (i - 1 > -1) {
					total += matA[i - 1][j];
				}
				if (j - 1 > -1) {
					total += matA[i][j - 1];
				}
				if (i + 1 < matA.length) {
					total += matA[i + 1][j];
				}
				if (j + 1 < matA[0].length) {
					total += matA[i][j + 1];
				}
				
				// Guardamos el valor y reiniciamos el total
				matB[i][j] = total;
				total = 0;
			}
		}
		
		return matB;
	}

	public static void main(String[] args) {

		//Test
		int[][] a = { 
						{ 1, 3 }, 
						{ 5, 2 }, 
						{ -1, 2} 
					};
		
		int[][] b = transformarMatriz(a);

		//Imprimimos la matriz
		System.out.println("*****************************");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
            	
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
	}

}
