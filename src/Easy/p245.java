package Easy;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		long valor = scn.nextLong();
		
		while (valor > 0) 
		{
			if (valor>1)
			{
				boolean creixent = true;
				boolean decreixent = true;
				long ant = scn.nextLong();
				long actual = scn.nextLong();
				long i=0;
				
				while (i<valor && (creixent || decreixent)) 
				{					
					if (ant>=actual)
					{
						creixent = false;
					}
					if (ant<=actual)
					{
						decreixent = false;
					}
					ant = actual;
					actual = scn.nextLong();
					i++;
				}				
				if (creixent || decreixent ) 
				{
					System.out.println("DALTON");
				}
				else
				{
					System.out.println("DESCONOCIDOS");
					scn.nextLine();
				}		
			}
			else
			{
				System.out.println("DESCONOCIDOS");
			}
			valor = scn.nextLong();
		}
		scn.close();
		}
	}