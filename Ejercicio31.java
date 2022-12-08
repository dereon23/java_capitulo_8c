package capitulo8c;

public class Ejercicio31 {
	
	public static int[] columnaDeArrayBiInt(int j, int[][] matriz){
		int[] ar=new int[matriz.length];
		for(int i=0; i<matriz.length;i++) {
			ar[i]=matriz[i][j];
		}
		return ar;
	}

}
