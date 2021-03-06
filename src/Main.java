import com.calculPaye.EntrepriseJ;
import com.gravite.Bonjour;
import com.gravite.CalculateurChute;
import com.salleCinema.SalleCinema;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Exercice 1.1
        System.out.println("Exercice 1.1 : Bonjour <user> !\n");
        ArrayList<String> names = new ArrayList<>();
        names.add("Pascal");
        names.add("Michelle");
        names.add("Jérôme");

        Bonjour welcomer = new Bonjour();
        welcomer.printNames(names);
        System.out.print("\n\n");

        //Exercice 1.2
        System.out.println("Exercice 1.2 : Gravité calculateur de chute\n");

        CalculateurChute fall = new CalculateurChute(10, -9.81);
        System.out.println("Position avant chute : " + fall.getPositionInitiale()
                            +"\nPosition après chute : " + fall.positionApresChute(0, 0));
        System.out.println("\n\n");

        //Exercice 2
        System.out.println("Exercice 2 : Salle de cinéma\n");

        SalleCinema cine = new SalleCinema("The place beyond the pines", 200, 9);

        for(int i = 0; i < 100; i++) {
            cine.vendrePlace();
        }

        System.out.println(cine);
        System.out.println("\n\n");

        //Exercice 3
        System.out.println("Exercice 3 : Calcul de paye\n");

        EntrepriseJ ent = new EntrepriseJ();

        try{
            ent.main();
        } catch(final IllegalArgumentException ae) {
            System.err.println(ae.getMessage());
            ae.printStackTrace();
        } catch(final Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
