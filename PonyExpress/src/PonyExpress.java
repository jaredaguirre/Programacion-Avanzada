
public class PonyExpress {

	public static int jinetes(int[]estaciones) {
		
		int millasRecorridas = 0;
		int cantidadJinetes = 1;
		
		for(int i = 0; i < estaciones.length - 1; i++) {
			
			millasRecorridas += estaciones[i];
			
			if(millasRecorridas + estaciones[i+1] > 100) {
				cantidadJinetes++;
				millasRecorridas = 0;
			}
		}
		return cantidadJinetes;
		
	}
	
	public int jinetes2(int[] estaciones) {

		int acumuladorMillas = 0;
		int jinetesNecesarios = 1;

		for (int i = 0; i < estaciones.length - 1; i++) {
			acumuladorMillas += estaciones[i];
			if (acumuladorMillas + estaciones[i + 1] > 100) {
				acumuladorMillas = 0;
				jinetesNecesarios++;
			}
		}

		return jinetesNecesarios;
	}
}
