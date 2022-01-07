package entreprise;

public class Main {

	public static void main(String[] args) {
		Commercial c1, c2, c3;
		c1 = new Commercial(125, "Felix", 20);
		c1.enregistreVentes(1000);
		c2 = new Commercial(126, "Cherif", 21);
		c2.enregistreVentes(1500);
		c3 = new Commercial(127, "Marcel", 22);
		c1.enregistreVentes(2000);
		
		Employe[] t1 = {c1, c2, c3};
		Responsable r1, r2, r3;
		r1 = new Responsable(130, "Thioube", 30, t1, "Directeur commercial");	
		Employe emp1, emp2, emp3;
		emp1 = new Employe(10, "Boccoum", 50);
		emp2 = new Employe(11, "Alpha", 51);
		emp3 = new Employe(12, "Khadim", 52);
		Employe[] t2 = {emp1, emp2, emp3};
		r2 = new Responsable(131,"Ousmane",31,t2,"Directeur technique");
		Employe[] t3 = {r1, r2};
		r3 = new Responsable(132,"Mao",32,t3,"Directeur");
		
		Personnel pers = new Personnel();
		pers.ajouterEmploye(c1);
		pers.ajouterEmploye(c2);
		pers.ajouterEmploye(c3);
		pers.ajouterEmploye(emp1);
		pers.ajouterEmploye(emp2);
		pers.ajouterEmploye(emp3);
		pers.ajouterResponsable(r1);
		pers.ajouterResponsable(r2);
		pers.ajouterResponsable(r3);
		pers.affichePersonnel();
		System.out.println("\n");
		pers.afficheHierarchie();

	}

}
