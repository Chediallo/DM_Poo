package exercice5;

public class Article {

	private int id_article;

	private String nom_article;

	private String categorie;

	private int quantite;
	
	
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Article(int id_article, String nom_article, String categorie, int quantite) {
		super();
		this.id_article = id_article;
		this.nom_article = nom_article;
		this.categorie = categorie;
		this.quantite = quantite;
	}



	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public String getNom_article() {
		return nom_article;
	}

	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Article [id_article=" + id_article + ", nom_article=" + nom_article + ", categorie=" + categorie
				+ ", quantite=" + quantite + "]";
	}

	
	
	
	
}