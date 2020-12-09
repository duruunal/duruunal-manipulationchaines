package com.edu.tfs;

public class exercise5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Entrer 6 numeros: ");
		Object nombres;
		String[] nombre;
		for (int i = 0; i < nombres; i++)

		System.out.println("le nombre minimum est " + 
			nombre(indicedePluspetit(nombre)) + " index " +
			indicedePluspetit(nombres));
	}

	public static int indicedePluspetit(double[] entires) {
		if (entires.length <= 1)
			return 0;
		//test
		
		double min = entires[0];
		int minimumindice = 0;
		for (int i = 1; i < entires.length; i++) {
			if (entires[i] < min) {
				min = entires[i];
				minimumindice = i;
			}
		}
		return minimumindice;
	}
}



