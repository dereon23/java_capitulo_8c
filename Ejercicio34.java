package capitulo8c;

public class Ejercicio34 {
	
	public static int[] diagonal(int fila, int colum, String direccion, int[][] matriz) {
		int largoarr=1;
		if(matriz.length>matriz[0].length) {
			largoarr=matriz[0].length;
		}else {
			largoarr=matriz.length;
		}
		int[] arr=new int[largoarr];
		
		int i=fila;int j=colum; int k=0;
		if(direccion.equals("nose")) {
			while(i<matriz.length&&j<matriz[0].length) {
				arr[k]=matriz[i][j];
				i++;j++;k++;
			}
			i=fila-1;j=colum-1;
			while(i>=0&&j>=0) {
				arr[k]=matriz[i][j];
				i--;j--;k++;
			}
		}else {
			while(i<matriz.length&&j>=0) {
				arr[k]=matriz[i][j];
				i++;j--;k++;
			}
			i=fila-1;j=colum+1;
			while(i>=0&&j<matriz[0].length) {
				arr[k]=matriz[i][j];
				i--;j--;k++;
			}
		}
		return arr;
	}

}
