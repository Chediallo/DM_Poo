package exercice2;

public class Vacataire extends Enseignant{
	private String organisme;

	public Vacataire(String n, String p, int h) {
		super(n, p, h);
		// TODO Auto-generated constructor stub
	}

	public Vacataire(String n, String p, int h, String o) {
		super(n, p, h);
		this.organisme = o;
	}
	
	public float cout() {
		 return (40*this.heuresCours)*charges;
		 }
	

	
	

}
