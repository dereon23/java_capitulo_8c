package capitulo8c;

public class Ejercicio29 {
	
	public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
		int[][] matriz =new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m;j++) {
				matriz[i][j]=(int)(Math.random()*(max-min)+min);
			}
		}
		return matriz;
	}

}
