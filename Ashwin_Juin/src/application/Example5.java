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


public class Example5 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		 	String ligne;
			BufferedReader entree;
			entree = new BufferedReader(new FileReader("monFichier.txt"));
			
			while(entree.ready())
			{
				ligne = entree.readLine();
				System.out.println(ligne);
				
			}
			entree.close();


	}

}
