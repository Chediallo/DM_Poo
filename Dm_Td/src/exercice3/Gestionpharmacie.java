package exercice3;

import java.util.Scanner;

class GestionPharmacie {
	 protected static Scanner scanner = new Scanner(System.in);
	 /**
	 * Le programme principal crée un objet Pharmacie
	 * sur lequel les opérations suivantes peuvent être effectuées:
	 * - achat (d'un médicament par un client),
	 * - approvisionnement (ajout d'un médicament au stock)
	 * - affichage (des données relatives à la pharmacie
	 */
	 public static void main(String args[]) {
	 Client[] clients = new Client[2];
	 Medicament[] medicaments = new Medicament[2];
	 clients[0] = new Client("Malfichu", 0.0);
	 clients[1] = new Client("Palichon", 0.0);
	 medicaments[0] = new Medicament("Aspiron", 20.40, 5);
	 medicaments[1] = new Medicament("Rhinoplexil", 19.15, 5);
	 Pharmacie1 p = new Pharmacie1(clients, medicaments);
	 int choix = 0;
	 while (choix < 4) {
	 choix = menu();
	 switch (choix) {
	 case 1:
	 p.achat();
	 break;
	 case 2:
	 p.approvisionnement();
	 break;
	 case 3:
	 p.affichage();
	 break;
	 case 4:
	 quitter();
	 break;
	 default :
	 // On reste dans la boucle.
	 choix = 0;
	 }
	 }
	 }
	 // Les méthodes utilitaires
	 static int menu() {
	 int choix = 0;
	 System.out.println();
	 System.out.println();
	 System.out.println("1 : Achat de medicament");
	 System.out.println("2 : Approvisionnement en medicaments");
	 System.out.println("3 : Etats des stocks et des credits");
	 System.out.println("4 : Quitter");
	 while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
	 choix = scanner.nextInt();
	 }
	 return choix;
	 }
	 static void quitter() {
	 System.out.println("Programme termine!");
	 }
	}
	// Les classes d'objets
	class Pharmacie1 {
	 // une pharmacie est une liste de client et
	 // une liste de médicaments
	 private Client[] clients;;
	 private Medicament[] medicaments;
	 public Pharmacie1(Client[] clients, Medicament[] medicaments) {
	 this.clients = clients;
	 this.medicaments = medicaments;
	 }
	 public Client[] getClients() {
	 return this.clients;
	 }
	 public Medicament[] getMedicaments() {
	 return this.medicaments;
	 }
	 /**
	 * Permet à un client d'acheter un médicament.
	 * si le client est connu de la pharmacie, son crédit
	 * va diminuer en fonction de son paiement.
	 * Le stock associé au médicament va diminuer
	 */
	 public void achat() {
	 Client client = this.lireClient();
	 Medicament medicament = this.lireMedicament();
	 double paiement = lirePaiement();
	 int quantite = lireQuantite();
	 if (quantite <= medicament.getStock()) {
	 medicament.diminuerStock(quantite);
	 client.augmenterCredit((medicament.getPrix() * quantite) - paiement);
	 } else {
	 System.out.println("Achat Impossible. Quantite insuffisante");
	 }
	 }
	 /**
	 * Permet à la pharmacie de s'approvisionner en un
	 * médicament connu.
	 */
	 public void approvisionnement() {
	 Medicament medicament = this.lireMedicament();
	 System.out.println("Donner la Quantite : ");
	 int quantite = GestionPharmacie.scanner.nextInt();
	 medicament.augmenterStock(quantite);
	 }
	 /**
	 * Affichage des stocks et des crédits de la pharmacie
	 */
	 public void affichage() {
	 System.out.println("Affichage des stocks");
	 for (int i = 0; i < medicaments.length; i++) {
	 System.out.println("Stock du medicament " + medicaments[i].getNom()
	 + " :" + medicaments[i].getStock());
	 }
	 System.out.println("Affichage des credits");
	 for (int i = 0; i < clients.length; i++) {
	 System.out.println("Credit du client " + clients[i].getNom()
	 + " :" + clients[i].getCredit());
	 }
	 }
	 /**
	 * Retourne l'objet Client associé à un nom (String)
	 * Le nom est lu et redemandé tant qu'il ne correspond
	 * pas au nom d'un client connu de la pharmacie
	 */
	 public Client lireClient() {
	 String nom = null;
	 boolean trouve = false;
	 Client c = null;
	 System.out.println("Nom du client?:");
	 while (!trouve) {
	 nom = GestionPharmacie.scanner.nextLine();
	 for (int i = 0; (!trouve && i < clients.length); i++) {
	 if ((clients[i].getNom()).equals(nom)) {
	 trouve = true;
	 c = clients[i];
	 }
	 }
	 if (!trouve) {
	 System.out.println("Client inconnu. Veuilliez recommencer");
	 }
	 }
	 return c;
	 }
	 /**
	 * Retourne l'objet Medicament associé à un nom (String)
	 * Le nom est lu et redemandé tant qu'il ne correspond
	 * pas au nom d'un médicament connu de la pharmacie
	 */
	 public Medicament lireMedicament() {
	 String nom = null;
	 boolean trouve = false;
	 Medicament m = null;
	 System.out.println("Nom du medicament?:");

	 while (!trouve) {
	 nom = GestionPharmacie.scanner.nextLine();
	 for (int i = 0; (!trouve && i < medicaments.length); i++) {
	 if ((medicaments[i].getNom()).equals(nom)) {
	 trouve = true;
	 m = medicaments[i];
	 }
	 }
	 if (!trouve) {
	 System.out.println("Medicament inconnu. Veuilliez recommencer");
	 }
	 }
	 return m;
	 }
	 static double lirePaiement() {
	 System.out.println("quel est le montant du paiement?");
	 return GestionPharmacie.scanner.nextDouble();
	 }
	 static int lireQuantite() {
	 System.out.println("quelle est la quantite achetee?");
	 return GestionPharmacie.scanner.nextInt();
	 }
	}
	