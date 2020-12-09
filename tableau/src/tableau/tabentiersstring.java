/*
*Author : duruunal
*Date : 4 Nov, 2020
*/

public class tabentiersstring 
{

	public static void main(String[] args) 
	{
		//declarer un tableu d'eleves
		String [] eleves=new String [5];
		//int [] notes=new int [3];
		//initialiser les valeurs
		eleves[0]= "John";
		eleves[1]= "John1";
		eleves[2]= "John2";
		eleves[3]= "John3";
		eleves[4]= "John4";
		
		//System.out.println(eleves[3])
		for(int i=0;i<eleves.length;i++)
		{
			System.out.println(eleves[i]);
		}

	}

}
