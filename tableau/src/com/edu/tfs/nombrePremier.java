package com.edu.tfs;

public class nombrePremier {
	public static void main(String[] args)
	{
		int nbr=28;
		boolean isNotPremier=false;
		for(int i=2;i<=nbr/2;i++)
		{
			if(nbr%i ==0)
			{
				isNotPremier=true;
				break; //sort de la boucle
			}
			
		}
		if(!isNotPremier)
			System.out.println("Premier");
		else
			System.out.println("Pas Premier");
				
	}
	
	
	static boolean isPrimeNumber(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i ==0)
			{
				return false;
			
				
			}
			
		}
		return true;
		
	}

}
	
