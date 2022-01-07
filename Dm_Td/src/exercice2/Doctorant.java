package exercice2;

public class Doctorant extends Enseignant{

	public Doctorant(String n, String p, int h) {
		super(n, p, h);
		// TODO Auto-generated constructor stub
	}
	
	public float cout() {
		 if (this.heuresCours > 96) return (96*35)*charges;
		 else return (35*this.heuresCours)*charges;
		 }
 
}
