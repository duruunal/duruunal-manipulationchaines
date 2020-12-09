package com.edu.tfs;

public class mathode1 {
	public static void main(String[] args)
	{
		
		donnerNom("John");
		
		int result=calculerSomme();
	}
	
	public static void crier()
	{
		System.out.println("Hiii");
	}
	
	public static void donnerNom(String nom)
	{
		System.out.println("mon nom est" + nom);
	}
	
	public static int calculerSomme()
	{
		return 3;
	}
	
	public static boolean isOnline()
	{
		int reponse=5;
		if (reponse==3)
			return false;
		else
			return true;	 
	}
	
	public static int produit(int a,int b)
	{
		return a*b;
	}

}
