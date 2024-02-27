import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    public static List<Contact> gestionnaireContact= new ArrayList <>();

    public static void supprimerContact (Contact contact){

        gestionnaireContact.remove(contact);

    }

    public static void modifierContact (int indexContact){

        Scanner scan = new Scanner(System.in);
        String reponse = "";
        String nvllInfoContact = "";
        System.out.println("Quelle innformation souhaitez-vous modifier ? (nom, prenom, numeroTelephone, adresseMail");
        reponse = scan.nextLine();
        System.out.println(("Quelle est la nouvelle valeur de la donnée ? "));
        nvllInfoContact = scan.nextLine();

        switch (reponse) {
            case "nom":
                gestionnaireContact.get(indexContact).setNom(nvllInfoContact);
                break;
            case "prenom":
                gestionnaireContact.get(indexContact).setPrenom(nvllInfoContact);
                break;
            case "numeroTelephone":
                gestionnaireContact.get(indexContact).setNumeroTelephone(nvllInfoContact);
                break;
            case "adresseMail":
                gestionnaireContact.get(indexContact).setAdresseMail(nvllInfoContact);
                break;
            default:
                System.out.println("La réponse est invalide.");
        }

        System.out.println(gestionnaireContact);
    }

}
