package Easy;

import java.util.Scanner;

public class p117 {

	public static void main(String[] args) throws Exception {
		

		Scanner scn = new Scanner(System.in);
		
		String linia = scn.nextLine();	
		int num = Integer.parseInt(linia);
		
		for(int i = 0;i<num;i++)
		{
			String nom = scn.nextLine();
			String[] noms = nom.split(" ");
			System.out.println("Hola, "+ noms[1]+".");
		}
		scn.close();
	}
}
