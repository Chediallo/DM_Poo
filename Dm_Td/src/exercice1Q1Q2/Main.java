package exercice1Q1Q2;

public class Main {
	public static void main(String[] args) {
		Divertissement em1 = new Divertissement("Tanal sa boula neikh", "Ch�rif Diallo");
		System.out.println(em1.toString());
		Fiction em2 = new Fiction("D�couvertes", "Marcel Sarr", true, 3);
		System.out.println(em2.toString());
		Reportage em3 = new Reportage("Voiture de luxe", "Information", 2);
		System.out.println(em3.toString());
	}

}
