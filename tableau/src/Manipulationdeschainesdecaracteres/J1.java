package Manipulationdeschainesdecaracteres;

import java.util.Scanner;

public class J1 {

public static void main(String[] args) {
		
		//Spécification d'entrée
		Scanner input = new Scanner(System.in);
		int Pomme3= input.nextInt();
		int Pomme2= input.nextInt();
		int Pomme1= input.nextInt();
		int Banane3= input.nextInt();
		int Banane2= input.nextInt();
		int Banane1= input.nextInt();
				input.close();
		
		//calculs
		int partitiondepomme = (Pomme3 * 3) + (Pomme2 * 2) + (Pomme1 * 1);
		int partitiondebanane = (Banane3 * 3) + (Banane2 * 2) + (Banane1 * 1);
		
		//Spécification de sortie
		if (partitiondepomme > partitiondebanane) 
		{
			System.out.println("Les pommes sont les gagnantes");
		}
		
		else if (partitiondebanane > partitiondepomme) 
		{
			System.out.println("Les Bananes sont les gagnantes");
		} 
		else 
		{
			System.out.println("c'est une égalité entre les deux équipes");
		}

