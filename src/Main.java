public class Main {
    public static void main(String[] args) {
        Contact johanna = new Contact("Guichard", "Johanna", "0654321987", "johanna.guichard@hotmail.fr");
        Contact nerina = new Contact("Vaudelin", "Nérina", "0672109479", "n.vaudelin@orange.fr");
        Contact test = new Contact("Tintin", "Milou", "54664688", "njhi@lie.fr");


        ContactManager.gestionnaireContact.add(johanna);
        ContactManager.gestionnaireContact.add(nerina);
        ContactManager.gestionnaireContact.add(test);
        System.out.println(ContactManager.gestionnaireContact);

        ContactManager.supprimerContact(test);

        System.out.println(ContactManager.gestionnaireContact);

        ContactManager.modifierContact(0);

    }
}
