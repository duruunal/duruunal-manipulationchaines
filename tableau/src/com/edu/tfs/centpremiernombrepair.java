package com.edu.tfs;

import java.util.Scanner;

public class centpremiernombrepair {
	public static void main(String[] args)
	{
		int nombre=1-100;
		if (nombre%2==0)
			System.out.println("pair");
	else
			System.out.println("impair");
		
		Scanner sc=new Scanner (System.in);
		int nombre1=sc.nextInt();
		if(isPair(nombre1))
			System.out.println("le nombre" + nombre1 + "est pair");
		else
			System.out.println("le nombre" + nombre1 + "est impair");
		
		sc.close();
	
	}

	private static boolean isPair(int nombre1) {
		// TODO Auto-generated method stub
		return false;
	}

}


