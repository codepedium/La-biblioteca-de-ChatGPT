import java.util.Arrays;
public class hoja_calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int [4][5];
		int sumafilas[] = new int [4];
		int sumacolum[] = new int [5];
		int sumatotal = 0;
		
		for (int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				
				matriz[i][j] = (int) (Math.random()*(999-100+1))+100;//Rellenamos la matriz con numeros aleatorios
				sumafilas [i] += matriz[i][j];//Rellenamos el array de suma de filas
				sumatotal+=matriz [i][j];//Las añadimos a la suma total
			}
		}
		for (int j = 0; j<matriz[0].length; j++) {
			for(int i = 0; i<matriz.length; i++) {
				sumacolum[j] += matriz[i][j];//Rellenamos el array de suma de columnas
			}
		}
		for(int i = 0; i<matriz.length; i++) {//Para imprimir los valores de la matriz asi como el array suma de filas
			System.out.println(Arrays.toString(matriz[i]) + " | " + sumafilas[i]);
		}
		System.out.println("-----------------------------------------");
		System.out.println(Arrays.toString(sumacolum) + " | " + sumatotal);
	}

}
