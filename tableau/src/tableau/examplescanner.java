import java.util.Scanner;

/*
*Author : duruunal
*Date : 4 Nov, 2020
*/

public class examplescanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Donner le chiffre");
		int a=sc.nextInt();
		System.out.println("Donner le mot");
		String b=sc.nextLine();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	sc.close();
	}
}
