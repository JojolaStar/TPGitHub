import java.util.ArrayList;
import java.util.List;


public class ContactManager {
    public static List<Contact> gestionnaireContact= new ArrayList <>();
    public static void ajouterContact(Contact contact) {
        gestionnaireContact.add(contact);
    }
    public void afficherContacts() {
        for (Contact contact : gestionnaireContact) {
            System.out.println(contact.toString());
        }
    }
}
