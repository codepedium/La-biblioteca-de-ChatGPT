//También pide sueldo medio.
package vectores;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio5Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cuántas personas trabajan en la empresa");
		int personas=sc.nextInt();
		int j=0;  //Contador varones
		int k=0;  //Contador mujeres
		float suma_v=0;
		float suma_m=0;
		float[][]sueldos=new float[2][personas];
		for(int i=0;i<personas;i++)
		{
			System.out.println("Introduce 0 si la persona es varón y 1 si la persona es mujer");
			int genero=sc.nextInt();
			if(genero==0)
			{
				System.out.println("Introduce el sueldo que cobra");
				sueldos[0][j]=sc.nextFloat();
				suma_v+=sueldos[0][j];
				j++;
			}
			else if(genero==1)
			{
				System.out.println("Introduce el sueldo que cobra");
				sueldos[1][k]=sc.nextFloat();
				suma_m+=sueldos[1][k];
				k++;
			}
			else
			{
				System.out.println("Valor introducido no válido.");
			}
		}
		System.out.println("La media del sueldo de los varones es de : " + (suma_v/j));
		System.out.println("La media del sueldo de los varones es de : " + (suma_m/k));
		System.out.println(Arrays.deepToString(sueldos)); //Con esto compruebo cómo el ejercicio está a medias, pues me rellena con 0 las posiciones que no están escritas.
	}

}

/* Esta es la solución correcta de la profesora:

	Scanner sc=new Scanner8System.in);
	System.out.println("Personas de la empresa.");
	int n=sc.nextInt();
	int nhombres=0, nmujeres=0;
	float sumahombres=0, sumamujeres=0;
	float sueldos[][]=new float[n][2];
	
	for (int i=0; i<sueldos.length;i++)
		{
			for (int j=0; j<sueldos[i].length;j++)
			{
				if([j]==0)
				{
					System.out.println("Introduce 0 si es hombre, 1 si es mujer");
					sueldos[i][j]=sc.nextFloat();
				}
				if([j]==1)
				{
					System.out.println("Dime el sueldo:");
					sueldos[i][j]=sc.nextFloat();
				}
			}
			for(int i=0; i<sueldos.length;i++)
			{
				if (sueldos[i][0]==0.0)
				{
					nhombres++;
					sumahombres+=sueldos[i][1];
				}	
				if (sueldos[i][0]==1.0)
				{
					nmujeres++;
					sumamujeres+=sueldos[i][1];
				}	
			}
			System.out.println("La media del sueldo de los hombres es de " + sumahombres/nhombres);
			System.out.println("La media del sueldo de las mujeres es de " + sumamujeres/nmujeres");
		}
	
	
		*/	