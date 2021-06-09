/*
* Auteur: ashwin
* Date : Jun. 9, 2021
* Description :
*/
package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

	public static void main(String[] args) {
		
		FileReader ficALire;
		BufferedReader entree;
		
		char c;
		int count = 0;
		try {
			ficALire = new FileReader("/Users/ashwin/desktop/monFichier.txt");
			entree = new BufferedReader(ficALire);
			
			while(entree.ready())
			{
				
				c = (char) entree.read();
				
				if (c=='a')
				{
					count++;
				}
			}
			
			System.out.println("il y a" + count + " caracteres 'a' dans le texte");
			entree.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("Le Fichier ne peut pas etre lu");
			
		} catch(IOException ioe)
		{
			System.out.println("Erreur d'entrée");
		}
		}
	

	}


