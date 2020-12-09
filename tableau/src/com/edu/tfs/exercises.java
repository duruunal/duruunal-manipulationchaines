package com.edu.tfs;

public class exercises {
	public static class Plusgrandentier{  
		public static int trouvePlusgrande(int[] a){  
		int temp = 0;
		int x = 0;
		for (int i = 0; i < a.length; i++)   
		        {  
		       
		            if (a[i] > temp) {
		            	
		       
		            temp = a[i];
		            x = i;
		            }
		              
		        }  
		       return x;  
		}  
		public static void main(String args[]) {  
		int a[]={1,2,5,44,3,2};   
		System.out.println("Plusgrande"+trouvePlusgrande(a));   
		
		}
		
	}
}

