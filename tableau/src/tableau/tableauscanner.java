/*
*Author : duruunal
*Date : 4 Nov, 2020
*/

public class tableauscanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
 		//String [] eleves= {"John","John1","John2"};
		String [] eleves= new String [3];
		for(int i=0;i<eleves.length;i++)
		{
			System.out.println("nom de l'eleve" + i);
			eleves[i]=sc.next.Line();
		}
		
		
		//afficher
		for(int i=0;i<eleves.length;i++)
		{
			System.out.println(eleves[i]);
		}
	}
}
