package Easy;

import java.util.Scanner;

public class p300 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int valor = scn.nextInt();
		scn.nextLine();
		String paraula;
		
		for (int i=0; i<valor;i++)
		{
			paraula = scn.nextLine();
			if (paraula.contains("a") & paraula.contains("e") & paraula.contains("i") & paraula.contains("o") & paraula.contains("u"))
			{
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}			
		}		
		scn.close();
		}
	}