package exercice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieEntierQ1 {
	static int saisieCorrecte() {
		Scanner valeur = new Scanner(System.in);
		int x = 0;
		do {
			try {
				System.out.println("entrez un entier -> ");
				x = valeur.nextInt();
				break;
			} catch (InputMismatchException e) {
// il faut consommer la valeur du buffer d'entrée
				
				System.out.println("Erreur -250140" +x+ "nest pas un entier !" );
			}
		} while (true);
		return x;
	}

	public static void main(String[] args) {
		System.out.println("entier saisi : " + saisieCorrecte());
	}
}