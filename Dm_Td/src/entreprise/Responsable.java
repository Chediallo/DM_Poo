package entreprise;

import java.util.Arrays;

public class Responsable extends Employe {

	Employe[] subordonnes; 
	String titre;
	public Responsable(int matricule, String nom, int indiceSalarial) {
		super(matricule, nom, indiceSalarial);
		// TODO Auto-generated constructor stub
	}
	public Responsable(int matricule, String nom, int indiceSalarial, Employe[] subordonnes, String titre) {
		super(matricule, nom, indiceSalarial);
		this.subordonnes = subordonnes;
		this.titre = titre;
	}
	
	public void afficheSubordonnesDirects() {
		this.toString();
		System.out.println("subordonnés: ");
		for (int i = 0; i < subordonnes.length; i++) {
			System.out.println(subordonnes[i]);
			System.out.println("\n");
		}
	}
	
	
	public Employe[] getSubordonnes() {
		return subordonnes;
	}
	public void setSubordonnes(Employe[] subordonnes) {
		this.subordonnes = subordonnes;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	@Override
	public String toString() {
		return "Responsable [subordonnes=" + Arrays.toString(subordonnes) + ", titre=" + titre + ", matricule="
				+ matricule + ", nom=" + nom + ", indiceSalarial=" + indiceSalarial + "]";
	}
	
	

	
	
}
