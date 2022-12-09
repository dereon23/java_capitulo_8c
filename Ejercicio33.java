package capitulo8c;

public class Ejercicio33 {
	
	public static boolean esPuntoDeSilla(int i, int j, int[][] matriz) {
		boolean silla=true;
		for(int k=0;k<matriz[0].length;k++) {
			if(matriz[i][k]<matriz[i][j]) {
				silla=false;
				break;
			}
		}
		for(int k=0; k<matriz.length;k++) {
			if(matriz[k][j]>matriz[i][j]) {
				silla=false;
				break;
			}
		}
		return silla;
	}

}
