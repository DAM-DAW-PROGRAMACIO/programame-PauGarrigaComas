package Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		long caniques;
		long altura;
		long fila;
		int proves = Integer.parseInt(br.readLine());
		for (long i=0; i<proves; i++)
		{
			altura = Long.parseLong(br.readLine());
			caniques = 0;
			fila = 0;
//			for (long j=altura;j>=0;j--)
//			{
//				
//				//fila += j;  
//				//caniques+=fila;
//			}
			caniques = ((altura*(altura+1))/2);
			System.out.println(caniques);
		}	
		scn.close();
		}
}
	