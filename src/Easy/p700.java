package Easy;

import java.util.Scanner;

public class p700 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int valor = scn.nextInt();
		String serie;
		scn.nextLine();
		int minuts;
		while (valor!=0)
		{
			for (int i=0; i<valor; i++)
			{
				serie = scn.nextLine();
				String[] dades = serie.split(" ");
				if (Integer.parseInt(dades[0]) => 30)
				{
					System.out.println(serie);					
				}
			}
			System.out.println("---");
		valor = scn.nextInt();
		scn.nextLine();
		}
		scn.close();
	}
}