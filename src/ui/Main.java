package ui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int m = Integer.parseInt(in.nextLine());
		
		
		for (int i = 0; i < m; i++) {
			
			int n = Integer.parseInt(in.nextLine());
			
			torreHanoi(n,1,2,3);
			
			
			
		}
		

	}
	
	public static void torreHanoi(int origen, int medio, int destino, int n ) {
		
		
		
		if(n==1) {
			
			System.out.println("El disco se ha movido del origen al destino" + origen+ " " + destino);
			
		} else{
			
			torreHanoi(origen, destino, medio, n-1);
			
			System.out.println("El disco se ha movido del origen al destino" + origen+ " " + destino);
			
			torreHanoi(medio, origen, destino, n-1);
			
		}
		
		
		}

}
