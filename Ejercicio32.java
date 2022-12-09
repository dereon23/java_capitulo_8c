package capitulo8c;

public class Ejercicio32 {

	public static int[] coordenadasEnArrayBiInt(int n, int[][] matriz) {
		int[] coordenadas=new int[2];
		coordenadas[0]=-1; coordenadas[1]=-1;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				if(matriz[i][j]==n) {
					coordenadas[0]=i; coordenadas[1]=j;
				}
			}
		}
		return coordenadas;
	}
	
}
