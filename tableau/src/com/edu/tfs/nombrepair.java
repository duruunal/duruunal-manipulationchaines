package com.edu.tfs;

public class nombrepair {
		
		public static void main(String[] args)
		{
			//int nombre=23;
			//int a=nombre%2;
			//System.out.println(a);
			
			//pour voir se c'est paire
			//int nombre=23;
			//if (nombre%2==0)
			//	System.out.println("pair");
		//	else
			//	System.out.println("impair");
			
			Scanner sc=new Scanner (System.in);
			int nombre=sc.nextInt();
			if(isPair(nombre))
				System.out.println("le nombre" + nombre + "est pair");
			else
				System.out.println("le nombre" + nombre + "est impair");
			
			sc.close();
		
		}
		
		static boolean isPair(int nbr)
		{
			if(nbr%==0)
				return true;
			else
				return false;
		}

	}
	}

}
