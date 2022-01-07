package entreprise;

import java.util.Arrays;

public class Personnel {
	Employe[] tabEmp = new Employe[100];
	int nbEmp = 0;
	Responsable[] tabResp = new Responsable[10];
	int nbResp = 0;
	
	Employe chercherEmploye(int matr){
		for(int i=0; i<nbEmp; i++){
			if (tabEmp[i].matricule == matr){
					return tabEmp[i];
				}
			}
		return null;
		}

	public void ajouterEmploye(Employe e){
		if (chercherEmploye(e.matricule) == null){
		tabEmp[nbEmp] = e;
		nbEmp++;
			}
		}
	
	
	public void ajouterResponsable(Responsable r){
		if (chercherEmploye(r.matricule) == null){
			ajouterEmploye(r);
			tabResp[nbResp] = r;
			nbResp++;
			}
		}

	public void affichePersonnel(){
		for (int i=0; i<nbEmp; i++){
			System.out.println(tabEmp[i]);
			System.out.println("\n");
			}

		}
	
	public void afficheHierarchie(){
		for (int i=0; i<nbResp; i++){
			tabResp[i].afficheSubordonnesDirects();
			System.out.println("=========>");
				}
			}
	
	public int totalSalaires(){
		int somme = 0;
		for (int i=0; i<nbEmp; i++){
		somme = somme + tabEmp[i].salaire();
		}
		return somme;
		}
	
	
	

	public Employe[] getTabEmp() {
		return tabEmp;
	}

	public void setTabEmp(Employe[] tabEmp) {
		this.tabEmp = tabEmp;
	}

	public int getNbEmp() {
		return nbEmp;
	}

	public void setNbEmp(int nbEmp) {
		this.nbEmp = nbEmp;
	}

	public Responsable[] getTabResp() {
		return tabResp;
	}

	public void setTabResp(Responsable[] tabResp) {
		this.tabResp = tabResp;
	}

	public int getNbResp() {
		return nbResp;
	}

	public void setNbResp(int nbResp) {
		this.nbResp = nbResp;
	}

	@Override
	public String toString() {
		return "Personnel [tabEmp=" + Arrays.toString(tabEmp) + ", nbEmp=" + nbEmp + ", tabResp="
				+ Arrays.toString(tabResp) + ", nbResp=" + nbResp + "]";
	}
	
	
	



}

