package tableau;

public class mamathode1 {
	
	public static void main(String[] args) 
	{
	
		//saluer();	
		//String ami= "John";
		//saluerAmi(ami);
		
	
		int somme=addition(12,14);
		System.out.println(somme);
	}

	//methode sans argument et qui ne retourne rien
	public static void saluer()
	{
		System.out.println("Bonjour");
	}
	
	//methode avec argument et qui ne retourne rien
	static void saluerAmi(String nom)
	{
		//nom="Paul";
		System.out.println("Bonjour" + nom);
	}
	
	//methode arguments qui retourne int
	static int addition (int a, int b) 
	{
		int resultat=a+b;
		return resultat;
		
	}
	
	
}

