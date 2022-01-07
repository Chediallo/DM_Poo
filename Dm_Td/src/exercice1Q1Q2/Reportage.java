package exercice1Q1Q2;

public class Reportage extends Emission {
	private String theme;
	private int duree;

	public Reportage(String n, String t, int d) {
		nom = n;
		theme = t;
		duree = d;
	}

	public String toString() {
		return super.toString() + " : " + theme.toString();
	}

}
