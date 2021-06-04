/*
* Auteur: ashwin
* Date : Jun. 4, 2021
* Description :
*/
package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Example2 {

	public static void main(String[] args) 
	{
		
		FileReader ficALire;
		BufferedReader entree;
		char c;
		
		ficALire = new FileReader("monFichier.txt");
		entree = new BufferedReader (ficALire);
		c = (char) entree.read();
		System.out.println(c);
		c = (char) entree.read();
		System.out.println(c);
		c = (char) entree.read();
		System.out.println(c);
		
		
	}

}
