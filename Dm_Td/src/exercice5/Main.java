package exercice5;


import java.util.Scanner;

public class Main {
	protected static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Client[] clients = new Client[2];
		Article[] article = new Article[2];
		Fournisseur[] fournisseur = new Fournisseur[2];
		
		clients[0] = new Client(01, 100, "livre", "livre svt", 2);
		clients[1] = new Client(02, 101, "Exercice", "livre exercice", 3);
		
		article[0] = new Article(0, null, null, 0);
		article[1] = new Article(0, null, null, 0);
		
		fournisseur[0] = new Fournisseur(15, "Felix", "Livreur", "Guinee");
		fournisseur[1] = new Fournisseur(16, "Marcel", "Livreur", "Thies");
		
		
		
}
}

