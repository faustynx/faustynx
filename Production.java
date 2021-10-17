import java.util.Scanner;

public class Production extends Employe {
		
private Scanner sc = new Scanner(System.in);
	
    public Production() {
    }

    public int NbUnit;

    public void CalculSalaire() {
        Salaire = (double) 4*NbUnit;
    }

    public void SalairePrime() {
    	if(anciennete < 5) { //on récupère la variable "ancienneté" pour calculer le salaire avec la prime.
    		
        	SalairePrime = Salaire*1.02;
        }
    	
        else {
        	SalairePrime = Salaire*1.07;
        }
    }

    public void SetNbUnit() {
    	int unite = 0;
    	
        System.out.println("Combien d'unités ont été produites ce mois-ci?");
        unite = sc.nextInt();
        sc.nextLine();
        NbUnit = unite;
        
    }

    public void GetNbUnit() {
    }
}
