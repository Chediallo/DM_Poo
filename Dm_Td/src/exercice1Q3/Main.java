package exercice1Q3;

public class Main {
	public static void main(String[] args) {
		int i;
		System.out.println("================== ");
		System.out.println("\n ");
		System.out.println(" ================== ");
		Divertissement em1 = new Divertissement("Tanal sa boula neikh", "Chérif Diallo");
		if (em1.Programmer(20))
			System.out.println("ok emission programmée");
		else
			System.out.println("emission non programmée");
		Fiction em2 = new Fiction("Découvertes", "Marcel Sarr", true, 3);
		if (em2.Programmer(17))
			System.out.println("ok emission programmée");
		else
			System.out.println("emission non programmée");
		Reportage em3 = new Reportage("Voiture de luxe", 1, 1);

		if (em3.Programmer(17))
			System.out.println("ok emission programmée");
		else
			System.out.println("emission non programmée");
		System.out.println("==================  ");
		System.out.println(" \n");
		System.out.println("==================  ");
		if (em1.Programmee())
			em1.Affiche();
		if (em2.Programmee())
			em1.Affiche();
		if (em3.Programmee())
			em1.Affiche();
	}
}
