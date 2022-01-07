package exercice1Q4;

public class Main {
	public static void main(String[] args) {
		 int i ;
		 System.out.println("//////////////// ") ;
		 System.out.println(" Question 2 : cr�ation et test de variables ") ;
		 System.out.println("//////////////// ") ;

		 Divertissement em1 = new Divertissement("La roue de la fortune","Foucault") ;
		 if ( em1.Programmer(20) )
		 System.out.println("ok emission programm�e");
		 else
		 System.out.println("emission non programm�e") ;

		 Fiction em2 = new Fiction("Citizen Kane", "Wells",true,3) ;
		 if ( em2.Programmer(17) )
		 System.out.println("ok emission programm�e");
		 else
		 System.out.println("emission non programm�e") ;
		 Reportage em3 = new Reportage("Voiture de luxe", 1, 1) ;
		 if ( em3.Programmer(5) )
		 System.out.println("ok emission programm�e");
		 else
		 System.out.println("emission non programm�e") ;
		 Reportage em4 = new Reportage("Bricolage", 1, 1) ;
		 if ( em4.Programmer(18) )
		 System.out.println("ok emission programm�e");
		 else
		 System.out.println("emission non programm�e") ;
		 int nb_max = 24 ; // nbre maximum d �missions dans une journ�e
		 Emission programme[] = new Emission[nb_max] ;

		 programme[0] = em1 ;
		 programme[1] = em2 ;
		 programme[2] = em3 ;
		 programme[3] = em4 ;
		 int nbEmissions = 4;

		 System.out.println("//////////////// ") ;
		 System.out.println(" Question 4 a ") ;
		 System.out.println("//////////////// ") ;
		 for (i=0; i<nbEmissions; i++){
		 if ( programme[i].Programmee() )
		 programme[i].Affiche() ;
		 }
		 System.out.println("//////////////// ") ;
		 System.out.println(" Question 4 b ") ;
		 System.out.println("//////////////// ") ;

		 //on �vite de traiter toutes les paires d'�mission en cochant
		 //et donc stockant dans un tableau les plages utilis�es

		 boolean[] plage = new boolean [24] ;
		 /// initialisation du tableau � faux
		 for (i=0; i<24; i++) plage[i] = false ;
		 /// parcours de toutes les �missions
		 for (i=0; i<nbEmissions; i++)
		 if ( programme[i].Programmee() ) {
		 System.out.println("plage : " + programme[i].Debut()) ;
		 for (int j=programme[i].Debut();j<programme[i].Fin();j++)
		 if ( plage[j] == false ) plage[j] = true ;
		 else System.out.println("attention : superposition sur la plage " + j);
		 }
		 System.out.println("//////////////// ") ;
		 System.out.println(" Question 4 c ") ;
		 System.out.println("//////////////// ") ;
		 // On suppose aucune superposition
		 int[] plage2 = new int [24] ;
		 /// initialisation du tableau � -1
		 for (i=0; i<24; i++) plage2[i] = -1 ;
		 /// parcours de toutes les �missions
		 for (i=0; i<nbEmissions; i++) {
		 if ( programme[i].Programmee() ) {
		 System.out.println("plage : " + programme[i].Debut()) ;
		 for (int j=programme[i].Debut();j<programme[i].Fin();j++)
		 plage2[j] = i ;
		 }
		 }
		 // l'affichage des 24 plages
		 System.out.println("PLANNING GENERAL") ;

		 for (i=0; i<24; i++) {
		 System.out.println("Plage :" + i) ;
		 if ( plage2[i] != -1 )
		 programme[plage2[i]].Affiche() ;
		 else
		 System.out.println("Aucune �mission") ;
		 }
		 }

}
