public class Ejercicio04 {

	
	public int [][] obtenerDiagonalesMatriz(int [][] matriz){
		
		//La cantidad de diagonales de una matriz cuadrada es el doble del orden de la matriz - 1
		int ordenMatriz = matriz.length;
		int cantidadDiagonales = ordenMatriz*2 - 1;
		
		int [][] matrizResultado = new int [cantidadDiagonales][ordenMatriz];
		
		//Voy a recorrer la matriz resultado por fila, de abajo hacia arriba
		int indiceX=ordenMatriz - 1;
		int indiceY=0;
		
		for(int diagonal = 0; diagonal < cantidadDiagonales; diagonal ++) {
			//Arranco con un extremo
			
			int columnaResultado = 0;
			int auxIndiceX = indiceX;
			int auxIndiceY = indiceY;
			
			//Incremento indiceX e indiceY +1 para poder recorrer la diagonal hasta que algun indice supere el rango (ordenMatriz)
			while(auxIndiceX < ordenMatriz && auxIndiceY < ordenMatriz) {
				
				matrizResultado[diagonal][columnaResultado] = matriz[auxIndiceX][auxIndiceY];
				auxIndiceX++;
				auxIndiceY++;
				columnaResultado++;
			}
			
			//Si el indice X llego a 0, no lo puedo decrementar mas. Recorro la matriz por columnas
			if(indiceX == 0) {
				indiceY++;
			} else {
				indiceX--;
			}
		}
		
		return matrizResultado;
	}
	
	public static void main(String[] args) {
		
		
		int[][] matriz = { { 1, 2, -3}, 
						{ 5, -6, -6}, 
						{ 1, 1, 10} 
						};	
		
		Ejercicio04 ejercicioTest = new Ejercicio04();
		
		System.out.println("Matriz de ejemplo: ");
		ejercicioTest.mostrarMatriz(matriz);
		
		int [][] matrizDeDiagonales = ejercicioTest.obtenerDiagonalesMatriz(matriz);
		
		System.out.println("Matriz de diagonales: ");
		ejercicioTest.mostrarMatriz(matrizDeDiagonales);
	}
	
	
	public void mostrarMatriz(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
	
}