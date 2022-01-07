package exercice1Q4;

public class Divertissement extends Emission {
	private String animateur;
	private static final int duree = 2;

	public Divertissement(String n, String anim) {
		nom = n;
		animateur = anim;
		// heure_debut = heure_fin = -1 ;
	}

	public void Affiche() {
		super.Affiche();
		System.out.println("Animateur :" + animateur);
		System.out.println("Durée :" + duree);
	}

	public boolean Programmer(int heure) {
		if (heure >= 18 && heure <= 21) {
			heure_debut = heure;
			heure_fin = heure + duree;
			return true;
		} else {
			return false;
		}
	}
}
