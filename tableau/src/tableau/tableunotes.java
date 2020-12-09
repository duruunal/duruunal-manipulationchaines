package tableau;

import java.util.Scanner;

/*
*Author : duruunal
*Date : 4 Nov, 2020
*/

public class tableunotes
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 		//String [] eleves= {"John","John1","John2"};
		String [] eleves= new String [3];
		int[] note=new int[3];
		for(int i=0;i<eleves.length;i++)
		{
			System.out.println("nom de l'eleve" + i);
			eleves[i]=sc.nextLine();
			System.out.println("note de l'eleve" + i);
			note [i]=sc.nextInt();
			sc.nextLine();
		}
		
		//afficher
		for(int i=0;i<eleves.length;i++)
		{
			System.out.println(eleves[i]);
			System.out.println(note[i]);
		}
	}
}