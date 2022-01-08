package exercice5;

public class Client {

	private int id_client;
    private int id_article;
    private String nom_article;
    private String categorie;
    private int quantite;
    
    public Client() {
		// TODO Auto-generated constructor stub
	}
    
    
	public Client(int id_client, int id_article, String nom_article, String categorie, int quantite) {
		super();
		this.id_client = id_client;
		this.id_article = id_article;
		this.nom_article = nom_article;
		this.categorie = categorie;
		this.quantite = quantite;
	}


	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
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
    
    
}
