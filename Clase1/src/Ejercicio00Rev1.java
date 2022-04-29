public class Ejercicio00Rev1 {

//Escribir un método en Java que permita comprobar si la diagonal principal de una 
//matriz cuadrada de enteros tiene en cada posición un valor igual a la suma de todos 
//los valores de las posiciones anteriores de dicha diagonal. 

	public boolean comprobar(int[][] matriz) {
		
		int sumaAnteriores = matriz[0][0];
		for(int i = 1; i < matriz.length; i++) {
			if (matriz[i][i] == sumaAnteriores) {
				sumaAnteriores = sumaAnteriores + matriz[i][i];
			}
			else
			return false;			
		}
		return true;
	}
		
		
		public static void main(String[] args) {
			
			int[][] ejemplo = {
					{-1,2,3},
					{4,-1,6},
					{7,8,2}
			};
			
			Ejercicio00Rev1 miEjercicio = new Ejercicio00Rev1();
			System.out.println(miEjercicio.comprobar(ejemplo));
		}
}