package entreprise;

public class Commercial extends Employe {

	int venteDuMois;

	public Commercial(int matricule, String nom, int indiceSalarial) {
		super(matricule, nom, indiceSalarial);
		// TODO Auto-generated constructor stub
	}
	




	public void enregistreVentes(int i) {
		venteDuMois = i;
	}
	
	public int salaire(){
		return (indiceSalarial *valeur)+(venteDuMois/10);
	}
	

	public int getVenteDuMois() {
		return venteDuMois;
	}

	public void setVenteDuMois(int venteDuMois) {
		this.venteDuMois = venteDuMois;
	}

	@Override
	public String toString() {
		return "Commercial [venteDuMois=" + venteDuMois + ", matricule=" + matricule + ", nom=" + nom
				+ ", indiceSalarial=" + indiceSalarial + "]";
	}

	
	

}
