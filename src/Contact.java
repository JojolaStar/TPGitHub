public class Contact {
    protected String nom;
    protected String prenom;
    protected String numeroTelephone;
    protected String adresseMail ;

    public Contact(String nom, String prenom, String numeroTelephone, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseMail = adresseMail;
    }

    @Override
    public String toString() {
        return "Contact = nom :" + nom + '\'' +
                "prenom=" + prenom + '\'' +
                "numeroTelephone=" + numeroTelephone + '\'' +
                "adresseMail=" + adresseMail + '\'';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }
}
