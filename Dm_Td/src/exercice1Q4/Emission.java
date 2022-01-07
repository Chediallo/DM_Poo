package exercice1Q4;

public abstract class Emission {
	protected String nom;
	protected int heure_debut, heure_fin;

	public abstract boolean Programmer(int heure);

	public Emission() {
		heure_debut = heure_fin = -1;
	}

	public boolean Programmee() {
		if (heure_debut != -1)
			return true;
		else
			return false;
	}

	public int Debut() {
		return heure_debut;
	}

	public int Fin() {
		return heure_fin;
	}

	public void Affiche() {
		System.out.println("===============");
		System.out.println("Emission :" + nom);
		if (heure_debut != -1)
			System.out.println(" Emission programmée à " + heure_debut);
	}
}