package com.edu.tfs;

import java.util.Scanner;

public class calandrierjava 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int deb=sc.nextInt(); //debut de mois
		int fin=sc.nextInt();// fin de mois
		// ecrire les jours de la semaine
		System.out.println("D\tL\t M\t M]\t J\t V\t S\t");
		// ecrire les espaces si necessaire
		for(int i=1;i<deb;i++)
		{
			System.out.print("\t");
		}
		//ecrire la premiere ligne
		int svt=9-deb;
		for(int i=1;i<svt;i++)
		{
			System.out.println(i+ "\t");
		}
		System.out.println();
		//ecrire les autres jours
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.print(svt + "\t");
				svt++;
				if(svt>fin)
					System.exit(1);
			}
			System.out.println();
			
		}
		
		
		sc.close();
	}

}
