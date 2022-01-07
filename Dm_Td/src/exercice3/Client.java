package exercice3;

public class Client {
	 // Un client est caract�ris� par son nom et un cr�dit.
	 private String nom = "";
	 private double credit = 0.0;
	 public Client(String nom, double credit) {
	 this.nom = nom;
	 this.credit = credit;
	 }
	 public void augmenterCredit(double montant) {
	 credit = credit + montant;
	 }
	 public void diminuerCredit(double montant) {
	 credit = credit - montant;
	 }
	 public double getCredit() {
	 return credit;
	 }
	 public String getNom() {
	 return nom;
	 }
	}