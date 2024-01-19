package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Polymers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  polymers;


		System.out.println("introduca los polymers: ");
		polymers = sc.nextLine();
		String polymerRepetido = "";


		for(int i = 0;i <polymers.length();i++  ){

			for(int j = 0; j< polymers.length(); j++){
				if(polymers.charAt(i)==polymers.charAt(j)
						|| polymers.toUpperCase().charAt(i)
						== polymers.toUpperCase().charAt(j)
						|| polymers.toLowerCase().charAt(i)
						== polymers.toLowerCase().charAt(j)){

					polymerRepetido = polymers.charAt(i)+"";
					polymerRepetido = polymerRepetido.trim();
					polymers = polymers.replace(polymerRepetido.toUpperCase(Locale.ROOT) , "");//elimina los caracteres


				}
			}
			System.out.println(" los polymers introducidos son : " + polymers );

		}




	}
}






