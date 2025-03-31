package Easy;

import java.util.Scanner;

public class p621 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int valor = scn.nextInt();
		int pagina;
		scn.nextLine();
		
		for (int i=0; i<valor; i++)
		{
			pagina = scn.nextInt();
			scn.nextLine();
			if(pagina%2 == 0)
			{
				System.out.println(pagina+1);
			}
			else
			{
				System.out.println(pagina-1);
			}			
		}				
		scn.close();
		}
	}