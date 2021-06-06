/*
* Auteur: ashwin
* Date : Jun. 6, 2021
* Description :
*/
package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Example3 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c;
		
		ficALire = new FileReader("monFichier.txt");
		entree = new BufferedReader(ficALire);
		c = entree.read(); // lecture du premier caractere
		
		while (c != -1 && c != '\n');
		{
			System.out.println((char) c);
			c=entree.read();
		}
		
		entree.close();
		ficALire.close();
	}

}
