package exercice5;

public class Fournisseur {
	int id_fournisseur;
    String nom;
    String categorie;
    String adresse;
    
    public Fournisseur() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    
	public Fournisseur(int id_fournisseur, String nom, String categorie, String adresse) {
		super();
		this.id_fournisseur = id_fournisseur;
		this.nom = nom;
		this.categorie = categorie;
		this.adresse = adresse;
	}




	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	@Override
	public String toString() {
		return "Fournisseur [id_fournisseur=" + id_fournisseur + ", nom=" + nom + ", categorie=" + categorie
				+ ", adresse=" + adresse + "]";
	}
    
    
    
}
