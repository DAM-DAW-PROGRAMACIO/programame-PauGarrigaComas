package Easy;

import java.util.Scanner;

public class p540 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int casos = Integer.parseInt(scan.nextLine());
		String linia;
		int total;
		int resultat;	
		int aux;
		
		for (int i=0; i<casos; i++)
		{
			linia = scan.nextLine();
			String[] dades = linia.split(" ");			
			
			aux = (Integer.parseInt(dades[0]) * Integer.parseInt(dades[1]));
			total = (Integer.parseInt(dades[0]) * Integer.parseInt(dades[1]))- (Integer.parseInt(dades[1]) - Integer.parseInt(dades[3]));
			resultat = aux + ( (Integer.parseInt(dades[2]) * Integer.parseInt(dades[1])) + Integer.parseInt(dades[3]));
			System.out.println(aux+" "+ resultat);			
		}
		scan.close();
	}
}