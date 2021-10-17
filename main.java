import java.util.Scanner;


public class main {
		
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("    - Menu Principal -    \n [1] Gestionnaire des employés. \n [2] Accès prime d'ancienneté. \n [3] Calcul du salaire moyen. \n");
			int choix = sc.nextInt();
			sc.nextLine();
			
			if(choix == 1) {
				System.out.println("  - Menu Gestionnaire -  \n [1] Créer un nouvel employé. \n [2] Modifier les informations d'un employé. \n [3] Supprimer un employé. \n [4] Afficher les informations d'un employé. \n");
				int choix1 = sc.nextInt();
				sc.nextLine();
				
				if(choix1 == 1) {
					System.out.println("Création d'un profil employé: ");
					CreerEmploye();
				}
				if(choix1 == 2) {
					System.out.println("Modification d'un profil employé: ");
					ModifierInfo();
				}
				if(choix1 == 3) {
					System.out.println("Suppression d'un profil employé: ");
					SupprimerEmploye();
				}
				if(choix1 == 4) {
					System.out.println("Affichage des informations d'un profil employé: ");
					AfficherInfo();
				}
			}
			if(choix == 2) {
				System.out.println("Vérification de l'accès à la prime d'ancienneté: ");
				PrimeAnciennete();
			}
			if(choix == 3) {
				System.out.println("Calcul du salaire moyen: ");
				CalculSalaireMoyen();
			}
		}
	}
	
    public void app3() {
    }

    public static void CreerEmploye() {
    	
        System.out.println("Saisir son département: \n [1] Vente \n [2] Production");
        int option = sc.nextInt();
        sc.nextLine();
		
        if(option == 1) {
        	AjouterVente();
        }
        
        if(option == 2) {
        	AjouterProduction();
        }
        
    }

    public static void AjouterVente() {
    	
    	Vente employe = new Vente();
    	
    	employe.ListEmployes.add(employe); //on appelle toutes les fonctions de la classe Employe pour créer le profil
    	employe.SetNom();
    	employe.SetPrenom();
    	employe.SetTelephone();
    	employe.SetNaissance();
    	employe.SetEmbauche();
    	employe.SetChifAff();
    	employe.CalculAnciennete();
    	employe.CalculSalaire();
    	employe.SalairePrime();
    }
    
    public static void AjouterProduction() {
    	
    	Production employe = new Production();
    	
    	employe.ListEmployes.add(employe);
    	employe.SetNom();
    	employe.SetPrenom();
    	employe.SetTelephone();
    	employe.SetNaissance();
    	employe.SetEmbauche();
    	employe.SetNbUnit();
    	employe.CalculAnciennete();
    	employe.CalculSalaire();
    	employe.SalairePrime();
    }
    
    
    public static void ModifierInfo() {
    	
        System.out.println("Saisissez le nom de l'employé à modifier: ");
        String Nom = sc.nextLine();
        
        boolean op = false; //gestion de l'erreur si le nom entré n'existe pas
        
        System.out.println("Sélectionnez son département: \n [1] Vente \n [2] Production");
        int role = sc.nextInt();
        
        if(role == 1) {
        	
        	for(int i=0; i < Employe.ListEmployes.size(); i++) { //cherche pour chaque index du tableau dynamique celui pour lequel le nom entré correspond
        		
            	Vente employe = (Vente) Employe.ListEmployes.get(i);

            	int valeur = 0;
            	
            		
            	if(employe.nom.equals(Nom)) { //employé trouvé, on peut alors modifier ses informations
            		 
            		do {
            			
            		System.out.println("Sélectionner l'élement que vous souhaitez modifier: \n [1] Changer le nom \n [2] Changer le prénom. \n [3] Changer le nuémro de téléphone. \n [4] Changer la date de naissance. \n [5] Changer la date d'embauche. \n [6] Modifier les informations du salaire.");
            		int choix1 = sc.nextInt();
            		sc.nextLine();
            		
            		if (choix1 == 1) {
            			employe.SetNom();
            		}
            		else if (choix1 ==2) {
            			employe.SetPrenom();
            		}
            		else if (choix1 ==3 ) {
            			employe.SetTelephone();
            		}
            		else if (choix1 ==4) {
            			employe.SetNaissance();
            		}
            		else if (choix1==5) {
            			employe.SetEmbauche();
            		}
            		else if (choix1 == 6) {
            			
            		employe.SetChifAff();
            		employe.CalculSalaire();
	        		employe.SalairePrime();
	        		
            		}
            		else {
            			}
            		
            		System.out.println("Souhaitez-vous modifier une autre information ? \n [1] Oui \n [2] Non.");
            		int choix2 = sc.nextInt();
            		sc.nextLine();
            		
            		if (choix2==1) {
            			valeur =0;
            		}
            		else if (choix2 ==2 ){
            			valeur =1;
            		}
            		
            } while (valeur==0);
            		
            	op = true;
            	break;
        }
    }
 }
        
        else if(role == 2){
        	
        	for(int i=0; i < Employe.ListEmployes.size(); i++) {
        		
	        	Production employe = (Production) Employe.ListEmployes.get(i);
            	System.out.println(employe.prenom);
            	int valeur = 0;
            	
            		
            	if(employe.nom.equals(Nom)) {
            		 
            		do {
            			
            		System.out.println("Sélectionner l'élement que vous souhaitez modifier: \n [1] Changer le nom \n [2] Changer le prénom. \n [3] Changer le nuémro de téléphone. [4] Changer la date de naissance. \n [5] Changer la date d'embauche. [6] Modifier les informations du salaire.");
            		int choix1 = sc.nextInt();
            		sc.nextLine();
            		
            		if (choix1 == 1) { 
            			employe.SetNom();
            		}
            		else if (choix1 ==2) {
            			employe.SetPrenom();
            		}
            		else if (choix1 ==3 ) {
            			employe.SetTelephone();
            		}
            		else if (choix1 ==4) {
            			employe.SetNaissance();
            		}
            		else if (choix1==5) {
            			employe.SetEmbauche();
            		}
            		else if (choix1 == 6) {
            			
            		employe.SetNbUnit();
            		employe.CalculSalaire();
	        		employe.SalairePrime();
	        		
            		}
            		else {
            			}
            		
            	
            		System.out.println("Souhaitez-vous modifier une autre information ? \n [1] Oui \n [2] Non.");
            		int choix2 = sc.nextInt();
            		sc.nextLine();
            		
            		if (choix2==1) {
            			valeur =0;
            		}
            		else if (choix2==2) {
            			valeur =1;
            		}
            		
            }while (valeur==0);
            	
            		op =true;
            		break;
        	}
       }
    }
        if(!op) {
        	System.out.println("Le profil de cet employé n'existe pas.");
        }
 }
        

    public static void AfficherInfo() {

        System.out.println("Saisissez le nom de l'employé à afficher les informations: ");
        String Nom = sc.nextLine();
        
        boolean op = false; //gestion de l'erreur si le nom de l'employé rentré n'existe pas
        
        for(int i=0; i < Employe.ListEmployes.size(); i++) {
        	
        	Employe employe = Employe.ListEmployes.get(i);
        	
        	if(employe.nom.contentEquals(Nom)) { 
        		
        		System.out.println(employe.nom);
        		
        		employe.GetNom();
        		employe.GetPrenom();
        		employe.GetTelephone();
        		employe.GetNaissance();
        		employe.GetEmbauche();
        		employe.GetSalaire();
        		employe.GetSalairePrime();
        		
        		op = true;
        		break;
        	}
        }
            if(!op) {
            	System.out.println("Le profil de cet employé n'existe pas.");
            }

      }
    
    
    public static void SupprimerEmploye() {
    	
        System.out.println("Saisissez le nom de l'employé à supprimer:");
        String Nom = sc.nextLine();
        
        boolean op = false;
        
        for(int i=0; i < Employe.ListEmployes.size(); i++) {
        	
        	Employe employe = Employe.ListEmployes.get(i);        		
       	
        	if(employe.nom.contentEquals(Nom)) {
        		
            	System.out.println(employe.prenom);
        		Employe.ListEmployes.remove(i);
        		op = true;
        		break;
        	}
        }
        if (!op) {
        	System.out.println("Le profil de cet employé n'existe pas.");
        }
     }
    
    
    public static void CalculSalaireMoyen() {
    	
    	double somme = 0;
    	
    	for(int i=0; i < Employe.ListEmployes.size(); i++) {
    		
        	Employe employe = Employe.ListEmployes.get(i);
        	somme = (employe.SalairePrime + somme) ; //on ajoute à chaque itération les salaires de chaque employé

    	}
    	
    	double salairemoyen = somme/Employe.ListEmployes.size();
    	System.out.println(salairemoyen);
    }
    
    
    public static void PrimeAnciennete() {

        System.out.println("Saisissez le nom de l'employé à qui calculer sa prime d'ancienneté.");
        String Nom = sc.nextLine();
        
        boolean op = false;
        
        for(int i=0; i < Employe.ListEmployes.size(); i++) {
        	
        	Employe employe = Employe.ListEmployes.get(i);
        	long annee = employe.anciennete;
        	
        	if(employe.nom.contentEquals(Nom)) { 
        		
        		if(annee < 5) {
        			System.out.println("L'employé peut accéder à une prime d'ancienneté s'élevant à 2%. \n");
        		}
        		else {
        			System.out.println("L'employé peut accéder à une prime d'ancienneté s'élevant à 7% \n");
        		}
        		
        		op = true;
        		break;
        	}
        }
        if(!op) {
        	
        	System.out.println("Le profil de cet employé n'existe pas.");
        }
    }
    
    
}	


