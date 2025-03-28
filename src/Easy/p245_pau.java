package Easy;

import java.util.Scanner;

public class p245_pau {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int valor = scn.nextInt();
		double[] llistat = new double[500];
		
		while (valor !=0) 
		{
			for (int i=0; i<valor; i++)
			{
				llistat[i] = scn.nextDouble();
			}
			int contador = 0;
				for (int j=0; j<=valor;j++)
				{
					double num = llistat[j];
					if (num < llistat[j+1])
					{
						contador++;
					}		
				}
			if (contador == valor-1)
			{
				System.out.println("DALTON");				
			}
			else
			{
				System.out.println("DESCONOCIDOS");
			}
			valor = scn.nextInt();
		}
		scn.close();
		}
	}
