package exercice1Q1Q2;

public class Divertissement extends Emission {
	private String animateur;
	private static final int duree = 2;

	public Divertissement(String n, String anim) {
		nom = n;
		animateur = anim;
	}

	public String toString() {
		 return super.toString()+" : "+animateur.toString(); 
		 }

	
}
