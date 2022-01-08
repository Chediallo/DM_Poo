package exercice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieEntierQ2 {
	static int saisieCorrecte() {
		Scanner input = new Scanner(System.in);
		int x;
		do {
			try {
				System.out.println("Entrer un entier que vous voulez : ");
				x = input.nextInt();
				break;
			} catch (InputMismatchException e) {

				String s = input.next();
				System.out.println("Erreur la valeur saisier n'est pas un entier Recommencez !");
			}
		} while (true);
		return x;
	}

	public static void main(String[] args) {
		System.out.println("L'entier saisi est  : " + saisieCorrecte());
	}
}