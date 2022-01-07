package entreprise;

public class Employe {
	static int valeur = 12;
	int matricule;
	String nom;
	int indiceSalarial;
	
	public Employe(int matricule, String nom, int indiceSalarial) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.indiceSalarial = indiceSalarial;
	}
	
	public int salaire() {
		return indiceSalarial*valeur;
	}
	
	public static int getValeur() {
		return valeur;
	}
	public static void setValeur(int valeur) {
		Employe.valeur = valeur;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getIndiceSalarial() {
		return indiceSalarial;
	}
	public void setIndiceSalarial(int indiceSalarial) {
		this.indiceSalarial = indiceSalarial;
	}
	
	public void afficherEmp() {
		System.out.println(+matricule+ " " +nom+ " " +indiceSalarial);
	}
	
	
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", indiceSalarial=" + indiceSalarial + "]";
	}
	
	

}
