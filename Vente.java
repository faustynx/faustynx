import java.util.Scanner;

public class Vente extends Employe {

	private Scanner sc = new Scanner(System.in);
	
    public Vente() {
    }

    private double ChifAff;
  
    public void CalculSalaire() {
        Salaire = (0.25*ChifAff + 400);
    }


    
    public void SalairePrime() {
        if(anciennete < 5) {
        	SalairePrime = Salaire*1.02;
        }
        else {
        	SalairePrime = Salaire*1.07;
        }
    }

    public void SetChifAff() {
    	
    	double chiffre=0;
    	
    	System.out.println("Insérez son chiffre d'affaire réalisé:");
        chiffre = sc.nextDouble();
        sc.nextLine();
        ChifAff = chiffre;
    }

    public void GetChifAff() {
    }
}
