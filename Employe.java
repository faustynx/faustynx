import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.*;
	
	public class Employe{

		private Scanner sc = new Scanner(System.in);
		private static String formatDeDate = "dd/MM/yyyy";
		private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDeDate);
		static ArrayList<Employe> ListEmployes = new ArrayList<Employe>();
		
	    public Employe() {
	    }

	    public String nom , prenom; //d�claration de toutes les variables
	    public int telephone;
	    public Date date_naissance , date_embauche;
	    public long anciennete;
	    public Double Salaire , SalairePrime;


	    public void SetNom() {
	    	System.out.println("Nom:");
	        String saisie = sc.nextLine();
	        nom = saisie;
	    }

	    public void GetNom() {
	        System.out.println("Nom: "+nom);
	    }

	    public void SetPrenom() {
	    	System.out.println("Pr�nom:");
	        String saisie = sc.nextLine();
	        prenom = saisie;
	    }
	    
	    public void GetPrenom() {
	        System.out.println("Pr�nom: "+prenom);
	    }

	    public void SetTelephone() {
	        System.out.println("Num�ro de t�l�phone:");
	        int saisie_telephone = sc.nextInt();
	        sc.nextLine();			//On ajoute la ligne sc.nextLine apr�s une entr�e sc.nextInt pour s'assurer que la prochaine entr�e de caract�re de l'utilisateur est capt�e par le programme
	        telephone = saisie_telephone;
	    }

	    public void GetTelephone() {
	        System.out.println("T�l�phone: "+telephone);
	    }

	    public void SetNaissance() {
	    	
	    	Date date = null; //gestion de l'erreur en affectant la valeur null
	    	
	    	do {
	    	System.out.println("Ins�rez la date de naissance au format: dd/mm/aaaa");
	    	String saisie = sc.nextLine();
	    	
	    	try {
	    	date = simpleDateFormat.parse(saisie);
	    	}
	    	catch (Exception e)
	    	{
	    		System.out.println("Veuillez saisir la date au format: dd/mm/aaaa");
	    	}
	    	}
	    	while (date == null); //on affecte la valeur recherch�e � la fin du programme pour �viter tout probl�me d'instanciation lors du fonctionnement de la m�thode
	    	date_naissance = date; 
	    }

	    public void GetNaissance() {
	        System.out.println("Date de naissance: "+date_naissance);
	    }

	    public void SetEmbauche() {

	    	Date date = null;
	    	
	    do {
	    	
	    	System.out.println("Ins�rez la date d'embauche au format: dd/mm/aaaa");
	    	String saisie = sc.nextLine();
	    	
	    	try {
	    	date = simpleDateFormat.parse(saisie); //on utilise la fonction simpledateformat pour faire des entr�es de dates et les convertir au format d'�criture "Date"
	    	}
	    	catch (Exception e)
	    	{
	    		System.out.println("Veuillez saisir la date au format: dd/mm/aaaa");
	    	}
	    	
	    } while (date == null);  //gestion de l'erreur si jamais le format de date entr� n'est pas le bon
	    date_embauche = date;
	    	
	    }
	    	    
	    public void GetEmbauche() {
	        System.out.println("Date d'embauche: "+date_embauche);
	    }
	    
	    
	    public void GetSalaire() {
	    	System.out.println("Salaire: "+Salaire);
	    }
	    
	    public void GetSalairePrime() {
	    	System.out.println("Salaire avec la prime: "+SalairePrime);
	    }
	    
	    public void CalculAnciennete() {
	    	
	    	Date today = new Date( ); //prend la date o� la fonction est utilis� et la compare avec la date d'embauche
	    	Date date1 = date_embauche;
	        long diff_date = today.getTime( ) - date1.getTime( );
	        anciennete = (long) (diff_date/(1000*60*60*24*365.25)); // les formats des dates dans l'op�ration pr�c�dente sont calcul�es en millisecondes (norme) donc pour r�cup�rer  
	        														//la variable "anciennet�" en ann�e, on effectue une conversion.
	        														//on passe d'ailleurs par le type de variable "long" car cod�e su plus de bits donc plus de valeur
	    }

	}

	