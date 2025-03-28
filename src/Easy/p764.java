package Easy;

import java.util.Scanner;

public class p764 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		
		while (casos != 0)
		{
			int resultats = 0;
			for (int i=0;i<casos;i++)
			{
				int aus = scan.nextInt();
				int anelles = scan.nextInt();
				resultats = resultats + (aus-anelles);
			}
			
			System.out.println(resultats);
			
			casos = scan.nextInt();
		}	
		
		scan.close();
	}
}
