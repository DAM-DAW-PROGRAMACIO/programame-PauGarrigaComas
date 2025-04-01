package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class p105 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String[] dies = {"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO","EMPATE"};
		String compDiumenge;
		Integer minim;
		Integer maxim;
		Double caixa[];
		caixa = new Double[6];
		int i = 0;
		while (!scn.hasNext("-1"))
		{
			caixa[i] = Double.parseDouble(scn.nextLine());
			
			
			i++;
		}
		
		compDiumenge = mesDiumenge(caixa);
		minim = menorRecaptacio(caixa);
		maxim = majorRecaptacio(caixa);
		
		if (comprovarMinimRepetit(caixa)) 
		{
			minim = 6;
		}
		if (comprovarMaximRepetit(caixa)) 
		{
			maxim = 6;
		}
		
		System.out.println(dies[maxim] + " " + dies[minim] + " "+ compDiumenge);
		
		scn.close();
	}
	
	public static boolean comprovarMinimRepetit(Double[] caixa)
	{
		Boolean trobat = false;
		
		Arrays.sort(caixa);
			
		if (Double.compare(caixa[0], caixa[1]) == 0)
		{
			trobat = true;
		}
		return trobat;
	}
	public static boolean comprovarMaximRepetit(Double[] caixa)
	{
		Boolean trobat = false;
		
		Arrays.sort(caixa);
		if (Double.compare(caixa[caixa.length-1], caixa[caixa.length-2]) == 0)
		{
			trobat = true;
		}
		return trobat;
	}
	
	
	public static int menorRecaptacio(Double[] caixa)
	{
		Double menor = caixa[0];
		Integer index = 0;
				
		for (int i=1; i<caixa.length-1; i++)
		{
			if (menor > caixa[i])
			{
				menor = caixa[i];
				index = i;
			}
		}		
		return index;
	}
	public static int majorRecaptacio(Double[] caixa)
	{
		Double major = caixa[0];
		Integer index = 0;
				
		for (int i=1; i<caixa.length-1; i++)
		{
			if (major < caixa[i])
			{
				major = caixa[i];
				index = i;
			}
		}		
		return index;
	}
	
	public static String mesDiumenge (Double[] caixa)
	{
		String resultat ="NO";
		Double suma= 0.0;
		
		for (int i=0; i<4;i++)
		{
			suma = suma + caixa[i];
		}
		if ((suma/5) < caixa[5])
		{
			resultat = "SI";
		}
		
		return resultat;
	}
}